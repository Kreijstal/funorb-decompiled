/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ak extends ju {
    static String field_e;
    private ka field_m;
    private int field_k;
    private int field_d;
    private int field_i;
    private boolean field_g;
    static String field_j;
    private int field_l;
    private String field_h;
    private int field_f;

    final void a(String param0, byte param1, int param2, int param3, int param4, int param5, int param6, ka param7) {
        ts stackIn_36_0;
        ts stackIn_36_1;
        int stackIn_36_2;
        int stackIn_36_3;
        ts stackIn_37_0 = null;
        ts stackIn_37_1 = null;
        int stackIn_37_2 = 0;
        int stackIn_37_3 = 0;
        int stackIn_37_4 = 0;
        int stackIn_41_0 = 0;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        String stackIn_47_2 = null;
        StringBuilder stackIn_49_1 = null;
        StringBuilder stackIn_50_1 = null;
        String stackIn_50_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        String var13 = null;
        ts var14 = null;
        int var15 = 0;
        String[] var16 = null;
        String[] var17 = null;
        var15 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param4 != 0) {
                break L1;
              } else {
                param4 = param7.field_v;
                break L1;
              }
            }
            if (param0 == null) {
              this.field_b = null;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L2: {
                if (param7 != this.field_m) {
                  break L2;
                } else {
                  if (this.field_g) {
                    break L2;
                  } else {
                    if (param5 != this.field_d) {
                      break L2;
                    } else {
                      if (this.field_f != param3) {
                        break L2;
                      } else {
                        if (param4 != this.field_k) {
                          break L2;
                        } else {
                          if (this.field_l != param2) {
                            break L2;
                          } else {
                            if (param6 != this.field_i) {
                              break L2;
                            } else {
                              if (null == this.field_h) {
                                break L2;
                              } else {
                                if (!this.field_h.equals(param0)) {
                                  break L2;
                                } else {
                                  decompiledRegionSelector0 = 1;
                                  break L0;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
              L3: {
                this.field_f = param3;
                this.field_i = param6;
                if (param1 == 30) {
                  break L3;
                } else {
                  this.field_d = -127;
                  break L3;
                }
              }
              L4: {
                this.field_d = param5;
                this.field_l = param2;
                this.field_m = param7;
                this.field_h = param0;
                this.field_g = false;
                this.field_k = param4;
                var16 = new String[param7.c(param0, param6) - -1];
                var17 = var16;
                var10 = Math.max(1, param7.a(param0, new int[]{param6}, var17));
                if (-4 != (this.field_f ^ -1)) {
                  break L4;
                } else {
                  if (var10 != 1) {
                    break L4;
                  } else {
                    this.field_f = 1;
                    break L4;
                  }
                }
              }
              L5: {
                if (this.field_f != 0) {
                  if (-2 == (this.field_f ^ -1)) {
                    var11 = param7.field_H - -(this.field_l + -(this.field_k * var10) >> 41266529);
                    break L5;
                  } else {
                    if (2 == this.field_f) {
                      var11 = -(var10 * this.field_k) + -param7.field_L + this.field_l;
                      break L5;
                    } else {
                      L6: {
                        var12 = (this.field_l - this.field_k * var10) / (1 + var10);
                        if (-1 >= (var12 ^ -1)) {
                          break L6;
                        } else {
                          var12 = 0;
                          break L6;
                        }
                      }
                      this.field_k = this.field_k + var12;
                      var11 = var12 + param7.field_H;
                      break L5;
                    }
                  }
                } else {
                  var11 = param7.field_H;
                  break L5;
                }
              }
              this.field_b = new ts[var10];
              var12 = 0;
              L7: while (true) {
                if (var10 <= var12) {
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  L8: {
                    var13 = var16[var12];
                    stackIn_36_0 = null;

                    stackIn_36_1 = null;

                    stackIn_36_2 = -param7.field_H + var11;

                    stackIn_36_3 = param7.field_L + var11;

                    if (var13 == null) {
                      stackIn_37_0 = null;
                      stackIn_37_1 = null;
                      stackIn_37_2 = stackIn_36_2;
                      stackIn_37_3 = stackIn_36_3;
                      stackIn_37_4 = 0;
                      break L8;
                    } else {
                      stackIn_37_0 = null;
                      stackIn_37_1 = null;
                      stackIn_37_2 = stackIn_36_2;
                      stackIn_37_3 = stackIn_36_3;
                      stackIn_37_4 = var13.length();
                      break L8;
                    }
                  }
                  L9: {
                    var14 = new ts(stackIn_37_2, stackIn_37_3, stackIn_37_4);
                    var14.field_i[0] = 0;
                    if (var13 == null) {
                      break L9;
                    } else {
                      L10: {
                        var14.field_i[var13.length()] = param7.a(var13);
                        if (-4 == (param5 ^ -1)) {
                          stackIn_41_0 = this.a(0, var13, param6, param7.a(var13));
                          break L10;
                        } else {
                          stackIn_41_0 = 0;
                          break L10;
                        }
                      }
                      kd.a(stackIn_41_0, var13, var14, param7, (byte) 84);
                      break L9;
                    }
                  }
                  var11 = var11 + param4;
                  this.field_b[var12] = var14;
                  var12++;
                  continue L7;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var9 = decompiledCaughtException;
            stackIn_46_0 = (RuntimeException) (var9);

            stackIn_46_1 = new StringBuilder().append("ak.T(");

            if (param0 == null) {
              stackIn_47_0 = (RuntimeException) ((Object) stackIn_46_0);
              stackIn_47_1 = (StringBuilder) ((Object) stackIn_46_1);
              stackIn_47_2 = "null";
              break L11;
            } else {
              stackIn_47_0 = (RuntimeException) ((Object) stackIn_46_0);
              stackIn_47_1 = (StringBuilder) ((Object) stackIn_46_1);
              stackIn_47_2 = "{...}";
              break L11;
            }
          }
          L12: {


            stackIn_49_1 = ((StringBuilder) (Object) stackIn_47_1).append(stackIn_47_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');

            if (param7 == null) {
              stackIn_47_0 = (RuntimeException) ((Object) stackIn_47_0);
              stackIn_50_1 = (StringBuilder) ((Object) stackIn_49_1);
              stackIn_50_2 = "null";
              break L12;
            } else {
              stackIn_47_0 = (RuntimeException) ((Object) stackIn_47_0);
              stackIn_50_1 = (StringBuilder) ((Object) stackIn_49_1);
              stackIn_50_2 = "{...}";
              break L12;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_47_0), stackIn_50_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    final void a(int param0, String param1, ka param2, int param3, int param4) {
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        kl var7 = null;
        ts var9 = null;
        ts var10 = null;
        try {
          L0: {
            L1: {
              if (param3 == -31932) {
                break L1;
              } else {
                var7 = (kl) null;
                ak.a(-2, (kl) null, 6, -12);
                break L1;
              }
            }
            if (param1 == null) {
              this.field_b = null;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L2: {
                if (this.field_m != param2) {
                  break L2;
                } else {
                  if (!this.field_g) {
                    break L2;
                  } else {
                    if ((this.field_d ^ -1) != -3) {
                      break L2;
                    } else {
                      if (null == this.field_h) {
                        break L2;
                      } else {
                        if (this.field_h.equals(param1)) {
                          decompiledRegionSelector0 = 1;
                          break L0;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                }
              }
              this.field_g = true;
              this.field_h = param1;
              this.field_m = param2;
              this.field_d = 2;
              var9 = this.a(param2, param1, (byte) 74, param4);
              var10 = var9;
              var10.field_i[0] = param0 - param2.a(param1);
              var10.field_i[param1.length()] = param0;
              kd.a(0, param1, var10, param2, (byte) 97);
              decompiledRegionSelector0 = 2;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var6);

            stackIn_17_1 = new StringBuilder().append("ak.J(").append(param0).append(',');

            if (param1 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L3;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_20_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',');

            if (param2 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L4;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L4;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_18_0), stackIn_21_2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    final static ru[] a(int param0, kl param1, int param2, int param3) {
        RuntimeException var4 = null;
        Object stackIn_2_0 = null;
        ru[] stackIn_5_0 = null;
        ru[] stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (kp.a(false, param3, param1, param0)) {
              if (param2 == 0) {
                stackIn_7_0 = lr.a(111);
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_5_0 = (ru[]) null;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var4);

            stackIn_10_1 = new StringBuilder().append("ak.O(").append(param0).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L1;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L1;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (ru[]) ((Object) stackIn_2_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            return stackIn_7_0;
          }
        }
    }

    final static void a(String param0, byte param1) {
        try {
            mk.field_f = param0;
            gl.a(120, 12);
            if (param1 >= -61) {
                field_e = (String) null;
            }
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "ak.K(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(int param0, byte param1, ka param2, String param3, int param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        ts var8 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param3 != null) {
              L1: {
                if (param2 != this.field_m) {
                  break L1;
                } else {
                  if (!this.field_g) {
                    break L1;
                  } else {
                    if ((this.field_d ^ -1) != -2) {
                      break L1;
                    } else {
                      if (null == this.field_h) {
                        break L1;
                      } else {
                        if (!this.field_h.equals(param3)) {
                          break L1;
                        } else {
                          decompiledRegionSelector0 = 1;
                          break L0;
                        }
                      }
                    }
                  }
                }
              }
              this.field_d = 1;
              this.field_g = true;
              this.field_m = param2;
              var8 = this.a(param2, param3, (byte) 115, param0);
              var7 = param2.a(param3);
              var8.field_i[0] = -(var7 >> -187058015) + param4;
              var8.field_i[param3.length()] = param4 - -(var7 >> 924266625);
              kd.a(0, param3, var8, param2, (byte) 103);
              if (param1 > 6) {
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                this.field_k = 43;
                return;
              }
            } else {
              this.field_b = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var6);

            stackIn_15_1 = new StringBuilder().append("ak.N(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L2;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');

            if (param3 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L3;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L3;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_16_0), stackIn_19_2 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    public static void c(boolean param0) {
        field_j = null;
        if (!param0) {
            return;
        }
        field_e = null;
    }

    private final ts a(ka param0, String param1, byte param2, int param3) {
        ts var5 = null;
        RuntimeException var5_ref = null;
        ts var6 = null;
        ts stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param2 >= 2) {
                break L1;
              } else {
                this.field_d = 62;
                break L1;
              }
            }
            var6 = new ts(-param0.field_H + param3, param3 - -param0.field_L, param1.length());
            var5 = var6;
            this.field_b = new ts[]{var6};
            stackIn_3_0 = (ts) (var5);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var5_ref);

            stackIn_6_1 = new StringBuilder().append("ak.P(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_7_0), stackIn_10_2 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_3_0;
    }

    final void a(String param0, int param1, ka param2, int param3, int param4) {
        ts var7 = null;
        ts var8 = null;
        if (param0 == null) {
            this.field_b = null;
            return;
        }
        if (param2 == this.field_m && this.field_g && this.field_d == 0 && this.field_h != null) {
            if (!(!this.field_h.equals(param0))) {
                return;
            }
        }
        try {
            this.field_d = param1;
            this.field_g = true;
            this.field_m = param2;
            this.field_h = param0;
            var7 = this.a(param2, param0, (byte) 18, param3);
            var8 = var7;
            var7.field_i[0] = param4;
            var8.field_i[param0.length()] = param4 + param2.a(param0);
            kd.a(0, param0, var8, param2, (byte) 83);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "ak.R(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void b(boolean param0) {
        tq.field_c = qn.field_l;
        bm.field_p = qn.field_g;
        bh.d(false);
        pj.field_E.a(-2 + no.field_T.field_ob + -40, (byte) -124, 0, no.field_T.field_gb, 0);
        t.field_g.a(jn.field_d, -20500, al.field_f.field_gb, 0, 0);
        int var1 = 2 + jn.field_d;
        nf.field_Kb.a(al.field_f.field_ob + -(!fh.field_c ? 0 : var1), -20500, al.field_f.field_gb, !fh.field_c ? 0 : var1, 0);
        mj.a((byte) 91);
        cp.field_d.a(40, -20500, no.field_T.field_gb, no.field_T.field_ob + -40, 0);
        tg.field_n.a(30, -20500, ov.field_i.field_gb, 0, 0);
        of.field_Lb.a(-30 + (-40 + ov.field_i.field_ob) - 2, -20500, ov.field_i.field_gb, 30, 0);
        r.field_v.a(30, -20500, 68, 5, 5);
        ek.field_c.a(30, -20500, 78, 5, 75);
        sr.field_p.a(30, -20500, 48, 5, 155);
        bs.field_a.a(30, -20500, 48, 5, 205);
        int var2 = !fh.field_c ? 200 : 250;
        ee.field_A.a(30, -20500, -var2 + 363, 5, var2 + 5);
        wl.field_K.a(30, -20500, -370 + (-5 + ov.field_i.field_gb), 5, 370);
        bv.field_x.a(5, param0, of.field_Lb.field_gb + -5 - 5, 2, jn.field_c, 37, -32 + (of.field_Lb.field_ob + -5 - 5));
        int var3 = (ov.field_i.field_gb - -2) / 2;
        fj.field_d.a(40, -20500, var3 - 2, ov.field_i.field_ob + -40, 0);
        if (!fh.field_c) {
            var3 = 0;
        }
        pe.field_x.a(40, -20500, ov.field_i.field_gb + -var3, -40 + ov.field_i.field_ob, var3);
    }

    final static void a(int param0, int param1, int param2, int param3) {
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        int var4;
        kl var5;
        vd.field_b.field_q = 0;
        vd.field_b.b(1, 12);
        vd.field_b.a((byte) -128, iq.field_e.nextInt());
        vd.field_b.a((byte) -75, iq.field_e.nextInt());
        if (param3 != 30) {
          var5 = (kl) null;
          ak.a(81, (kl) null, -36, 38);
          vd.field_b.b(1, param0);
          vd.field_b.b(1, param1);
          vd.field_b.b(true, param2);
          vd.field_b.a(-5247, cs.field_cb, mu.field_c);
          vl.field_n.h(32161, 18);
          fieldTemp$2 = vl.field_n.field_q + 1;
          vl.field_n.field_q = vl.field_n.field_q + 1;
          var4 = fieldTemp$2;
          vl.field_n.a(vd.field_b.field_o, 0, vd.field_b.field_q, param3 + 69);
          vl.field_n.e(-var4 + vl.field_n.field_q, param3 + 5900);
          return;
        } else {
          vd.field_b.b(1, param0);
          vd.field_b.b(1, param1);
          vd.field_b.b(true, param2);
          vd.field_b.a(-5247, cs.field_cb, mu.field_c);
          vl.field_n.h(32161, 18);
          fieldTemp$3 = vl.field_n.field_q + 1;
          vl.field_n.field_q = vl.field_n.field_q + 1;
          var4 = fieldTemp$3;
          vl.field_n.a(vd.field_b.field_o, 0, vd.field_b.field_q, param3 + 69);
          vl.field_n.e(-var4 + vl.field_n.field_q, param3 + 5900);
          return;
        }
    }

    final static wk[] b(int param0, int param1) {
        wk[] var2;
        wk[] var3;
        if (param1 != 5) {
          return (wk[]) null;
        } else {
          var3 = new wk[9];
          var2 = var3;
          var3[4] = hl.a(false, param0, 64);
          return var2;
        }
    }

    public ak() {
    }

    static {
        field_j = "This entry doesn't match";
        field_e = "You can spectate this game";
    }
}
