/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gl extends qe {
    private aaa field_c;
    private tla field_d;

    final static String a(byte param0, String param1, String[] param2) {
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        StringBuilder discarded$5 = null;
        RuntimeException var3 = null;
        int var3_int = 0;
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
        int stackIn_3_0 = 0;
        boolean stackIn_10_0 = false;
        String stackIn_23_0 = null;
        int stackIn_25_0 = 0;
        boolean stackIn_32_0 = false;
        String stackIn_44_0 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        String stackIn_48_2 = null;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        String stackIn_51_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        boolean stackOut_9_0 = false;
        int stackOut_24_0 = 0;
        String stackOut_43_0 = null;
        boolean stackOut_31_0 = false;
        String stackOut_22_0 = null;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        RuntimeException stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        String stackOut_47_2 = null;
        RuntimeException stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        String stackOut_46_2 = null;
        RuntimeException stackOut_48_0 = null;
        StringBuilder stackOut_48_1 = null;
        RuntimeException stackOut_50_0 = null;
        StringBuilder stackOut_50_1 = null;
        String stackOut_50_2 = null;
        RuntimeException stackOut_49_0 = null;
        StringBuilder stackOut_49_1 = null;
        String stackOut_49_2 = null;
        var11 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var3_int = param1.length();
            var4 = var3_int;
            var5 = 0;
            L1: while (true) {
              var6_int = param1.indexOf("<%", var5);
              stackOut_2_0 = var6_int;
              stackIn_3_0 = stackOut_2_0;
              L2: while (true) {
                L3: {
                  L4: {
                    L5: {
                      if (stackIn_3_0 >= 0) {
                        break L5;
                      } else {
                        if (var11 != 0) {
                          break L4;
                        } else {
                          if (var11 == 0) {
                            break L3;
                          } else {
                            break L5;
                          }
                        }
                      }
                    }
                    var5 = var6_int - -2;
                    break L4;
                  }
                  L6: while (true) {
                    L7: {
                      if (var3_int <= var5) {
                        break L7;
                      } else {
                        stackOut_9_0 = dp.a(123, param1.charAt(var5));
                        stackIn_3_0 = stackOut_9_0 ? 1 : 0;
                        stackIn_10_0 = stackOut_9_0;
                        if (var11 != 0) {
                          continue L2;
                        } else {
                          if (!stackIn_10_0) {
                            break L7;
                          } else {
                            var5++;
                            if (var11 == 0) {
                              continue L6;
                            } else {
                              break L7;
                            }
                          }
                        }
                      }
                    }
                    L8: {
                      var7_ref_String = param1.substring(2 + var6_int, var5);
                      if (sqa.a((CharSequence) ((Object) var7_ref_String), -3)) {
                        break L8;
                      } else {
                        if (var11 == 0) {
                          continue L1;
                        } else {
                          break L8;
                        }
                      }
                    }
                    L9: {
                      if (var3_int <= var5) {
                        break L9;
                      } else {
                        if (62 == param1.charAt(var5)) {
                          var5++;
                          var8 = jb.a((CharSequence) ((Object) var7_ref_String), (byte) 70);
                          var4 = var4 + (param2[var8].length() + (-var5 + var6_int));
                          break L9;
                        } else {
                          break L9;
                        }
                      }
                    }
                    if (var11 == 0) {
                      continue L1;
                    } else {
                      break L3;
                    }
                  }
                }
                var6 = new StringBuilder(var4);
                var7 = 0;
                var5 = 0;
                if (param0 >= 81) {
                  L10: while (true) {
                    var8 = param1.indexOf("<%", var5);
                    stackOut_24_0 = var8 ^ -1;
                    stackIn_25_0 = stackOut_24_0;
                    L11: while (true) {
                      L12: {
                        L13: {
                          if (stackIn_25_0 <= -1) {
                            break L13;
                          } else {
                            if (var11 != 0) {
                              break L12;
                            } else {
                              if (var11 == 0) {
                                discarded$3 = var6.append(param1.substring(var7));
                                stackOut_43_0 = var6.toString();
                                stackIn_44_0 = stackOut_43_0;
                                decompiledRegionSelector0 = 1;
                                break L0;
                              } else {
                                break L13;
                              }
                            }
                          }
                        }
                        var5 = 2 + var8;
                        break L12;
                      }
                      L14: while (true) {
                        L15: {
                          if (var5 >= var3_int) {
                            break L15;
                          } else {
                            stackOut_31_0 = dp.a(113, param1.charAt(var5));
                            stackIn_25_0 = stackOut_31_0 ? 1 : 0;
                            stackIn_32_0 = stackOut_31_0;
                            if (var11 != 0) {
                              continue L11;
                            } else {
                              if (!stackIn_32_0) {
                                break L15;
                              } else {
                                var5++;
                                continue L14;
                              }
                            }
                          }
                        }
                        var9 = param1.substring(var8 - -2, var5);
                        if (sqa.a((CharSequence) ((Object) var9), -3)) {
                          L16: {
                            if (var3_int <= var5) {
                              break L16;
                            } else {
                              if (62 == param1.charAt(var5)) {
                                var5++;
                                var10 = jb.a((CharSequence) ((Object) var9), (byte) 70);
                                discarded$4 = var6.append(param1.substring(var7, var8));
                                discarded$5 = var6.append(param2[var10]);
                                var7 = var5;
                                break L16;
                              } else {
                                break L16;
                              }
                            }
                          }
                          continue L10;
                        } else {
                          continue L10;
                        }
                      }
                    }
                  }
                } else {
                  stackOut_22_0 = (String) null;
                  stackIn_23_0 = stackOut_22_0;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L17: {
            var3 = decompiledCaughtException;
            stackOut_45_0 = (RuntimeException) (var3);
            stackOut_45_1 = new StringBuilder().append("gl.C(").append(param0).append(',');
            stackIn_47_0 = stackOut_45_0;
            stackIn_47_1 = stackOut_45_1;
            stackIn_46_0 = stackOut_45_0;
            stackIn_46_1 = stackOut_45_1;
            if (param1 == null) {
              stackOut_47_0 = (RuntimeException) ((Object) stackIn_47_0);
              stackOut_47_1 = (StringBuilder) ((Object) stackIn_47_1);
              stackOut_47_2 = "null";
              stackIn_48_0 = stackOut_47_0;
              stackIn_48_1 = stackOut_47_1;
              stackIn_48_2 = stackOut_47_2;
              break L17;
            } else {
              stackOut_46_0 = (RuntimeException) ((Object) stackIn_46_0);
              stackOut_46_1 = (StringBuilder) ((Object) stackIn_46_1);
              stackOut_46_2 = "{...}";
              stackIn_48_0 = stackOut_46_0;
              stackIn_48_1 = stackOut_46_1;
              stackIn_48_2 = stackOut_46_2;
              break L17;
            }
          }
          L18: {
            stackOut_48_0 = (RuntimeException) ((Object) stackIn_48_0);
            stackOut_48_1 = ((StringBuilder) (Object) stackIn_48_1).append(stackIn_48_2).append(',');
            stackIn_50_0 = stackOut_48_0;
            stackIn_50_1 = stackOut_48_1;
            stackIn_49_0 = stackOut_48_0;
            stackIn_49_1 = stackOut_48_1;
            if (param2 == null) {
              stackOut_50_0 = (RuntimeException) ((Object) stackIn_50_0);
              stackOut_50_1 = (StringBuilder) ((Object) stackIn_50_1);
              stackOut_50_2 = "null";
              stackIn_51_0 = stackOut_50_0;
              stackIn_51_1 = stackOut_50_1;
              stackIn_51_2 = stackOut_50_2;
              break L18;
            } else {
              stackOut_49_0 = (RuntimeException) ((Object) stackIn_49_0);
              stackOut_49_1 = (StringBuilder) ((Object) stackIn_49_1);
              stackOut_49_2 = "{...}";
              stackIn_51_0 = stackOut_49_0;
              stackIn_51_1 = stackOut_49_1;
              stackIn_51_2 = stackOut_49_2;
              break L18;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_51_0), stackIn_51_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_23_0;
        } else {
          return stackIn_44_0;
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
              this.field_a.a(true, param2);
              this.field_a.d(1, param0);
              if (param1 == 32221) {
                break L1;
              } else {
                this.field_c = (aaa) null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("gl.A(").append(param0).append(',').append(param1).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param2 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    final static void a(boolean param0, boolean param1, byte param2) {
        String discarded$2 = null;
        String[] var4 = null;
        String var5 = null;
        var5 = (String) null;
        ag.a(param0, param1, false, (String) null);
        if (param2 >= 87) {
          return;
        } else {
          var4 = (String[]) null;
          discarded$2 = gl.a((byte) -98, (String) null, (String[]) null);
          return;
        }
    }

    final void b(boolean param0, int param1) {
        if (param1 > 77) {
            return;
        }
        this.field_c = (aaa) null;
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
            this.a(true);
            break L0;
          }
        }
        L1: {
          var4 = -0.0005000000237487257f * (float)((param0 & 3) - -1);
          var5 = 0.0005000000237487257f * (float)((3 & param0 >> -961790941) - -1);
          if (-1 == (64 & param0 ^ -1)) {
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
          if (-1 == (param0 & 128 ^ -1)) {
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
          this.field_a.e(1, true);
          if (var7 == 0) {
            break L3;
          } else {
            ka.field_b[3] = 0.0f;
            ka.field_b[1] = 0.0f;
            ka.field_b[0] = var6;
            ka.field_b[2] = 0.0f;
            if (var9 == 0) {
              jaggl.OpenGL.glTexGenfv(8192, 9474, ka.field_b, 0);
              ka.field_b[2] = 0.0f;
              ka.field_b[1] = var6;
              ka.field_b[0] = 0.0f;
              ka.field_b[3] = var4 * (float)this.field_a.field_Oc % 1.0f;
              jaggl.OpenGL.glTexGenfv(8193, 9474, ka.field_b, 0);
              if (this.field_c.field_g) {
                ka.field_b[3] = var5 * (float)this.field_a.field_Oc % 1.0f;
                ka.field_b[1] = 0.0f;
                ka.field_b[2] = 0.0f;
                ka.field_b[0] = 0.0f;
                jaggl.OpenGL.glTexGenfv(8194, 9473, ka.field_b, 0);
                if (var9 != 0) {
                  var8 = (int)(16.0f * (var5 * (float)this.field_a.field_Oc));
                  this.field_a.a(true, this.field_c.field_i[var8 % 16]);
                  this.field_a.e(0, true);
                  return;
                } else {
                  this.field_a.e(0, true);
                  return;
                }
              } else {
                var8 = (int)(16.0f * (var5 * (float)this.field_a.field_Oc));
                this.field_a.a(true, this.field_c.field_i[var8 % 16]);
                this.field_a.e(0, true);
                return;
              }
            } else {
              break L3;
            }
          }
        }
        L4: {
          ka.field_b[2] = var6;
          ka.field_b[0] = 0.0f;
          ka.field_b[3] = 0.0f;
          ka.field_b[1] = 0.0f;
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
            if (var9 == 0) {
              break L4;
            } else {
              var8 = (int)(16.0f * (var5 * (float)this.field_a.field_Oc));
              this.field_a.a(true, this.field_c.field_i[var8 % 16]);
              break L4;
            }
          }
        }
        this.field_a.e(0, true);
    }

    final void a(boolean param0) {
        cka stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        int stackIn_3_2 = 0;
        cka stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        int stackOut_1_2 = 0;
        this.field_d.a(4864, '');
        if (param0) {
          return;
        } else {
          this.field_a.e(1, true);
          this.field_a.a(true, (kl) null);
          stackOut_1_0 = this.field_a;
          stackOut_1_1 = 0;
          stackOut_1_2 = 1;
          stackIn_3_0 = stackOut_1_0;
          stackIn_3_1 = stackOut_1_1;
          stackIn_3_2 = stackOut_1_2;
          ((cka) (Object) stackIn_3_0).e(stackIn_3_1, stackIn_3_2 != 0);
          return;
        }
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
