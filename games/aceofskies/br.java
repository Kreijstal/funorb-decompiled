/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

final class br extends oe implements java.awt.image.ImageProducer {
    private java.awt.image.ColorModel field_l;
    private java.awt.image.ImageConsumer field_k;
    private java.awt.Canvas field_i;
    private java.awt.Image field_j;

    public final void startProduction(java.awt.image.ImageConsumer param0) {
        ((br) this).addConsumer(param0);
    }

    private final synchronized void a(int param0, int param1, int param2, int param3, boolean param4) {
        if (((br) this).field_k == null) {
            return;
        }
        ((br) this).field_k.setPixels(param1, param3, param2, param0, ((br) this).field_l, ((br) this).field_e, ((br) this).field_g * param3 + param1, ((br) this).field_g);
        if (param4) {
            return;
        }
        ((br) this).field_k.imageComplete(2);
    }

    public final synchronized void removeConsumer(java.awt.image.ImageConsumer param0) {
        if (!(param0 != ((br) this).field_k)) {
            ((br) this).field_k = null;
        }
    }

    private final synchronized void e(int param0) {
        if (param0 > -101) {
            ((br) this).field_k = (java.awt.image.ImageConsumer) null;
        }
        if (!(null != ((br) this).field_k)) {
            return;
        }
        ((br) this).field_k.setPixels(0, 0, ((br) this).field_g, ((br) this).field_h, ((br) this).field_l, ((br) this).field_e, 0, ((br) this).field_g);
        ((br) this).field_k.imageComplete(2);
    }

    final void a(int param0, int param1, java.awt.Canvas param2, int param3) {
        ((br) this).field_i = param2;
        ((br) this).field_h = param3;
        ((br) this).field_g = param1;
        ((br) this).field_e = new int[((br) this).field_h * ((br) this).field_g];
        ((br) this).field_l = (java.awt.image.ColorModel) (Object) new java.awt.image.DirectColorModel(32, 16711680, 65280, 255);
        ((br) this).field_j = ((br) this).field_i.createImage((java.awt.image.ImageProducer) this);
        if (param0 != -12189) {
            aq[] var6 = (aq[]) null;
            in discarded$0 = br.a((wl) null, (aq[]) null, (byte) -2);
        }
        this.e(param0 + 12078);
        boolean discarded$1 = ((br) this).field_i.prepareImage(((br) this).field_j, (java.awt.image.ImageObserver) (Object) ((br) this).field_i);
        this.e(-113);
        boolean discarded$2 = ((br) this).field_i.prepareImage(((br) this).field_j, (java.awt.image.ImageObserver) (Object) ((br) this).field_i);
        this.e(-115);
        boolean discarded$3 = ((br) this).field_i.prepareImage(((br) this).field_j, (java.awt.image.ImageObserver) (Object) ((br) this).field_i);
    }

    final static in a(wl param0, aq[] param1, byte param2) {
        int var3_int = 0;
        long var3 = 0L;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        byte[] var11 = null;
        var3_int = 0;
        L0: while (true) {
          if (var3_int >= param1.length) {
            var3 = jaggl.OpenGL.glCreateProgramObjectARB();
            var5 = 0;
            L1: while (true) {
              if (param1.length <= var5) {
                L2: {
                  var6 = 70 % ((param2 - -51) / 47);
                  jaggl.OpenGL.glLinkProgramARB(var3);
                  jaggl.OpenGL.glGetObjectParameterivARB(var3, 35714, mh.field_l, 0);
                  if (0 != mh.field_l[0]) {
                    break L2;
                  } else {
                    L3: {
                      if (0 == mh.field_l[0]) {
                        System.out.println("Shader linking failed:");
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    L4: {
                      jaggl.OpenGL.glGetObjectParameterivARB(var3, 35716, mh.field_l, 1);
                      if (mh.field_l[1] <= 1) {
                        break L4;
                      } else {
                        var11 = new byte[mh.field_l[1]];
                        jaggl.OpenGL.glGetInfoLogARB(var3, mh.field_l[1], mh.field_l, 0, var11, 0);
                        System.out.println(new String(var11));
                        break L4;
                      }
                    }
                    if (mh.field_l[0] == 0) {
                      var7 = 0;
                      var5 = var7;
                      L5: while (true) {
                        if (param1.length <= var7) {
                          jaggl.OpenGL.glDeleteObjectARB(var3);
                          return null;
                        } else {
                          jaggl.OpenGL.glDetachObjectARB(var3, param1[var7].field_a);
                          var7++;
                          continue L5;
                        }
                      }
                    } else {
                      break L2;
                    }
                  }
                }
                return new in(param0, var3, param1);
              } else {
                jaggl.OpenGL.glAttachObjectARB(var3, param1[var5].field_a);
                var5++;
                continue L1;
              }
            }
          } else {
            if (param1[var3_int] != null) {
              if (0L < param1[var3_int].field_a) {
                var3_int++;
                continue L0;
              } else {
                return null;
              }
            } else {
              return null;
            }
          }
        }
    }

    public final void requestTopDownLeftRightResend(java.awt.image.ImageConsumer param0) {
    }

    final void a(int param0, int param1, int param2, int param3, int param4, java.awt.Graphics param5, int param6, int param7) {
        int var10 = -117 / ((param4 - 65) / 59);
        this.a(param3, param6, param0, param1, false);
        java.awt.Shape var9 = param5.getClip();
        param5.clipRect(param2, param7, param0, param3);
        boolean discarded$0 = param5.drawImage(((br) this).field_j, param2 - param6, -param1 + param7, (java.awt.image.ImageObserver) (Object) ((br) this).field_i);
        param5.setClip(var9);
    }

    public final synchronized boolean isConsumer(java.awt.image.ImageConsumer param0) {
        return ((br) this).field_k == param0;
    }

    final static String a(Throwable param0, byte param1) throws IOException {
        String var2 = null;
        PrintWriter var4 = null;
        String var5 = null;
        BufferedReader var6 = null;
        String var7 = null;
        String var8 = null;
        int var9 = 0;
        int var10 = 0;
        String var11 = null;
        int var12 = 0;
        int var13 = 0;
        ak var14 = null;
        StringWriter var15 = null;
        String var16 = null;
        String var17 = null;
        String var18 = null;
        String var19 = null;
        L0: {
          var13 = AceOfSkies.field_G ? 1 : 0;
          if (param0 instanceof ak) {
            var14 = (ak) param0;
            var2 = ((ak) var14).field_a + " | ";
            var11 = var2;
            var2 = var11;
            var11 = var2;
            param0 = ((ak) var14).field_c;
            break L0;
          } else {
            var2 = "";
            break L0;
          }
        }
        var15 = new StringWriter();
        var4 = new PrintWriter((Writer) (Object) var15);
        param0.printStackTrace(var4);
        var4.close();
        var5 = var15.toString();
        var11 = var5;
        var2 = var11;
        var11 = var5;
        var6 = new BufferedReader((Reader) (Object) new StringReader(var5));
        var7 = var6.readLine();
        var11 = var7;
        var2 = var11;
        var11 = var7;
        L1: while (true) {
          var8 = var6.readLine();
          var11 = var8;
          var2 = var11;
          var11 = var8;
          if (var8 != null) {
            L2: {
              var9 = var8.indexOf('(');
              var10 = var8.indexOf(')', var9 - -1);
              if (-1 != var9) {
                var11 = var8.substring(0, var9);
                var2 = var11;
                var2 = var11;
                break L2;
              } else {
                var11 = var8;
                break L2;
              }
            }
            L3: {
              var16 = var11.trim();
              var2 = var16;
              var2 = var16;
              var17 = var16.substring(var16.lastIndexOf(' ') + 1);
              var2 = var17;
              var2 = var17;
              var18 = var17.substring(var17.lastIndexOf('\t') - -1);
              var2 = var18;
              var2 = var18;
              var19 = var2 + var18;
              var2 = var19;
              var2 = var19;
              if (-1 == var9) {
                break L3;
              } else {
                if (-1 != var10) {
                  var12 = var8.indexOf(".java:", var9);
                  if (var12 < 0) {
                    break L3;
                  } else {
                    var2 = var19 + var8.substring(var12 - -5, var10);
                    break L3;
                  }
                } else {
                  var2 = var2 + 32;
                  continue L1;
                }
              }
            }
            var2 = var2 + 32;
            continue L1;
          } else {
            if (param1 == -29) {
              var2 = var2 + "| " + var7;
              return var2;
            } else {
              return (String) null;
            }
          }
        }
    }

    final static void f(int param0) {
        fp var1 = (fp) ks.field_d.d(268435455);
        if (var1 == null) {
            te.b(true);
            return;
        }
        if (param0 <= 88) {
            return;
        }
        dl var2 = nm.field_c;
        int discarded$0 = var2.a((byte) 115);
        int discarded$1 = var2.a((byte) 107);
        int discarded$2 = var2.a((byte) 113);
        int discarded$3 = var2.a((byte) 109);
        var1.c(-125);
    }

    public final synchronized void addConsumer(java.awt.image.ImageConsumer param0) {
        ((br) this).field_k = param0;
        ((java.awt.image.ImageConsumer) param0).setDimensions(((br) this).field_g, ((br) this).field_h);
        ((java.awt.image.ImageConsumer) param0).setProperties((Hashtable) null);
        ((java.awt.image.ImageConsumer) param0).setColorModel(((br) this).field_l);
        ((java.awt.image.ImageConsumer) param0).setHints(14);
    }

    br() {
    }

    static {
    }
}
