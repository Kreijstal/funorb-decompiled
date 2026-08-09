/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gl extends qe {
    private aaa field_c;
    private tla field_d;

    final static String a(byte param0, String param1, String[] param2) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        String stackIn_16_0 = null;
        String stackIn_30_0 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        StringBuilder stackIn_36_1 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_37_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        StringBuilder var6 = null;
        String var7_ref_String = null;
        int var7 = 0;
        int var8 = 0;
        String var9 = null;
        int var10 = 0;
        int var11 = 0;
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
                  if (sqa.a((CharSequence) ((Object) var7_ref_String), -3)) {
                    if (var3_int <= var5) {
                      continue L1;
                    } else {
                      if (62 == param1.charAt(var5)) {
                        var5++;
                        var8 = jb.a((CharSequence) ((Object) var7_ref_String), (byte) 70);
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
                    if ((var8 ^ -1) <= -1) {
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
                        if (sqa.a((CharSequence) ((Object) var9), -3)) {
                          if (var3_int <= var5) {
                            continue L4;
                          } else {
                            if (62 == param1.charAt(var5)) {
                              var5++;
                              var10 = jb.a((CharSequence) ((Object) var9), (byte) 70);
                              discarded$0 = var6.append(param1.substring(var7, var8));
                              discarded$1 = var6.append(param2[var10]);
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
                      discarded$2 = var6.append(param1.substring(var7));
                      stackIn_30_0 = var6.toString();
                      decompiledRegionSelector0 = 1;
                      break L0;
                    }
                  }
                } else {
                  stackIn_16_0 = (String) null;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackIn_33_0 = (RuntimeException) (var3);

            stackIn_33_1 = new StringBuilder().append("gl.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_34_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "null";
              break L7;
            } else {
              stackIn_34_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_36_1 = ((StringBuilder) (Object) stackIn_34_1).append(stackIn_34_2).append(',');

            if (param2 == null) {
              stackIn_34_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackIn_37_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackIn_37_2 = "null";
              break L8;
            } else {
              stackIn_34_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackIn_37_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackIn_37_2 = "{...}";
              break L8;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_34_0), stackIn_37_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_16_0;
        } else {
          return stackIn_30_0;
        }
    }

    final boolean b(int param0) {
        if (param0 != -11921) {
            this.field_d = (tla) null;
            return true;
        }
        return true;
    }

    final void a(int param0, int param1, kl param2) {
        try {
            this.field_a.a(true, param2);
            this.field_a.d(1, param0);
            if (param1 != 32221) {
                this.field_c = (aaa) null;
            }
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "gl.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(boolean param0, boolean param1, byte param2) {
        String var5 = (String) null;
        ag.a(param0, param1, false, (String) null);
        if (param2 < 87) {
            String[] var4 = (String[]) null;
            gl.a((byte) -98, (String) null, (String[]) null);
        }
    }

    final void b(boolean param0, int param1) {
        if (param1 <= 77) {
            this.field_c = (aaa) null;
        }
    }

    final void a(int param0, int param1, int param2) {
        float stackIn_5_0 = 0.0f;
        int stackIn_8_0 = 0;
        float var4;
        float var5;
        float var6;
        int var7;
        int var8;
        int var9;
        L0: {
          var9 = TombRacer.field_G ? 1 : 0;
          if (param2 > 117) {
            break L0;
          } else {
            this.a(true);
            break L0;
          }
        }
        L1: {
          var4 = -0.0005000000237487257f * (float)((param0 & 3) - -1);
          var5 = 0.0005000000237487257f * (float)((3 & param0 >> -961790941) - -1);
          if (-1 == (64 & param0 ^ -1)) {
            stackIn_5_0 = 0.00048828125f;
            break L1;
          } else {
            stackIn_5_0 = 0.0009765625f;
            break L1;
          }
        }
        L2: {
          var6 = stackIn_5_0;
          if (-1 == (param0 & 128 ^ -1)) {
            stackIn_8_0 = 0;
            break L2;
          } else {
            stackIn_8_0 = 1;
            break L2;
          }
        }
        L3: {
          var7 = stackIn_8_0;
          this.field_a.e(1, true);
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
          ka.field_b[3] = var4 * (float)this.field_a.field_Oc % 1.0f;
          jaggl.OpenGL.glTexGenfv(8193, 9474, ka.field_b, 0);
          if (!this.field_c.field_g) {
            var8 = (int)(16.0f * (var5 * (float)this.field_a.field_Oc));
            this.field_a.a(true, this.field_c.field_i[var8 % 16]);
            break L4;
          } else {
            ka.field_b[3] = var5 * (float)this.field_a.field_Oc % 1.0f;
            ka.field_b[1] = 0.0f;
            ka.field_b[2] = 0.0f;
            ka.field_b[0] = 0.0f;
            jaggl.OpenGL.glTexGenfv(8194, 9473, ka.field_b, 0);
            break L4;
          }
        }
        this.field_a.e(0, true);
    }

    final void a(boolean param0) {
        this.field_d.a(4864, '');
        if (param0) {
            return;
        }
        this.field_a.e(1, true);
        this.field_a.a(true, (kl) null);
        this.field_a.e(0, !param0 ? true : false);
    }

    gl(cka param0, aaa param1) {
        super(param0);
        try {
            this.field_c = param1;
            this.field_d = new tla(param0, 2);
            this.field_d.a((byte) 6, 0);
            this.field_a.e(1, true);
            if (this.field_c.field_g) {
                jaggl.OpenGL.glTexGeni(8194, 9472, 9217);
                jaggl.OpenGL.glEnable(3170);
            }
            jaggl.OpenGL.glTexGeni(8192, 9472, 9216);
            jaggl.OpenGL.glTexGeni(8193, 9472, 9216);
            jaggl.OpenGL.glEnable(3168);
            jaggl.OpenGL.glEnable(3169);
            this.field_a.e(0, true);
            this.field_d.b((byte) 77);
            this.field_d.a((byte) 6, 1);
            this.field_a.e(1, true);
            if (this.field_c.field_g) {
                jaggl.OpenGL.glDisable(3170);
            }
            jaggl.OpenGL.glDisable(3168);
            jaggl.OpenGL.glDisable(3169);
            this.field_a.e(0, true);
            this.field_d.b((byte) 10);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "gl.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(boolean param0, int param1) {
        this.field_d.a(4864, ' ');
        int var3 = -99 / ((56 - param1) / 48);
        if (!(!this.field_c.field_g)) {
            this.field_a.e(1, true);
            this.field_a.a(true, this.field_c.field_a);
            this.field_a.e(0, true);
        }
    }

    static {
    }
}
