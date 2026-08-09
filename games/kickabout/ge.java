/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ge extends jd {
    static ff field_j;
    static String[] field_o;
    private ga field_l;
    static ut field_k;
    static int[] field_m;
    static hd field_n;

    final static void a(int param0, int param1, byte param2, int param3) {
        hn var4;
        if (param2 >= 93) {
          var4 = new hn(2, new int[]{param1, param3, param0});
          ii.a(var4, 73);
          if (25 == cq.field_h.field_c) {
            ((b) ((Object) cq.field_h)).h((byte) 84);
            return;
          } else {
            return;
          }
        } else {
          field_o = (String[]) null;
          var4 = new hn(2, new int[]{param1, param3, param0});
          ii.a(var4, 73);
          if (25 != cq.field_h.field_c) {
            return;
          } else {
            ((b) ((Object) cq.field_h)).h((byte) 84);
            return;
          }
        }
    }

    ge(ga param0, ga param1) {
        super(param0);
        try {
            this.field_l = param1;
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) ((Object) runtimeException), "ge.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void c(byte param0) {
        field_o = null;
        field_m = null;
        field_n = null;
        field_j = null;
        if (param0 != 76) {
          field_j = (ff) null;
          field_k = null;
          return;
        } else {
          field_k = null;
          return;
        }
    }

    final String a(byte param0, String param1) {
        l var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        String stackIn_6_0 = null;
        String stackIn_8_0 = null;
        String stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!(this.field_l instanceof cw)) {
                break L1;
              } else {
                var3 = ((cw) ((Object) this.field_l)).a((byte) -115);
                if (var3 != null) {
                  L2: {
                    if (var3.c(-24407) != he.field_yb) {
                      break L2;
                    } else {
                      if (param1.equals(this.field_l.field_q)) {
                        break L2;
                      } else {
                        stackIn_6_0 = rl.field_p;
                        decompiledRegionSelector0 = 0;
                        break L0;
                      }
                    }
                  }
                  stackIn_8_0 = var3.b(-67);
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            L3: {
              if (param0 == 25) {
                break L3;
              } else {
                var4 = (String) null;
                this.a((byte) -109, (String) null);
                break L3;
              }
            }
            if (!param1.equals(this.field_l.field_q)) {
              stackIn_14_0 = rl.field_p;
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var3_ref);

            stackIn_17_1 = new StringBuilder().append("ge.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L4;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L4;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            return stackIn_14_0;
          }
        }
    }

    final static void a(gv param0, boolean param1) {
        int var2_int = 0;
        int var3 = Kickabout.field_G;
        for (var2_int = bk.field_c.length - 1; 1 <= var2_int; var2_int--) {
            bk.field_c[var2_int] = bk.field_c[var2_int + -1];
        }
        if (param1) {
            return;
        }
        try {
            bk.field_c[0] = param0;
            e.field_j = 0;
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) ((Object) runtimeException), "ge.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final rv a(String param0, int param1) {
        l var3 = null;
        RuntimeException var3_ref = null;
        rv stackIn_8_0 = null;
        rv stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == -5) {
                break L1;
              } else {
                field_j = (ff) null;
                break L1;
              }
            }
            L2: {
              if (this.field_l instanceof cw) {
                var3 = ((cw) ((Object) this.field_l)).a((byte) -113);
                if (var3 == null) {
                  break L2;
                } else {
                  if (var3.c(-24407) != he.field_yb) {
                    stackIn_8_0 = jt.field_Bb;
                    decompiledRegionSelector0 = 0;
                    break L0;
                  } else {
                    break L2;
                  }
                }
              } else {
                break L2;
              }
            }
            L3: {
              if (param0.equals(this.field_l.field_q)) {
                stackIn_12_0 = he.field_yb;
                break L3;
              } else {
                stackIn_12_0 = jt.field_Bb;
                break L3;
              }
            }
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var3_ref);

            stackIn_15_1 = new StringBuilder().append("ge.E(");

            if (param0 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L4;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L4;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_8_0;
        } else {
          return stackIn_12_0;
        }
    }

    final static byte[] a(int param0, ut param1) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        int incrementValue$8 = 0;
        byte[] stackIn_3_0 = null;
        byte[] stackIn_33_0 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_37_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        byte[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        byte[] var9 = null;
        var8 = Kickabout.field_G;
        try {
          L0: {
            var9 = new byte[param1.field_v * (param1.field_o >> 956025187)];
            var2 = var9;
            if (param0 == 16) {
              var3 = 0;
              var4 = 0;
              var5 = 0;
              L1: while (true) {
                if (param1.field_v <= var5) {
                  stackIn_33_0 = (byte[]) (var9);
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var6 = 0;
                  L2: while (true) {
                    if (param1.field_o <= var6) {
                      var5++;
                      continue L1;
                    } else {
                      L3: {
                        var7 = 0;
                        incrementValue$0 = var4;
                        var4++;
                        if (param1.field_y[incrementValue$0] != 0) {
                          var7 = (byte)(var7 | 1);
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      L4: {
                        incrementValue$1 = var4;
                        var4++;
                        if (0 == param1.field_y[incrementValue$1]) {
                          break L4;
                        } else {
                          var7 = (byte)(var7 | 2);
                          break L4;
                        }
                      }
                      L5: {
                        incrementValue$2 = var4;
                        var4++;
                        if (param1.field_y[incrementValue$2] != 0) {
                          var7 = (byte)(var7 | 4);
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                      L6: {
                        incrementValue$3 = var4;
                        var4++;
                        if (param1.field_y[incrementValue$3] != 0) {
                          var7 = (byte)(var7 | 8);
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      L7: {
                        incrementValue$4 = var4;
                        var4++;
                        if (param1.field_y[incrementValue$4] != 0) {
                          var7 = (byte)(var7 | 16);
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                      L8: {
                        incrementValue$5 = var4;
                        var4++;
                        if (param1.field_y[incrementValue$5] != 0) {
                          var7 = (byte)(var7 | 32);
                          break L8;
                        } else {
                          break L8;
                        }
                      }
                      L9: {
                        incrementValue$6 = var4;
                        var4++;
                        if (param1.field_y[incrementValue$6] == 0) {
                          break L9;
                        } else {
                          var7 = (byte)(var7 | 64);
                          break L9;
                        }
                      }
                      L10: {
                        incrementValue$7 = var4;
                        var4++;
                        if (param1.field_y[incrementValue$7] != 0) {
                          var7 = (byte)(var7 | 128);
                          break L10;
                        } else {
                          break L10;
                        }
                      }
                      incrementValue$8 = var3;
                      var3++;
                      var9[incrementValue$8] = (byte)var7;
                      var6 += 8;
                      continue L2;
                    }
                  }
                }
              }
            } else {
              stackIn_3_0 = (byte[]) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var2_ref = decompiledCaughtException;
            stackIn_36_0 = (RuntimeException) (var2_ref);

            stackIn_36_1 = new StringBuilder().append("ge.G(").append(param0).append(',');

            if (param1 == null) {
              stackIn_37_0 = (RuntimeException) ((Object) stackIn_36_0);
              stackIn_37_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackIn_37_2 = "null";
              break L11;
            } else {
              stackIn_37_0 = (RuntimeException) ((Object) stackIn_36_0);
              stackIn_37_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackIn_37_2 = "{...}";
              break L11;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_37_0), stackIn_37_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_33_0;
        }
    }

    static {
        field_j = new ff(9, 0, 4, 1);
        field_m = new int[2];
    }
}
