/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qa extends ll {
    static int field_s;
    static lg field_r;
    private la field_p;
    private la[] field_t;
    static oi field_q;

    final void a(byte param0, o[] param1) {
        la[] var3 = null;
        int var4 = 0;
        la var5 = null;
        int var6 = 0;
        la[] var7 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var6 = wizardrun.field_H;
        try {
          L0: {
            if (param0 == 11) {
              var7 = this.field_t;
              var3 = var7;
              var4 = 0;
              L1: while (true) {
                if (var4 >= var7.length) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L2: {
                    var5 = var7[var4];
                    if (var5 != null) {
                      var5.field_j = param1;
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

            stackIn_12_1 = new StringBuilder().append("qa.CA(").append(param0).append(',');

            if (param1 == null) {
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
          throw bd.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    qa(qa param0, boolean param1) {
        this();
        try {
            param0.a(0, param1, (qa) (this));
        } catch (RuntimeException runtimeException) {
            throw bd.a((Throwable) ((Object) runtimeException), "qa.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final la a(int param0, int param1) {
        if (param0 != 0) {
            qa.c(23);
        }
        la dupTemp$0 = new la();
        this.field_t[param1] = dupTemp$0;
        return dupTemp$0;
    }

    public static void b(int param0) {
        field_r = null;
        field_q = null;
        if (param0 != -10059) {
            field_q = (oi) null;
        }
    }

    final static void c(int param0) {
        if (jd.field_f != -pe.field_B + 0 && 250 + -pe.field_B != jd.field_f) {
        }
        if (param0 != 250) {
            field_q = (oi) null;
        }
        jd.field_f = jd.field_f + 1;
    }

    public qa() {
        this.field_t = new la[6];
        this.field_p = new la();
        la dupTemp$0 = new la();
        this.field_t[0] = dupTemp$0;
        la var1 = dupTemp$0;
        var1.a(0);
    }

    final void a(int param0, o[] param1, byte param2) {
        int var5 = 0;
        try {
            int var4_int = -120 / ((43 - param2) / 36);
            var5 = param0;
            if (!(this.field_t[var5] != null)) {
                this.field_t[var5] = new la();
            }
            this.field_t[param0].field_j = param1;
        } catch (RuntimeException runtimeException) {
            throw bd.a((Throwable) ((Object) runtimeException), "qa.DA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final void a(byte param0, o param1) {
        la[] var3 = null;
        int var4 = 0;
        la var5 = null;
        int var6 = 0;
        la[] var7 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var6 = wizardrun.field_H;
        try {
          L0: {
            L1: {
              if (param0 >= 46) {
                break L1;
              } else {
                this.a(-74, -15);
                break L1;
              }
            }
            var7 = this.field_t;
            var3 = var7;
            var4 = 0;
            L2: while (true) {
              if (var4 >= var7.length) {
                break L0;
              } else {
                L3: {
                  var5 = var7[var4];
                  if (var5 != null) {
                    var5.field_i = param1;
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
            stackIn_12_0 = (RuntimeException) (var3_ref);

            stackIn_12_1 = new StringBuilder().append("qa.U(").append(param0).append(',');

            if (param1 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw bd.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
    }

    private final void a(int param0, boolean param1, qa param2) {
        la dupTemp$2 = null;
        int var4_int = 0;
        la var5 = null;
        la var6 = null;
        int var7 = 0;
        la stackIn_9_0 = null;
        la stackIn_10_0 = null;
        la stackIn_10_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var7 = wizardrun.field_H;
        try {
          L0: {
            L1: {
              super.a(param2, param0);
              if (param1) {
                var4_int = 0;
                L2: while (true) {
                  if ((var4_int ^ -1) <= -7) {
                    break L1;
                  } else {
                    L3: {
                      var5 = this.field_t[var4_int];
                      if (var5 != null) {
                        L4: {
                          var6 = param2.field_t[var4_int];
                          stackIn_9_0 = (la) (var5);

                          if (var6 == null) {
                            dupTemp$2 = new la();
                            param2.field_t[var4_int] = dupTemp$2;
                            stackIn_10_0 = (la) ((Object) stackIn_9_0);
                            stackIn_10_1 = (la) (dupTemp$2);
                            break L4;
                          } else {
                            stackIn_10_0 = (la) ((Object) stackIn_9_0);
                            stackIn_10_1 = (la) (var6);
                            break L4;
                          }
                        }
                        ((la) (Object) stackIn_10_0).a(stackIn_10_1, (byte) -26);
                        break L3;
                      } else {
                        param2.field_t[var4_int] = null;
                        break L3;
                      }
                    }
                    var4_int++;
                    continue L2;
                  }
                }
              } else {
                g.a(this.field_t, 0, param2.field_t, 0, 6);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var4);

            stackIn_15_1 = new StringBuilder().append("qa.W(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L5;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L5;
            }
          }
          throw bd.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
    }

    public final void a(int param0, int param1, ub param2, boolean param3, boolean param4) {
        ub stackIn_3_0 = null;
        la stackIn_33_0 = null;
        ub stackIn_33_1 = null;
        la stackIn_34_0 = null;
        ub stackIn_34_1 = null;
        int stackIn_34_2 = 0;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_39_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        la var7 = null;
        la var9 = null;
        pl var10 = null;
        la var11 = null;
        la var12 = null;
        la var13 = null;
        la var14 = null;
        try {
          L0: {
            L1: {
              if (!(param2 instanceof pl)) {
                stackIn_3_0 = null;
                break L1;
              } else {
                stackIn_3_0 = (ub) (param2);
                break L1;
              }
            }
            L2: {
              var10 = (pl) ((Object) stackIn_3_0);
              eb.a(0, param1 - (-param2.field_l + -param2.field_n), param0 - -param2.field_o, param2.field_l + param1, param0 - -param2.field_o - -param2.field_r);
              if (var10 == null) {
                break L2;
              } else {
                param4 = param4 & var10.field_B;
                break L2;
              }
            }
            L3: {
              var7 = this.field_t[0];
              this.field_p.a(0);
              var7.a(param1, 83, param0, param2, this.field_p, (qa) (this));
              if (param3) {
                break L3;
              } else {
                qa.b(9);
                break L3;
              }
            }
            L4: {
              if (var10 != null) {
                L5: {
                  if (var10.field_z) {
                    var11 = this.field_t[1];
                    if (var11 != null) {
                      var11.a(param1, 100, param0, param2, this.field_p, (qa) (this));
                      break L5;
                    } else {
                      break L5;
                    }
                  } else {
                    break L5;
                  }
                }
                if (var10.field_v) {
                  L6: {
                    var12 = this.field_t[3];
                    if (var10.field_q == 0) {
                      break L6;
                    } else {
                      if (var12 != null) {
                        var12.a(param1, 90, param0, param2, this.field_p, (qa) (this));
                        break L4;
                      } else {
                        break L6;
                      }
                    }
                  }
                  var9 = this.field_t[2];
                  if (var9 != null) {
                    var9.a(param1, 100, param0, param2, this.field_p, (qa) (this));
                    break L4;
                  } else {
                    break L4;
                  }
                } else {
                  break L4;
                }
              } else {
                break L4;
              }
            }
            L7: {
              if (param2.d((byte) 53)) {
                var13 = this.field_t[5];
                if (var13 == null) {
                  break L7;
                } else {
                  var13.a(param1, 92, param0, param2, this.field_p, (qa) (this));
                  break L7;
                }
              } else {
                break L7;
              }
            }
            L8: {
              if (param4) {
                break L8;
              } else {
                var14 = this.field_t[4];
                if (var14 != null) {
                  var14.a(param1, 95, param0, param2, this.field_p, (qa) (this));
                  break L8;
                } else {
                  break L8;
                }
              }
            }
            L9: {
              stackIn_33_0 = this.field_p;

              stackIn_33_1 = (ub) (param2);

              if (param3) {
                stackIn_34_0 = (la) ((Object) stackIn_33_0);
                stackIn_34_1 = (ub) ((Object) stackIn_33_1);
                stackIn_34_2 = 0;
                break L9;
              } else {
                stackIn_34_0 = (la) ((Object) stackIn_33_0);
                stackIn_34_1 = (ub) ((Object) stackIn_33_1);
                stackIn_34_2 = 1;
                break L9;
              }
            }
            ((la) (Object) stackIn_34_0).a(stackIn_34_1, stackIn_34_2 != 0, param1, (qa) (this), param0);
            bb.b(4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var6 = decompiledCaughtException;
            stackIn_38_0 = (RuntimeException) (var6);

            stackIn_38_1 = new StringBuilder().append("qa.B(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_39_0 = (RuntimeException) ((Object) stackIn_38_0);
              stackIn_39_1 = (StringBuilder) ((Object) stackIn_38_1);
              stackIn_39_2 = "null";
              break L10;
            } else {
              stackIn_39_0 = (RuntimeException) ((Object) stackIn_38_0);
              stackIn_39_1 = (StringBuilder) ((Object) stackIn_38_1);
              stackIn_39_2 = "{...}";
              break L10;
            }
          }
          throw bd.a((Throwable) ((Object) stackIn_39_0), stackIn_39_2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
        field_r = new lg();
        field_q = new oi();
    }
}
