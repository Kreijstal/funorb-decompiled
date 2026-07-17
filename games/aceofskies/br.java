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
        try {
            ((br) this).addConsumer(param0);
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) (Object) runtimeException, "br.startProduction(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    private final synchronized void a(int param0, int param1, int param2, int param3, boolean param4) {
        if (((br) this).field_k == null) {
            return;
        }
        ((br) this).field_k.setPixels(param1, param3, param2, param0, ((br) this).field_l, ((br) this).field_e, ((br) this).field_g * param3 + param1, ((br) this).field_g);
        ((br) this).field_k.imageComplete(2);
    }

    public final synchronized void removeConsumer(java.awt.image.ImageConsumer param0) {
        RuntimeException var2 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == ((br) this).field_k) {
                ((br) this).field_k = null;
                break L1;
              } else {
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var2;
            stackOut_4_1 = new StringBuilder().append("br.removeConsumer(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 41);
        }
    }

    private final synchronized void e(int param0) {
        if (param0 > -101) {
            ((br) this).field_k = null;
        }
        if (!(null != ((br) this).field_k)) {
            return;
        }
        ((br) this).field_k.setPixels(0, 0, ((br) this).field_g, ((br) this).field_h, ((br) this).field_l, ((br) this).field_e, 0, ((br) this).field_g);
        ((br) this).field_k.imageComplete(2);
    }

    final void a(int param0, int param1, java.awt.Canvas param2, int param3) {
        try {
            ((br) this).field_i = param2;
            ((br) this).field_h = param3;
            ((br) this).field_g = param1;
            ((br) this).field_e = new int[((br) this).field_h * ((br) this).field_g];
            ((br) this).field_l = (java.awt.image.ColorModel) (Object) new java.awt.image.DirectColorModel(32, 16711680, 65280, 255);
            ((br) this).field_j = ((br) this).field_i.createImage((java.awt.image.ImageProducer) this);
            if (param0 != -12189) {
                Object var6 = null;
                in discarded$0 = br.a((wl) null, (aq[]) null, (byte) -2);
            }
            this.e(param0 + 12078);
            boolean discarded$1 = ((br) this).field_i.prepareImage(((br) this).field_j, (java.awt.image.ImageObserver) (Object) ((br) this).field_i);
            this.e(-113);
            boolean discarded$2 = ((br) this).field_i.prepareImage(((br) this).field_j, (java.awt.image.ImageObserver) (Object) ((br) this).field_i);
            this.e(-115);
            boolean discarded$3 = ((br) this).field_i.prepareImage(((br) this).field_j, (java.awt.image.ImageObserver) (Object) ((br) this).field_i);
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) (Object) runtimeException, "br.A(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 44 + param3 + 41);
        }
    }

    final static in a(wl param0, aq[] param1, byte param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        long var3_long = 0L;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        byte[] var11 = null;
        Object stackIn_23_0 = null;
        in stackIn_25_0 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_22_0 = null;
        in stackOut_24_0 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        try {
          L0: {
            var3_int = 0;
            L1: while (true) {
              if (var3_int >= param1.length) {
                var3_long = jaggl.OpenGL.glCreateProgramObjectARB();
                var5 = 0;
                L2: while (true) {
                  if (param1.length <= var5) {
                    L3: {
                      var6 = 70 % ((param2 - -51) / 47);
                      jaggl.OpenGL.glLinkProgramARB(var3_long);
                      jaggl.OpenGL.glGetObjectParameterivARB(var3_long, 35714, mh.field_l, 0);
                      if (0 != mh.field_l[0]) {
                        break L3;
                      } else {
                        L4: {
                          if (0 == mh.field_l[0]) {
                            System.out.println("Shader linking failed:");
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                        L5: {
                          jaggl.OpenGL.glGetObjectParameterivARB(var3_long, 35716, mh.field_l, 1);
                          if (mh.field_l[1] <= 1) {
                            break L5;
                          } else {
                            var11 = new byte[mh.field_l[1]];
                            jaggl.OpenGL.glGetInfoLogARB(var3_long, mh.field_l[1], mh.field_l, 0, var11, 0);
                            System.out.println(new String(var11));
                            break L5;
                          }
                        }
                        if (mh.field_l[0] == 0) {
                          var7 = 0;
                          var5 = var7;
                          L6: while (true) {
                            if (param1.length <= var7) {
                              jaggl.OpenGL.glDeleteObjectARB(var3_long);
                              stackOut_22_0 = null;
                              stackIn_23_0 = stackOut_22_0;
                              return (in) (Object) stackIn_23_0;
                            } else {
                              jaggl.OpenGL.glDetachObjectARB(var3_long, param1[var7].field_a);
                              var7++;
                              continue L6;
                            }
                          }
                        } else {
                          break L3;
                        }
                      }
                    }
                    stackOut_24_0 = new in(param0, var3_long, param1);
                    stackIn_25_0 = stackOut_24_0;
                    break L0;
                  } else {
                    jaggl.OpenGL.glAttachObjectARB(var3_long, param1[var5].field_a);
                    var5++;
                    continue L2;
                  }
                }
              } else {
                if (param1[var3_int] != null) {
                  if (0L < param1[var3_int].field_a) {
                    var3_int++;
                    continue L1;
                  } else {
                    return null;
                  }
                } else {
                  return null;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackOut_26_0 = (RuntimeException) var3;
            stackOut_26_1 = new StringBuilder().append("br.G(");
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param0 == null) {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L7;
            } else {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L7;
            }
          }
          L8: {
            stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
            stackOut_29_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_29_2).append(44);
            stackIn_31_0 = stackOut_29_0;
            stackIn_31_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param1 == null) {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L8;
            } else {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "{...}";
              stackIn_32_0 = stackOut_30_0;
              stackIn_32_1 = stackOut_30_1;
              stackIn_32_2 = stackOut_30_2;
              break L8;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_32_0, stackIn_32_2 + 44 + param2 + 41);
        }
        return stackIn_25_0;
    }

    public final void requestTopDownLeftRightResend(java.awt.image.ImageConsumer param0) {
    }

    final void a(int param0, int param1, int param2, int param3, int param4, java.awt.Graphics param5, int param6, int param7) {
        java.awt.Shape var9 = null;
        try {
            int var10 = -117 / ((param4 - 65) / 59);
            this.a(param3, param6, param0, param1, false);
            var9 = param5.getClip();
            param5.clipRect(param2, param7, param0, param3);
            boolean discarded$0 = param5.drawImage(((br) this).field_j, param2 - param6, -param1 + param7, (java.awt.image.ImageObserver) (Object) ((br) this).field_i);
            param5.setClip(var9);
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) (Object) runtimeException, "br.D(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + (param5 != null ? "{...}" : "null") + 44 + param6 + 44 + param7 + 41);
        }
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
            var14 = (ak) (Object) param0;
            var2 = var14.field_a + " | ";
            var11 = var2;
            param0 = var14.field_c;
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
        var2 = var5;
        var11 = var5;
        var6 = new BufferedReader((Reader) (Object) new StringReader(var5));
        var7 = var6.readLine();
        var2 = var7;
        var11 = var7;
        L1: while (true) {
          var8 = var6.readLine();
          var2 = var8;
          var11 = var8;
          var2 = var11;
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
            var2 = var11;
            var11 = var2;
            var2 = var11;
            var2 = var2 + "| " + var7;
            return var2;
          }
        }
    }

    final static void f(int param0) {
        fp var1 = (fp) (Object) ks.field_d.d(268435455);
        if (var1 == null) {
            te.b(true);
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
        try {
            ((br) this).field_k = param0;
            param0.setDimensions(((br) this).field_g, ((br) this).field_h);
            param0.setProperties((Hashtable) null);
            param0.setColorModel(((br) this).field_l);
            param0.setHints(14);
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) (Object) runtimeException, "br.addConsumer(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    br() {
    }

    static {
    }
}
