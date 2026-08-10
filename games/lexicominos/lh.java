/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lh extends ik {
    private n[] field_v;
    static int field_u;
    static boolean field_w;
    private n field_t;

    public final void a(int param0, int param1, boolean param2, w param3, int param4) {
        w stackIn_3_0 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        n var7 = null;
        n var9 = null;
        kf var10 = null;
        n var11 = null;
        n var12 = null;
        n var13 = null;
        n var14 = null;
        try {
          L0: {
            L1: {
              if (!(param3 instanceof kf)) {
                stackIn_3_0 = null;
                break L1;
              } else {
                stackIn_3_0 = (w) (param3);
                break L1;
              }
            }
            L2: {
              var10 = (kf) ((Object) stackIn_3_0);
              ca.a(param3.field_t + (param1 + param3.field_j), param3.field_o + param0, param3.field_t + param1, param3.field_v + (param3.field_o + param0), false);
              if (var10 == null) {
                break L2;
              } else {
                param2 = param2 & var10.field_D;
                break L2;
              }
            }
            L3: {
              var7 = this.field_v[0];
              this.field_t.a(param4 + 3389);
              var7.a(param1, this.field_t, (byte) 76, param0, (lh) (this), param3);
              if (var10 == null) {
                break L3;
              } else {
                L4: {
                  if (var10.field_C) {
                    var11 = this.field_v[1];
                    if (var11 != null) {
                      var11.a(param1, this.field_t, (byte) 76, param0, (lh) (this), param3);
                      break L4;
                    } else {
                      break L4;
                    }
                  } else {
                    break L4;
                  }
                }
                if (var10.field_m) {
                  L5: {
                    var12 = this.field_v[3];
                    if (0 == var10.field_h) {
                      break L5;
                    } else {
                      if (var12 == null) {
                        break L5;
                      } else {
                        var12.a(param1, this.field_t, (byte) 76, param0, (lh) (this), param3);
                        break L3;
                      }
                    }
                  }
                  var9 = this.field_v[2];
                  if (var9 != null) {
                    var9.a(param1, this.field_t, (byte) 76, param0, (lh) (this), param3);
                    break L3;
                  } else {
                    break L3;
                  }
                } else {
                  break L3;
                }
              }
            }
            L6: {
              if (param3.a(18337)) {
                var13 = this.field_v[5];
                if (var13 == null) {
                  break L6;
                } else {
                  var13.a(param1, this.field_t, (byte) 76, param0, (lh) (this), param3);
                  break L6;
                }
              } else {
                break L6;
              }
            }
            L7: {
              if (!param2) {
                var14 = this.field_v[4];
                if (var14 == null) {
                  break L7;
                } else {
                  var14.a(param1, this.field_t, (byte) 76, param0, (lh) (this), param3);
                  break L7;
                }
              } else {
                break L7;
              }
            }
            L8: {
              if (param4 == -3284) {
                break L8;
              } else {
                this.field_v = (n[]) null;
                break L8;
              }
            }
            this.field_t.a((lh) (this), param3, param1, param4 ^ 3254, param0);
            pd.a(param4 + -19665);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var6 = decompiledCaughtException;
            stackIn_33_0 = (RuntimeException) (var6);

            stackIn_33_1 = new StringBuilder().append("lh.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_34_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "null";
              break L9;
            } else {
              stackIn_34_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "{...}";
              break L9;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_34_0), stackIn_34_2 + ',' + param4 + ')');
        }
    }

    public lh() {
        this.field_v = new n[6];
        this.field_t = new n();
        n dupTemp$0 = new n();
        this.field_v[0] = dupTemp$0;
        n var1 = dupTemp$0;
        var1.a(109);
    }

    private final void a(boolean param0, lh param1, int param2) {
        n dupTemp$2 = null;
        int var4_int = 0;
        n var5 = null;
        n var6 = null;
        int var7 = 0;
        n stackIn_8_0 = null;
        n stackIn_9_0 = null;
        n stackIn_9_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var7 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              super.a(param1, false);
              if (!param0) {
                o.a(this.field_v, 0, param1.field_v, 0, 6);
                break L1;
              } else {
                var4_int = 0;
                L2: while (true) {
                  if (-7 >= (var4_int ^ -1)) {
                    break L1;
                  } else {
                    L3: {
                      var5 = this.field_v[var4_int];
                      if (var5 != null) {
                        L4: {
                          var6 = param1.field_v[var4_int];
                          stackIn_8_0 = (n) (var5);

                          if (var6 != null) {
                            stackIn_9_0 = (n) ((Object) stackIn_8_0);
                            stackIn_9_1 = (n) (var6);
                            break L4;
                          } else {
                            dupTemp$2 = new n();
                            param1.field_v[var4_int] = dupTemp$2;
                            stackIn_9_0 = (n) ((Object) stackIn_8_0);
                            stackIn_9_1 = (n) (dupTemp$2);
                            break L4;
                          }
                        }
                        ((n) (Object) stackIn_9_0).a(stackIn_9_1, param2 ^ -25688);
                        break L3;
                      } else {
                        param1.field_v[var4_int] = null;
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
              if (param2 == 6) {
                break L5;
              } else {
                field_u = 31;
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

            stackIn_17_1 = new StringBuilder().append("lh.FA(").append(param0).append(',');

            if (param1 == null) {
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
          throw ld.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param2 + ')');
        }
    }

    final void a(db[] param0, byte param1) {
        n[] var3 = null;
        int var4 = 0;
        n var5 = null;
        int var6 = 0;
        n[] var7 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var6 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            if (param1 == -112) {
              var7 = this.field_v;
              var3 = var7;
              var4 = 0;
              L1: while (true) {
                if (var7.length <= var4) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L2: {
                    var5 = var7[var4];
                    if (var5 != null) {
                      var5.field_f = param0;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  var4++;
                  continue L1;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var3_ref);

            stackIn_12_1 = new StringBuilder().append("lh.B(");

            if (param0 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    lh(lh param0, boolean param1) {
        this();
        try {
            param0.a(param1, (lh) (this), 6);
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) ((Object) runtimeException), "lh.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static boolean b(int param0) {
        int stackIn_9_0 = 0;
        L0: {
          if (param0 == -24921) {
            break L0;
          } else {
            field_w = false;
            break L0;
          }
        }
        L1: {
          L2: {
            if (wf.field_i < 20) {
              break L2;
            } else {
              if (!ha.a(126)) {
                break L2;
              } else {
                L3: {
                  if (-1 <= (be.field_l ^ -1)) {
                    break L3;
                  } else {
                    if (ca.d(true)) {
                      break L3;
                    } else {
                      break L2;
                    }
                  }
                }
                stackIn_9_0 = 0;
                break L1;
              }
            }
          }
          stackIn_9_0 = 1;
          break L1;
        }
        return stackIn_9_0 != 0;
    }

    final void a(int param0, db param1) {
        n[] var7 = null;
        int var4 = 0;
        n var5 = null;
        int var6 = Lexicominos.field_L ? 1 : 0;
        try {
            var7 = this.field_v;
            n[] var3 = var7;
            for (var4 = 0; var4 < var7.length; var4++) {
                var5 = var7[var4];
                if (!(var5 == null)) {
                    var5.field_j = param1;
                }
            }
            int var3_int = 45 / ((param0 - -58) / 39);
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) ((Object) runtimeException), "lh.CA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final n a(boolean param0, int param1) {
        if (param0) {
            return (n) null;
        }
        n dupTemp$0 = new n();
        this.field_v[param1] = dupTemp$0;
        return dupTemp$0;
    }

    final void a(db[] param0, boolean param1, int param2) {
        int var4_int = 0;
        try {
            var4_int = param2;
            if (this.field_v[var4_int] == null) {
                this.field_v[var4_int] = new n();
            }
            if (param1) {
                this.field_v = (n[]) null;
            }
            this.field_v[param2].field_f = param0;
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) ((Object) runtimeException), "lh.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void a(wf param0, int param1) {
        int var2_int = 0;
        try {
            ki.field_g = param0.b(-1698573656) << 2051500101;
            var2_int = param0.d(true);
            ki.field_g = ki.field_g + (var2_int >> -88380445);
            sg.field_a = 1835008 & var2_int << 606181778;
            sg.field_a = sg.field_a + (param0.b(-1698573656) << 1599213154);
            var2_int = param0.d(true);
            hh.field_I = (63 & var2_int) << 14035983;
            sg.field_a = sg.field_a + (var2_int >> -723920378);
            hh.field_I = hh.field_I + (param0.d(true) << -953531545);
            if (param1 != -95) {
                wf var3 = (wf) null;
                lh.a((wf) null, 6);
            }
            var2_int = param0.d(true);
            hh.field_I = hh.field_I + (var2_int >> 436105121);
            th.field_s = var2_int << 15324528 & 65536;
            th.field_s = th.field_s + param0.b(-1698573656);
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) ((Object) runtimeException), "lh.BA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_u = 0;
        field_w = false;
    }
}
