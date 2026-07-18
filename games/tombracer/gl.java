/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gl extends qe {
    private aaa field_c;
    private tla field_d;

    final static String a(byte param0, String param1, String[] param2) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        StringBuilder var6 = null;
        int var7 = 0;
        String var7_ref_String = null;
        int var8 = 0;
        String var9 = null;
        int var10 = 0;
        int var11 = 0;
        Object stackIn_16_0 = null;
        String stackIn_30_0 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_37_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_29_0 = null;
        Object stackOut_15_0 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        var11 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var3_int = param1.length();
            var4 = var3_int;
            var5 = 0;
            L1: while (true) {
              var6_int = param1.indexOf("<%", var5);
              if (var6_int >= 0) {
                var5 = var6_int - -2;
                L2: while (true) {
                  L3: {
                    if (var3_int <= var5) {
                      break L3;
                    } else {
                      if (!dp.a(123, param1.charAt(var5))) {
                        break L3;
                      } else {
                        var5++;
                        continue L2;
                      }
                    }
                  }
                  var7_ref_String = param1.substring(2 + var6_int, var5);
                  if (sqa.a((CharSequence) (Object) var7_ref_String, -3)) {
                    if (var3_int <= var5) {
                      continue L1;
                    } else {
                      if (62 == param1.charAt(var5)) {
                        var5++;
                        var8 = jb.a((CharSequence) (Object) var7_ref_String, (byte) 70);
                        var4 = var4 + (param2[var8].length() + (-var5 + var6_int));
                        continue L1;
                      } else {
                        continue L1;
                      }
                    }
                  } else {
                    continue L1;
                  }
                }
              } else {
                var6 = new StringBuilder(var4);
                var7 = 0;
                var5 = 0;
                if (param0 >= 81) {
                  L4: while (true) {
                    var8 = param1.indexOf("<%", var5);
                    if (var8 >= 0) {
                      var5 = 2 + var8;
                      L5: while (true) {
                        L6: {
                          if (var5 >= var3_int) {
                            break L6;
                          } else {
                            if (!dp.a(113, param1.charAt(var5))) {
                              break L6;
                            } else {
                              var5++;
                              continue L5;
                            }
                          }
                        }
                        var9 = param1.substring(var8 - -2, var5);
                        if (sqa.a((CharSequence) (Object) var9, -3)) {
                          if (var3_int <= var5) {
                            continue L4;
                          } else {
                            if (62 == param1.charAt(var5)) {
                              var5++;
                              var10 = jb.a((CharSequence) (Object) var9, (byte) 70);
                              StringBuilder discarded$3 = var6.append(param1.substring(var7, var8));
                              StringBuilder discarded$4 = var6.append(param2[var10]);
                              var7 = var5;
                              continue L4;
                            } else {
                              continue L4;
                            }
                          }
                        } else {
                          continue L4;
                        }
                      }
                    } else {
                      StringBuilder discarded$5 = var6.append(param1.substring(var7));
                      stackOut_29_0 = var6.toString();
                      stackIn_30_0 = stackOut_29_0;
                      break L0;
                    }
                  }
                } else {
                  stackOut_15_0 = null;
                  stackIn_16_0 = stackOut_15_0;
                  return (String) (Object) stackIn_16_0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackOut_31_0 = (RuntimeException) var3;
            stackOut_31_1 = new StringBuilder().append("gl.C(").append(param0).append(',');
            stackIn_33_0 = stackOut_31_0;
            stackIn_33_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param1 == null) {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "null";
              stackIn_34_0 = stackOut_33_0;
              stackIn_34_1 = stackOut_33_1;
              stackIn_34_2 = stackOut_33_2;
              break L7;
            } else {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "{...}";
              stackIn_34_0 = stackOut_32_0;
              stackIn_34_1 = stackOut_32_1;
              stackIn_34_2 = stackOut_32_2;
              break L7;
            }
          }
          L8: {
            stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
            stackOut_34_1 = ((StringBuilder) (Object) stackIn_34_1).append(stackIn_34_2).append(',');
            stackIn_36_0 = stackOut_34_0;
            stackIn_36_1 = stackOut_34_1;
            stackIn_35_0 = stackOut_34_0;
            stackIn_35_1 = stackOut_34_1;
            if (param2 == null) {
              stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
              stackOut_36_1 = (StringBuilder) (Object) stackIn_36_1;
              stackOut_36_2 = "null";
              stackIn_37_0 = stackOut_36_0;
              stackIn_37_1 = stackOut_36_1;
              stackIn_37_2 = stackOut_36_2;
              break L8;
            } else {
              stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
              stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
              stackOut_35_2 = "{...}";
              stackIn_37_0 = stackOut_35_0;
              stackIn_37_1 = stackOut_35_1;
              stackIn_37_2 = stackOut_35_2;
              break L8;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_37_0, stackIn_37_2 + ')');
        }
        return stackIn_30_0;
    }

    final boolean b(int param0) {
        if (param0 != -11921) {
            ((gl) this).field_d = null;
            return true;
        }
        return true;
    }

    final void a(int param0, int param1, kl param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              ((gl) this).field_a.a(true, param2);
              ((gl) this).field_a.d(1, param0);
              if (param1 == 32221) {
                break L1;
              } else {
                ((gl) this).field_c = null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("gl.A(").append(param0).append(',').append(param1).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param2 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ')');
        }
    }

    final static void a(boolean param0, boolean param1, byte param2) {
        Object var5 = null;
        ag.a(param0, param1, false, (String) null);
        if (param2 < 87) {
            Object var4 = null;
            String discarded$0 = gl.a((byte) -98, (String) null, (String[]) null);
        }
    }

    final void b(boolean param0, int param1) {
        if (param1 <= 77) {
            ((gl) this).field_c = null;
        }
    }

    final void a(int param0, int param1, int param2) {
        float var4 = 0.0f;
        float var5 = 0.0f;
        float var6 = 0.0f;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        float stackIn_5_0 = 0.0f;
        int stackIn_8_0 = 0;
        float stackOut_4_0 = 0.0f;
        float stackOut_3_0 = 0.0f;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        L0: {
          var9 = TombRacer.field_G ? 1 : 0;
          if (param2 > 117) {
            break L0;
          } else {
            ((gl) this).a(true);
            break L0;
          }
        }
        L1: {
          var4 = -0.0005000000237487257f * (float)((param0 & 3) - -1);
          var5 = 0.0005000000237487257f * (float)((3 & param0 >> 3) - -1);
          if (-1 == (64 & param0)) {
            stackOut_4_0 = 0.00048828125f;
            stackIn_5_0 = stackOut_4_0;
            break L1;
          } else {
            stackOut_3_0 = 0.0009765625f;
            stackIn_5_0 = stackOut_3_0;
            break L1;
          }
        }
        L2: {
          var6 = stackIn_5_0;
          if (-1 == (param0 & 128)) {
            stackOut_7_0 = 0;
            stackIn_8_0 = stackOut_7_0;
            break L2;
          } else {
            stackOut_6_0 = 1;
            stackIn_8_0 = stackOut_6_0;
            break L2;
          }
        }
        L3: {
          var7 = stackIn_8_0;
          ((gl) this).field_a.e(1, true);
          if (var7 == 0) {
            ka.field_b[2] = var6;
            ka.field_b[0] = 0.0f;
            ka.field_b[3] = 0.0f;
            ka.field_b[1] = 0.0f;
            break L3;
          } else {
            ka.field_b[3] = 0.0f;
            ka.field_b[1] = 0.0f;
            ka.field_b[0] = var6;
            ka.field_b[2] = 0.0f;
            break L3;
          }
        }
        L4: {
          jaggl.OpenGL.glTexGenfv(8192, 9474, ka.field_b, 0);
          ka.field_b[2] = 0.0f;
          ka.field_b[1] = var6;
          ka.field_b[0] = 0.0f;
          ka.field_b[3] = var4 * (float)((gl) this).field_a.field_Oc % 1.0f;
          jaggl.OpenGL.glTexGenfv(8193, 9474, ka.field_b, 0);
          if (!((gl) this).field_c.field_g) {
            var8 = (int)(16.0f * (var5 * (float)((gl) this).field_a.field_Oc));
            ((gl) this).field_a.a(true, (kl) (Object) ((gl) this).field_c.field_i[var8 % 16]);
            break L4;
          } else {
            ka.field_b[3] = var5 * (float)((gl) this).field_a.field_Oc % 1.0f;
            ka.field_b[1] = 0.0f;
            ka.field_b[2] = 0.0f;
            ka.field_b[0] = 0.0f;
            jaggl.OpenGL.glTexGenfv(8194, 9473, ka.field_b, 0);
            break L4;
          }
        }
        ((gl) this).field_a.e(0, true);
    }

    final void a(boolean param0) {
        ((gl) this).field_d.a(4864, '');
        if (param0) {
            return;
        }
        ((gl) this).field_a.e(1, true);
        ((gl) this).field_a.a(true, (kl) null);
        ((gl) this).field_a.e(0, !param0 ? true : false);
    }

    gl(cka param0, aaa param1) {
        super(param0);
        try {
            ((gl) this).field_c = param1;
            ((gl) this).field_d = new tla(param0, 2);
            ((gl) this).field_d.a((byte) 6, 0);
            ((gl) this).field_a.e(1, true);
            if (((gl) this).field_c.field_g) {
                jaggl.OpenGL.glTexGeni(8194, 9472, 9217);
                jaggl.OpenGL.glEnable(3170);
            }
            jaggl.OpenGL.glTexGeni(8192, 9472, 9216);
            jaggl.OpenGL.glTexGeni(8193, 9472, 9216);
            jaggl.OpenGL.glEnable(3168);
            jaggl.OpenGL.glEnable(3169);
            ((gl) this).field_a.e(0, true);
            ((gl) this).field_d.b((byte) 77);
            ((gl) this).field_d.a((byte) 6, 1);
            ((gl) this).field_a.e(1, true);
            if (((gl) this).field_c.field_g) {
                jaggl.OpenGL.glDisable(3170);
            }
            jaggl.OpenGL.glDisable(3168);
            jaggl.OpenGL.glDisable(3169);
            ((gl) this).field_a.e(0, true);
            ((gl) this).field_d.b((byte) 10);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "gl.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(boolean param0, int param1) {
        ((gl) this).field_d.a(4864, ' ');
        int var3 = -99 / ((56 - param1) / 48);
        if (!(!((gl) this).field_c.field_g)) {
            ((gl) this).field_a.e(1, true);
            ((gl) this).field_a.a(true, (kl) (Object) ((gl) this).field_c.field_a);
            ((gl) this).field_a.e(0, true);
        }
    }

    static {
    }
}
