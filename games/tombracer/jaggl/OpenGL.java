/*
 * Decompiled by CFR-JS 0.4.0.
 */
package jaggl;

import java.util.*;

public class OpenGL {
    private Hashtable a;
    long peer;
    private static Hashtable c;
    private Thread b;

    public final synchronized boolean a() {
        Thread var1 = null;
        jaggl.OpenGL var2 = null;
        var1 = Thread.currentThread();
        if (this.attachPeer()) {
          var2 = (jaggl.OpenGL) c.put((Object) (Object) var1, this);
          if (var2 != null) {
            var2.b = null;
            ((jaggl.OpenGL) this).b = var1;
            return true;
          } else {
            ((jaggl.OpenGL) this).b = var1;
            return true;
          }
        } else {
          return false;
        }
    }

    public final native void setSwapInterval(int param0);

    public final native static void glCopyTexImage2D(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7);

    public final native static void glFramebufferTexture2DEXT(int param0, int param1, int param2, int param3, int param4);

    public final native static void glStencilOp(int param0, int param1, int param2);

    public final boolean a(String param0) {
        String var2 = null;
        int var3 = 0;
        int var4_int = 0;
        String var4 = null;
        String var5 = null;
        if (null == ((jaggl.OpenGL) this).a) {
          ((jaggl.OpenGL) this).a = new Hashtable();
          var2 = OpenGL.glGetString(7939);
          var3 = 0;
          L0: while (true) {
            var4_int = var2.indexOf(' ', var3);
            if (var4_int == -1) {
              var4 = var2.substring(var3).trim();
              if (var4.length() != 0) {
                Object discarded$2 = ((jaggl.OpenGL) this).a.put((Object) (Object) var4, (Object) (Object) var4);
                return ((jaggl.OpenGL) this).a.containsKey((Object) (Object) param0);
              } else {
                return ((jaggl.OpenGL) this).a.containsKey((Object) (Object) param0);
              }
            } else {
              var5 = var2.substring(var3, var4_int).trim();
              var3 = var4_int + 1;
              if (0 != var5.length()) {
                Object discarded$3 = ((jaggl.OpenGL) this).a.put((Object) (Object) var5, (Object) (Object) var5);
                continue L0;
              } else {
                continue L0;
              }
            }
          }
        } else {
          return ((jaggl.OpenGL) this).a.containsKey((Object) (Object) param0);
        }
    }

    public final native static void glCullFace(int param0);

    public final native static void glShadeModel(int param0);

    public final native static void glTranslatef(float param0, float param1, float param2);

    public final native static void glDepthMask(boolean param0);

    public final native static void glAlphaFunc(int param0, float param1);

    public final native void release();

    public final native static void glAttachObjectARB(long param0, long param1);

    public final native static void glRotatef(float param0, float param1, float param2, float param3);

    public final native static void glBindProgramARB(int param0, int param1);

    public final native static void glDrawPixelsub(int param0, int param1, int param2, int param3, byte[] param4, int param5);

    final native static boolean glUnmapBufferARB(int param0);

    public final native static void glColor4ub(byte param0, byte param1, byte param2, byte param3);

    public final native static void glActiveTexture(int param0);

    public final native static void glGetObjectParameterivARB(long param0, int param1, int[] param2, int param3);

    public final native static void glScissor(int param0, int param1, int param2, int param3);

    public final native static void glGenerateMipmapEXT(int param0);

    public final native static void glPointSize(float param0);

    public final native static void glLoadMatrixf(float[] param0, int param1);

    public final native static void glDepthFunc(int param0);

    public final native void surfaceResized(long param0);

    public final native static void glDrawElements(int param0, int param1, int param2, long param3);

    public final native static void glHint(int param0, int param1);

    public final native static void glShaderSourceRawARB(long param0, byte[] param1);

    public final native static void glUniform1iARB(int param0, int param1);

    public final native static void glReadPixelsub(int param0, int param1, int param2, int param3, int param4, int param5, byte[] param6, int param7);

    public final native static void glProgramRawARB(int param0, int param1, byte[] param2);

    public final native static void glBindTexture(int param0, int param1);

    public final native static void glGetFloatv(int param0, float[] param1, int param2);

    public final native long createPbuffer(int param0, int param1);

    public final native static void glNormal3f(float param0, float param1, float param2);

    public final native static int glGetError();

    public final native static void glDeleteRenderbuffersEXT(int param0, int[] param1, int param2);

    public final native static void glCompileShaderARB(long param0);

    public final native static void glGetTexImageub(int param0, int param1, int param2, int param3, byte[] param4, int param5);

    public final native static void glProgramLocalParameter4fARB(int param0, int param1, float param2, float param3, float param4, float param5);

    public final native static void glProgramLocalParameter4fvARB(int param0, int param1, float[] param2, int param3);

    public final native static void glTexEnvi(int param0, int param1, int param2);

    public final native static void glBlendFunc(int param0, int param1);

    public final native static void glCopyTexSubImage3D(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8);

    public final native static void glRenderbufferStorageMultisampleEXT(int param0, int param1, int param2, int param3, int param4);

    public final native static void glDrawBuffer(int param0);

    public final native static void glFlush();

    public final native static void glColorMask(boolean param0, boolean param1, boolean param2, boolean param3);

    public final native static void glCopyTexSubImage2D(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7);

    public final native static void glMultiTexCoord2f(int param0, float param1, float param2);

    public final native static void glPixelStorei(int param0, int param1);

    public final native static void glLoadIdentity();

    public final native static void glLightf(int param0, int param1, float param2);

    public final native static void glDrawArrays(int param0, int param1, int param2);

    public final native static void glDetachObjectARB(long param0, long param1);

    public final native static void glMultiTexCoord2i(int param0, int param1, int param2);

    public final native static void glNormalPointer(int param0, int param1, long param2);

    public final native static void glDeleteProgramARB(int param0);

    public final native static void glEnd();

    public final native static void glPixelTransferf(int param0, float param1);

    public final native static void glClearColor(float param0, float param1, float param2, float param3);

    public final native static void glShaderSourceARB(long param0, String param1);

    public final native static void glViewport(int param0, int param1, int param2, int param3);

    public final native static void glColor3f(float param0, float param1, float param2);

    public final native static int glCheckFramebufferStatusEXT(int param0);

    public final native static void glDeleteLists(int param0, int param1);

    public final native static void glUseProgramObjectARB(long param0);

    public final native boolean setSurface(long param0);

    public final native static void glFinish();

    public final native static void glTexEnvfv(int param0, int param1, float[] param2, int param3);

    public final native static void glPushMatrix();

    public final native static void glCallList(int param0);

    public final native static void glGetProgramivARB(int param0, int param1, int[] param2, int param3);

    public final native static void glFogfv(int param0, float[] param1, int param2);

    public final native static void glPixelZoom(float param0, float param1);

    public final native static void glBindRenderbufferEXT(int param0, int param1);

    public final native static void glTexImage2Dub(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, byte[] param8, int param9);

    public final native static void glTexCoord2i(int param0, int param1);

    public final native static void glStencilFunc(int param0, int param1, int param2);

    public final native static void glFramebufferRenderbufferEXT(int param0, int param1, int param2, int param3);

    public final native static void glUniform3fARB(int param0, float param1, float param2, float param3);

    public final native static void glBegin(int param0);

    public final native static void glTexImage3Dub(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, byte[] param9, int param10);

    public final native static void glTexImage2Df(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, float[] param8, int param9);

    public final native void releaseSurface(java.awt.Canvas param0, long param1);

    public final native static long glCreateShaderObjectARB(int param0);

    public final native long init(java.awt.Canvas param0, int param1, int param2, int param3, int param4, int param5, int param6);

    public final native static void glGenFramebuffersEXT(int param0, int[] param1, int param2);

    public final native static void glPushAttrib(int param0);

    public final native static void glTexCoord2f(float param0, float param1);

    public final native static void glUniform2fARB(int param0, float param1, float param2);

    public final native static void glOrtho(double param0, double param1, double param2, double param3, double param4, double param5);

    public final native void releasePbuffer(long param0);

    public final native static String glGetString(int param0);

    public final native static void glClearDepth(float param0);

    public final native static void glVertex3f(float param0, float param1, float param2);

    public final native static void glTexImage2Di(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int[] param8, int param9);

    public final native static void glLightfv(int param0, int param1, float[] param2, int param3);

    public final native static void glDisable(int param0);

    public final native static void glDeleteFramebuffersEXT(int param0, int[] param1, int param2);

    public final native static void glClear(int param0);

    public final native static void glColorMaterial(int param0, int param1);

    public final native static void glPolygonMode(int param0, int param1);

    public final native static void glTexCoord3i(int param0, int param1, int param2);

    public final native void swapBuffers();

    public final native static void glDisableClientState(int param0);

    public final native static void glTexGeni(int param0, int param1, int param2);

    public final native static void glDrawPixelsi(int param0, int param1, int param2, int param3, int[] param4, int param5);

    public final native static void glBufferDataARBub(int param0, int param1, byte[] param2, int param3, int param4);

    public final native static void glTexCoordPointer(int param0, int param1, int param2, long param3);

    public final native static void glTexParameterf(int param0, int param1, float param2);

    public final native static void glNewList(int param0, int param1);

    public final native static void glLineWidth(float param0);

    public final synchronized boolean b() {
        if (!(((jaggl.OpenGL) this).b == Thread.currentThread())) {
            return false;
        }
        this.detachPeer();
        Object discarded$0 = c.remove((Object) (Object) ((jaggl.OpenGL) this).b);
        ((jaggl.OpenGL) this).b = null;
        return true;
    }

    public final native static void glFogf(int param0, float param1);

    public final native static void glBindBufferARB(int param0, int param1);

    final native static long glMapBufferARB(int param0, int param1);

    public final native static int glGetUniformLocationARB(long param0, String param1);

    public final native static void glGenRenderbuffersEXT(int param0, int[] param1, int param2);

    public final native static void glProgramStringARB(int param0, int param1, String param2);

    public final native static void glPopAttrib();

    public final native static void glMultMatrixf(float[] param0, int param1);

    public final native static void glTexSubImage2Di(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int[] param8, int param9);

    public final native static long glCreateProgramObjectARB();

    public final native static void glClientActiveTexture(int param0);

    public final native static void glColor4f(float param0, float param1, float param2, float param3);

    public final native static int glGenLists(int param0);

    public final native static void glPopMatrix();

    public final native static void glVertexPointer(int param0, int param1, int param2, long param3);

    public final native static void glUniform1fARB(int param0, float param1);

    public final native static void glEnableClientState(int param0);

    public final native static void glUniformMatrix3fvARB(int param0, int param1, boolean param2, float[] param3, int param4);

    private final native void detachPeer();

    public final native static void glTexEnvf(int param0, int param1, float param2);

    public final native long prepareSurface(java.awt.Canvas param0);

    public final native static void glTexCoord3f(float param0, float param1, float param2);

    public final native static void glDeleteTextures(int param0, int[] param1, int param2);

    public final native static void glGenBuffersARB(int param0, int[] param1, int param2);

    public final native static void glColor3ub(byte param0, byte param1, byte param2);

    public final native static int glGenProgramARB();

    public final native static void glGetInfoLogARB(long param0, int param1, int[] param2, int param3, byte[] param4, int param5);

    public final native static void glTexSubImage2Df(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, float[] param8, int param9);

    public final native void setPbuffer(long param0);

    public final native boolean arePbuffersAvailable();

    public final native static void glReadBuffer(int param0);

    public final native static void glRasterPos2i(int param0, int param1);

    public final native static void glMatrixMode(int param0);

    public final native static void glVertex2f(float param0, float param1);

    public final native static void glBindFramebufferEXT(int param0, int param1);

    public final native static void glLightModelfv(int param0, float[] param1, int param2);

    public final native static void glTexImage1Dub(int param0, int param1, int param2, int param3, int param4, int param5, int param6, byte[] param7, int param8);

    public final native static void glMaterialfv(int param0, int param1, float[] param2, int param3);

    public final native static void glBufferDataARBa(int param0, int param1, long param2, int param3);

    public final native static void glLinkProgramARB(long param0);

    public final native static void glBufferSubDataARBa(int param0, int param1, int param2, long param3);

    public final native static void glCopyPixels(int param0, int param1, int param2, int param3, int param4);

    public final native static void glBufferSubDataARBub(int param0, int param1, int param2, byte[] param3, int param4);

    public final native static void glRenderbufferStorageEXT(int param0, int param1, int param2, int param3);

    public final native static void glTexParameteri(int param0, int param1, int param2);

    private final native boolean attachPeer();

    public final native static void glEnable(int param0);

    public final native static void glDrawBuffersARB(int param0, int[] param1, int param2);

    public final native static void glDeleteBuffersARB(int param0, int[] param1, int param2);

    public final native static void glUniformMatrix2fvARB(int param0, int param1, boolean param2, float[] param3, int param4);

    public final native static void glDeleteObjectARB(long param0);

    public final native static void glReadPixelsi(int param0, int param1, int param2, int param3, int param4, int param5, int[] param6, int param7);

    public final native static void glGetTexImagei(int param0, int param1, int param2, int param3, int[] param4, int param5);

    public final native static void glBlitFramebufferEXT(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9);

    public final native static void glColorPointer(int param0, int param1, int param2, long param3);

    public final native static void glScalef(float param0, float param1, float param2);

    public final native static void glUniformMatrix4fvARB(int param0, int param1, boolean param2, float[] param3, int param4);

    public final native static void glVertex2i(int param0, int param1);

    public final native static void glFogi(int param0, int param1);

    public final native static void glEndList();

    public final native static void glGenTextures(int param0, int[] param1, int param2);

    public final native static void glMultiTexCoord3i(int param0, int param1, int param2, int param3);

    public final native static void glFrustum(double param0, double param1, double param2, double param3, double param4, double param5);

    public final native static void glFramebufferTexture3DEXT(int param0, int param1, int param2, int param3, int param4, int param5);

    public final native static void glUniform4fARB(int param0, float param1, float param2, float param3, float param4);

    public final native static void glGetIntegerv(int param0, int[] param1, int param2);

    public final native static void glTexGenfv(int param0, int param1, float[] param2, int param3);

    public final native static void glTexSubImage2Dub(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, byte[] param8, int param9);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        c = new Hashtable();
    }
}
