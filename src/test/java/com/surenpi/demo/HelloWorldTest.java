package com.surenpi.demo;

import org.junit.Test;

import java.io.File;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.powermock.api.mockito.PowerMockito.mock;
import static org.powermock.api.mockito.PowerMockito.when;

public class HelloWorldTest
{
    @Test
    public void hello()
    {
        HelloWorld hello = mock(HelloWorld.class);
        hello.hello();
    }

    @Test
    public void fileExists()
    {
        File file = mock(File.class);
        when(file.exists()).thenReturn(true);

        HelloWorld hello = new HelloWorld();
        assertTrue(file.exists());
        assertTrue(hello.fileExists(file));
    }

    @Test
    public void word()
    {
        HelloWorld hello = mock(HelloWorld.class);
        when(hello.word()).thenReturn(null);
        assertNull(hello.word());
    }
}