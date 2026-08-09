/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class id extends qv {
    static byte[] field_u;
    private hf[] field_w;
    static r field_t;
    private hf field_x;
    static sj field_y;
    static String field_r;
    static int field_v;
    static hd field_s;

    final hf a(int param0, int param1) {
        if (param1 != -12085) {
            return (hf) null;
        }
        hf dupTemp$0 = new hf();
        this.field_w[param0] = dupTemp$0;
        return dupTemp$0;
    }

    private final void a(id param0, boolean param1, int param2) {
        hf dupTemp$2 = null;
        int var4_int = 0;
        hf var5 = null;
        hf var6 = null;
        int var7 = 0;
        hf stackIn_7_0 = null;
        hf stackIn_8_0 = null;
        hf stackIn_8_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        fd var8 = null;
        var7 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              super.a(param0, (byte) -112);
              if (!param1) {
                dv.a(this.field_w, 0, param0.field_w, 0, 6);
                break L1;
              } else {
                var4_int = 0;
                L2: while (true) {
                  if (-7 >= (var4_int ^ -1)) {
                    break L1;
                  } else {
                    L3: {
                      var5 = this.field_w[var4_int];
                      if (var5 == null) {
                        param0.field_w[var4_int] = null;
                        break L3;
                      } else {
                        L4: {
                          var6 = param0.field_w[var4_int];
                          stackIn_7_0 = (hf) (var5);

                          if (var6 == null) {
                            dupTemp$2 = new hf();
                            param0.field_w[var4_int] = dupTemp$2;
                            stackIn_8_0 = (hf) ((Object) stackIn_7_0);
                            stackIn_8_1 = (hf) (dupTemp$2);
                            break L4;
                          } else {
                            stackIn_8_0 = (hf) ((Object) stackIn_7_0);
                            stackIn_8_1 = (hf) (var6);
                            break L4;
                          }
                        }
                        ((hf) (Object) stackIn_8_0).a(stackIn_8_1, -2147483648);
                        break L3;
                      }
                    }
                    var4_int++;
                    continue L2;
                  }
                }
              }
            }
            L5: {
              if (param2 < -97) {
                break L5;
              } else {
                var8 = (fd) null;
                this.a(-126, true, -77, (fd) null, 67);
                break L5;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var4);

            stackIn_17_1 = new StringBuilder().append("id.E(");

            if (param0 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L6;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L6;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static boolean a(boolean param0, CharSequence param1, char param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (ws.a(param2, (byte) 121)) {
              if (param1 == null) {
                stackIn_6_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                var3_int = param1.length();
                if (var3_int < 12) {
                  if (!ca.a(param0, param2)) {
                    stackIn_16_0 = 1;
                    decompiledRegionSelector0 = 4;
                    break L0;
                  } else {
                    if (-1 == (var3_int ^ -1)) {
                      stackIn_14_0 = 0;
                      decompiledRegionSelector0 = 3;
                      break L0;
                    } else {
                      return true;
                    }
                  }
                } else {
                  stackIn_9_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            } else {
              stackIn_2_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var3);

            stackIn_19_1 = new StringBuilder().append("id.G(").append(param0).append(',');

            if (param1 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L1;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L1;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_9_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_14_0 != 0;
              } else {
                return stackIn_16_0 != 0;
              }
            }
          }
        }
    }

    final void a(ut[] param0, int param1) {
        hf[] var3 = null;
        int var4 = 0;
        hf var5 = null;
        int var6 = 0;
        hf[] var7 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var6 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              if (param1 == -23952) {
                break L1;
              } else {
                field_u = (byte[]) null;
                break L1;
              }
            }
            var7 = this.field_w;
            var3 = var7;
            var4 = 0;
            L2: while (true) {
              if (var4 >= var7.length) {
                break L0;
              } else {
                L3: {
                  var5 = var7[var4];
                  if (var5 == null) {
                    break L3;
                  } else {
                    var5.field_g = param0;
                    break L3;
                  }
                }
                var4++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var3_ref);

            stackIn_11_1 = new StringBuilder().append("id.D(");

            if (param0 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L4;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L4;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ')');
        }
    }

    final static void a(sj param0, sj param1, boolean param2, sj param3) {
        kg[] var5 = null;
        kg[][] var6 = null;
        int[][] var7 = null;
        int var8 = 0;
        int var9 = 0;
        kg[] var10 = null;
        int var11_int = 0;
        ut var11 = null;
        ut var12 = null;
        int var13 = 0;
        kg[] var14 = null;
        ut var15 = null;
        int[][] var16 = null;
        ut var17 = null;
        ut var18 = null;
        int[][] var19 = null;
        sj stackIn_3_0 = null;
        String stackIn_3_1 = null;
        sj stackIn_4_0 = null;
        String stackIn_4_1 = null;
        int stackIn_4_2 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var13 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              sk.field_a = se.a(param3, -9, "commonui", "frame_top");
              vb.field_a = se.a(param3, -120, "commonui", "frame_bottom");
              aa.field_f = wa.a((byte) 112, "commonui", param3, "jagex_logo_grey");
              nw.field_a = se.a(param3, -29, "commonui", "button");
              jc.field_g = ng.a("validation", "commonui", 2, param3);
              qo.field_k = (hu) ((Object) gm.a(param1, 10, "arezzo12", param3, "commonui"));
              gf.field_a = (hu) ((Object) gm.a(param1, 10, "arezzo14", param3, "commonui"));
              fj.field_b = (hu) ((Object) gm.a(param1, 10, "arezzo14bold", param3, "commonui"));
              var17 = new ut(param0.a("", "button.gif", 34), (java.awt.Component) ((Object) ic.field_d));
              stackIn_3_0 = (sj) (param3);

              stackIn_3_1 = "commonui";

              if (param2) {
                stackIn_4_0 = (sj) ((Object) stackIn_3_0);
                stackIn_4_1 = (String) ((Object) stackIn_3_1);
                stackIn_4_2 = 0;
                break L1;
              } else {
                stackIn_4_0 = (sj) ((Object) stackIn_3_0);
                stackIn_4_1 = (String) ((Object) stackIn_3_1);
                stackIn_4_2 = 1;
                break L1;
              }
            }
            fw.a(stackIn_4_0, stackIn_4_1, stackIn_4_2 != 0, "dropdown");
            var5 = jo.a(param3, 17369, "commonui", "screen_options");
            dw.field_d = new kg[4];
            tj.field_f = new kg[4];
            kk.field_Q = new kg[4];
            var6 = new kg[][]{kk.field_Q, tj.field_f, dw.field_d};
            var19 = new int[4][];
            var16 = var19;
            var7 = var16;
            var7[0] = var5[0].field_l;
            var8 = 1;
            L2: while (true) {
              if (var8 >= var19.length) {
                var8 = var5[0].field_m[0];
                var19[2][var8] = 16777215;
                var19[1][var8] = 2394342;
                var19[3][var8] = 4767999;
                var9 = 0;
                L3: while (true) {
                  if (-4 >= (var9 ^ -1)) {
                    L4: {
                      var9 = var17.field_w;
                      tr.d(-12974);
                      var17.e();
                      on.b(0, 0, on.field_g, on.field_f);
                      var15 = new ut(var9, var9);
                      var18 = var15;
                      var18.e();
                      var17.d(0, 0);
                      var11 = new ut(var9, var9);
                      var11.e();
                      var17.d(-var17.field_q + var9, 0);
                      var12 = new ut(-(2 * var9) + var17.field_q, var9);
                      var12.e();
                      var17.d(-var9, 0);
                      ta.e(119);
                      nw.field_a = new ut[]{var15, var12, var11};
                      if (!param2) {
                        break L4;
                      } else {
                        id.a(false, (CharSequence) null, 'ﾺ');
                        break L4;
                      }
                    }
                    break L0;
                  } else {
                    var14 = var6[var9];
                    var10 = var14;
                    var11_int = 0;
                    L5: while (true) {
                      if (var14.length <= var11_int) {
                        var9++;
                        continue L3;
                      } else {
                        var14[var11_int] = ul.a(var5[var9], (byte) 100, var19[var11_int]);
                        var11_int++;
                        continue L5;
                      }
                    }
                  }
                }
              } else {
                var7[var8] = (int[]) ((Object) var19[0].clone());
                var8++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var4);

            stackIn_18_1 = new StringBuilder().append("id.A(");

            if (param0 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L6;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_21_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',');

            if (param1 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L7;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_24_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L8;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L8;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_19_0), stackIn_25_2 + ')');
        }
    }

    public final void a(int param0, boolean param1, int param2, fd param3, int param4) {
        fd stackIn_3_0 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        hf var7 = null;
        int var8 = 0;
        wi var10 = null;
        hf var11 = null;
        hf var12 = null;
        hf var13 = null;
        hf var14 = null;
        hf var15 = null;
        try {
          L0: {
            L1: {
              if (param3 instanceof wi) {
                stackIn_3_0 = (fd) (param3);
                break L1;
              } else {
                stackIn_3_0 = null;
                break L1;
              }
            }
            L2: {
              var10 = (wi) ((Object) stackIn_3_0);
              pt.a(param3.field_t + (param4 - -param3.field_n), -22914, param3.field_t + param4, param3.field_i + (param2 + param3.field_g), param2 + param3.field_g);
              if (var10 == null) {
                break L2;
              } else {
                param1 = param1 & var10.field_y;
                break L2;
              }
            }
            L3: {
              var7 = this.field_w[0];
              this.field_x.a(-13136);
              var7.a(param2, -2147483648, (id) (this), param3, param4, this.field_x);
              if (var10 != null) {
                L4: {
                  if (!var10.field_A) {
                    break L4;
                  } else {
                    var11 = this.field_w[1];
                    if (var11 != null) {
                      var11.a(param2, -2147483648, (id) (this), param3, param4, this.field_x);
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                }
                if (!var10.field_m) {
                  break L3;
                } else {
                  L5: {
                    var13 = this.field_w[3];
                    if (0 == var10.field_p) {
                      break L5;
                    } else {
                      if (var13 != null) {
                        var13.a(param2, -2147483648, (id) (this), param3, param4, this.field_x);
                        break L3;
                      } else {
                        break L5;
                      }
                    }
                  }
                  var12 = this.field_w[2];
                  if (var12 == null) {
                    break L3;
                  } else {
                    var12.a(param2, -2147483648, (id) (this), param3, param4, this.field_x);
                    break L3;
                  }
                }
              } else {
                break L3;
              }
            }
            L6: {
              var8 = -44 / ((param0 - 59) / 53);
              if (!param3.b(15)) {
                break L6;
              } else {
                var14 = this.field_w[5];
                if (var14 != null) {
                  var14.a(param2, -2147483648, (id) (this), param3, param4, this.field_x);
                  break L6;
                } else {
                  break L6;
                }
              }
            }
            L7: {
              if (!param1) {
                var15 = this.field_w[4];
                if (var15 == null) {
                  break L7;
                } else {
                  var15.a(param2, -2147483648, (id) (this), param3, param4, this.field_x);
                  break L7;
                }
              } else {
                break L7;
              }
            }
            this.field_x.a(param3, (id) (this), param2, param4, 0);
            ta.e(127);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var6 = decompiledCaughtException;
            stackIn_30_0 = (RuntimeException) (var6);

            stackIn_30_1 = new StringBuilder().append("id.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "null";
              break L8;
            } else {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "{...}";
              break L8;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_31_0), stackIn_31_2 + ',' + param4 + ')');
        }
    }

    public id() {
        this.field_w = new hf[6];
        this.field_x = new hf();
        hf dupTemp$0 = new hf();
        this.field_w[0] = dupTemp$0;
        hf var1 = dupTemp$0;
        var1.a(-13136);
    }

    public static void a(int param0) {
        field_r = null;
        field_s = null;
        field_y = null;
        if (param0 > -99) {
            field_r = (String) null;
        }
        field_u = null;
        field_t = null;
    }

    id(id param0, boolean param1) {
        this();
        try {
            param0.a((id) (this), param1, -116);
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) ((Object) runtimeException), "id.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(ut param0, byte param1) {
        hf[] var3 = null;
        int var4 = 0;
        hf var5 = null;
        int var6 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var6 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              var3 = this.field_w;
              var4 = 0;
              if (param1 <= -86) {
                break L1;
              } else {
                id.a(false, (CharSequence) null, 'ﾴ');
                break L1;
              }
            }
            L2: while (true) {
              if (var3.length <= var4) {
                break L0;
              } else {
                L3: {
                  var5 = var3[var4];
                  if (var5 != null) {
                    var5.field_j = param0;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                var4++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var3_ref);

            stackIn_11_1 = new StringBuilder().append("id.F(");

            if (param0 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L4;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L4;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ')');
        }
    }

    final void a(int param0, ut[] param1, int param2) {
        int var5 = 0;
        try {
            int var4_int = -99 / ((11 - param2) / 60);
            var5 = param0;
            if (!(this.field_w[var5] != null)) {
                this.field_w[var5] = new hf();
            }
            this.field_w[param0].field_g = param1;
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) ((Object) runtimeException), "id.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_u = new byte[520];
        field_t = new r();
        field_r = "Your rating is <%0>";
    }
}
