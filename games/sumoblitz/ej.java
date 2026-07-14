/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.net.URL;

final class ej extends rq {
    static String field_g;
    private boolean field_e;
    private sk field_f;
    private boolean field_h;
    private oh field_j;
    static hr field_i;

    final boolean b(byte param0) {
        if (param0 > -8) {
            return false;
        }
        return ((ej) this).field_e;
    }

    final void a(int param0, int param1, int param2) {
        int var4 = 0;
        float var5 = 0.0f;
        int var6 = 0;
        float var7 = 0.0f;
        long var8 = 0L;
        if (!(!((ej) this).field_h)) {
            var4 = 1 << (3 & param2);
            var5 = (float)(1 << ((61 & param2) >> -1099653693)) / 32.0f;
            var6 = param1 & 65535;
            var7 = (float)((param1 & 213452) >> 1524125840) / 8.0f;
            var8 = ((ej) this).field_j.field_d;
            jaggl.OpenGL.glUniform1fARB(jaggl.OpenGL.glGetUniformLocationARB(var8, "time"), (float)(var4 * ((ej) this).field_b.field_kc % 40000) / 40000.0f);
            jaggl.OpenGL.glUniform1fARB(jaggl.OpenGL.glGetUniformLocationARB(var8, "scale"), var5);
            jaggl.OpenGL.glUniform1fARB(jaggl.OpenGL.glGetUniformLocationARB(var8, "breakWaterDepth"), (float)var6);
            jaggl.OpenGL.glUniform1fARB(jaggl.OpenGL.glGetUniformLocationARB(var8, "breakWaterOffset"), var7);
        }
        if (param0 != 34023) {
            int discarded$0 = ej.a(-97, -68, (byte[]) null, (byte[][]) null, (int[]) null, (byte) 113, (byte[][]) null, (int[]) null);
        }
    }

    public static void d(boolean param0) {
        if (param0) {
            field_g = null;
        }
        field_g = null;
        field_i = null;
    }

    ej(on param0, ki param1, sk param2) {
        super((aw) (Object) param0);
        qj var4 = null;
        qj var5 = null;
        qj var6 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        Object stackOut_4_0 = null;
        Object stackOut_5_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        L0: {
          L1: {
            ((ej) this).field_f = param2;
            if (param1 == null) {
              break L1;
            } else {
              if (!param0.field_Jc) {
                break L1;
              } else {
                if (param0.field_Mc) {
                  L2: {
                    L3: {
                      var6 = su.a(35633, param0, param1.a("environment_mapped_water_v", "gl", -1), -124);
                      var4 = var6;
                      var5 = su.a(35632, param0, param1.a("environment_mapped_water_f", "gl", -1), -115);
                      ((ej) this).field_j = ht.a(new qj[2], param0, (byte) 109);
                      stackOut_4_0 = this;
                      stackIn_7_0 = stackOut_4_0;
                      stackIn_5_0 = stackOut_4_0;
                      if (((ej) this).field_j == null) {
                        break L3;
                      } else {
                        stackOut_5_0 = this;
                        stackIn_7_0 = stackOut_5_0;
                        stackIn_6_0 = stackOut_5_0;
                        if (!((ej) this).field_f.a(-128)) {
                          break L3;
                        } else {
                          stackOut_6_0 = this;
                          stackOut_6_1 = 1;
                          stackIn_8_0 = stackOut_6_0;
                          stackIn_8_1 = stackOut_6_1;
                          break L2;
                        }
                      }
                    }
                    stackOut_7_0 = this;
                    stackOut_7_1 = 0;
                    stackIn_8_0 = stackOut_7_0;
                    stackIn_8_1 = stackOut_7_1;
                    break L2;
                  }
                  ((ej) this).field_e = stackIn_8_1 != 0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
          }
          ((ej) this).field_e = false;
          break L0;
        }
    }

    final void a(boolean param0, byte param1) {
        if (param1 > -71) {
            ((ej) this).a(false, 82);
        }
    }

    final void a(int param0, int param1, ed param2) {
        if (!(((ej) this).field_h)) {
            ((ej) this).field_b.a(param2, param1 ^ 18943);
            ((ej) this).field_b.h(122, param0);
        }
        if (param1 != 18834) {
            java.net.URL discarded$0 = ej.a((java.net.URL) null, (String) null, -103, (String) null, 108);
        }
    }

    final void a(boolean param0, int param1) {
        long var4 = 0L;
        ef var3 = ((ej) this).field_b.d((byte) 122);
        if (param1 != 20186) {
            java.net.URL discarded$0 = ej.a((java.net.URL) null, (String) null, -110, (String) null, 111);
        }
        if (((ej) this).field_e) {
            if (!(var3 == null)) {
                ((ej) this).field_b.g(1, param1 ^ -20137);
                ((ej) this).field_b.a((ed) (Object) var3, 122);
                ((ej) this).field_b.g(0, -125);
                ((ej) this).field_b.a((ed) (Object) ((ej) this).field_f.field_e, 127);
                var4 = ((ej) this).field_j.field_d;
                jaggl.OpenGL.glUseProgramObjectARB(var4);
                jaggl.OpenGL.glUniform1iARB(jaggl.OpenGL.glGetUniformLocationARB(var4, "normalSampler"), 0);
                jaggl.OpenGL.glUniform1iARB(jaggl.OpenGL.glGetUniformLocationARB(var4, "envMapSampler"), 1);
                jaggl.OpenGL.glUniform3fARB(jaggl.OpenGL.glGetUniformLocationARB(var4, "sunDir"), -((ej) this).field_b.field_G[0], -((ej) this).field_b.field_G[1], -((ej) this).field_b.field_G[2]);
                jaggl.OpenGL.glUniform4fARB(jaggl.OpenGL.glGetUniformLocationARB(var4, "sunColour"), ((ej) this).field_b.field_J, ((ej) this).field_b.field_jb, ((ej) this).field_b.field_Xb, 1.0f);
                jaggl.OpenGL.glUniform1fARB(jaggl.OpenGL.glGetUniformLocationARB(var4, "sunExponent"), 96.0f + Math.abs(((ej) this).field_b.field_G[1]) * 928.0f);
                ((ej) this).field_h = true;
            }
        }
    }

    final void c(boolean param0) {
        if (param0) {
            ((ej) this).field_j = null;
        }
        if (((ej) this).field_h) {
            ((ej) this).field_b.g(1, -124);
            ((ej) this).field_b.a((ed) null, 106);
            ((ej) this).field_b.g(0, -109);
            ((ej) this).field_b.a((ed) null, 98);
            jaggl.OpenGL.glUseProgramObjectARB(0L);
            ((ej) this).field_h = false;
        }
    }

    final static java.net.URL a(java.net.URL param0, String param1, int param2, String param3, int param4) {
        try {
            String var5 = null;
            int var6 = 0;
            int var7_int = 0;
            StringBuilder var7 = null;
            Exception var8 = null;
            int var9 = 0;
            java.net.URL stackIn_39_0 = null;
            Throwable decompiledCaughtException = null;
            java.net.URL stackOut_38_0 = null;
            var9 = Sumoblitz.field_L ? 1 : 0;
            var5 = param0.getFile();
            var6 = 0;
            L0: while (true) {
              L1: {
                L2: {
                  if (var5.regionMatches(var6, "/l=", 0, 3)) {
                    var7_int = var5.indexOf('/', var6 - -1);
                    if (var7_int < 0) {
                      break L2;
                    } else {
                      if (-1 < (param2 ^ -1)) {
                        break L1;
                      } else {
                        var5 = var5.substring(0, var6) + var5.substring(var7_int);
                        continue L0;
                      }
                    }
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (var5.regionMatches(var6, "/a=", 0, 3)) {
                    var7_int = var5.indexOf('/', 1 + var6);
                    if (0 <= var7_int) {
                      break L1;
                    } else {
                      break L3;
                    }
                  } else {
                    break L3;
                  }
                }
                L4: {
                  if (!var5.regionMatches(var6, "/p=", 0, 3)) {
                    break L4;
                  } else {
                    var7_int = var5.indexOf('/', var6 + 1);
                    if (0 > var7_int) {
                      break L4;
                    } else {
                      if (param3 != null) {
                        var5 = var5.substring(0, var6) + var5.substring(var7_int);
                        continue L0;
                      } else {
                        var6 = var7_int;
                        continue L0;
                      }
                    }
                  }
                }
                L5: {
                  L6: {
                    if (var5.regionMatches(var6, "/s=", 0, 3)) {
                      break L6;
                    } else {
                      if (!var5.regionMatches(var6, "/c=", 0, 3)) {
                        break L5;
                      } else {
                        break L6;
                      }
                    }
                  }
                  var7_int = var5.indexOf('/', var6 - -1);
                  if (-1 < (var7_int ^ -1)) {
                    break L5;
                  } else {
                    if (param1 != null) {
                      var5 = var5.substring(0, var6) + var5.substring(var7_int);
                      continue L0;
                    } else {
                      var6 = var7_int;
                      continue L0;
                    }
                  }
                }
                L7: {
                  var7 = new StringBuilder(var6);
                  StringBuilder discarded$9 = var7.append(var5.substring(0, var6));
                  if (param4 > (param2 ^ -1)) {
                    StringBuilder discarded$10 = var7.append("/l=");
                    StringBuilder discarded$11 = var7.append(Integer.toString(param2));
                    break L7;
                  } else {
                    break L7;
                  }
                }
                L8: {
                  if (param3 == null) {
                    break L8;
                  } else {
                    if (param3.length() <= 0) {
                      break L8;
                    } else {
                      StringBuilder discarded$12 = var7.append("/p=");
                      StringBuilder discarded$13 = var7.append(param3);
                      break L8;
                    }
                  }
                }
                L9: {
                  if (param1 == null) {
                    break L9;
                  } else {
                    if (-1 > (param1.length() ^ -1)) {
                      StringBuilder discarded$14 = var7.append("/s=");
                      StringBuilder discarded$15 = var7.append(param1);
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                }
                L10: {
                  if (var5.length() > var6) {
                    StringBuilder discarded$16 = var7.append(var5.substring(var6, var5.length()));
                    break L10;
                  } else {
                    StringBuilder discarded$17 = var7.append(47);
                    break L10;
                  }
                }
                try {
                  stackOut_38_0 = new java.net.URL(param0, var7.toString());
                  stackIn_39_0 = stackOut_38_0;
                } catch (java.lang.Exception decompiledCaughtParameter) {
                  decompiledCaughtException = decompiledCaughtParameter;
                  return stackIn_39_0;
                }
              }
              var6 = var7_int;
              continue L0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static int a(int param0, int param1, byte[] param2, byte[][] param3, int[] param4, byte param5, byte[][] param6, int[] param7) {
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        byte[] var15 = null;
        byte[] var16 = null;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        L0: {
          var21 = Sumoblitz.field_L ? 1 : 0;
          var8 = param4[param0];
          var9 = var8 - -param7[param0];
          var10 = param4[param1];
          if (param5 == -75) {
            break L0;
          } else {
            ej.d(false);
            break L0;
          }
        }
        L1: {
          var11 = param7[param1] + var10;
          var12 = var8;
          if (var10 > var8) {
            var12 = var10;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          var13 = var9;
          if (var9 <= var11) {
            break L2;
          } else {
            var13 = var11;
            break L2;
          }
        }
        L3: {
          var14 = 255 & param2[param0];
          if ((param2[param1] & 255) < var14) {
            var14 = param2[param1] & 255;
            break L3;
          } else {
            break L3;
          }
        }
        var15 = param6[param0];
        var16 = param3[param1];
        var17 = -var8 + var12;
        var18 = var12 - var10;
        var19 = var12;
        L4: while (true) {
          if (var19 >= var13) {
            return -var14;
          } else {
            var17++;
            var18++;
            var20 = var15[var17] + var16[var18];
            if (var14 > var20) {
              var14 = var20;
              var19++;
              continue L4;
            } else {
              var19++;
              continue L4;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "Login: ";
    }
}
