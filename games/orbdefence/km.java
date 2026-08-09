/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class km {
    private im field_c;
    static String field_b;
    private ca field_a;

    final static boolean a(boolean param0) {
        if (param0) {
            km.a(62);
            return null != mg.field_k ? true : wg.field_o;
        }
        return null != mg.field_k ? true : wg.field_o;
    }

    final static void a(int param0) {
        wl.a(uj.b((byte) -120), (byte) 67);
        if (param0 != 16711935) {
            km.a(83);
        }
    }

    final ca b(boolean param0) {
        ca var2;
        var2 = this.field_a;
        if (this.field_c.field_d != var2) {
          this.field_a = var2.field_e;
          if (!param0) {
            return (ca) null;
          } else {
            return var2;
          }
        } else {
          this.field_a = null;
          return null;
        }
    }

    final ca b(ca param0, byte param1) {
        ca var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_5_0 = null;
        ca stackIn_8_0 = null;
        ca stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              L2: {
                if (param0 == null) {
                  break L2;
                } else {
                  var3 = param0;
                  if (!OrbDefence.field_D) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              var3 = this.field_c.field_d.field_c;
              break L1;
            }
            if (this.field_c.field_d != var3) {
              this.field_a = var3.field_c;
              if (param1 <= -114) {
                stackIn_10_0 = (ca) (var3);
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_8_0 = (ca) null;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              this.field_a = null;
              stackIn_5_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var3_ref);

            stackIn_13_1 = new StringBuilder().append("km.J(");

            if (param0 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (ca) ((Object) stackIn_5_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            return stackIn_10_0;
          }
        }
    }

    final static void a(byte param0, int param1) {
        og.field_b = 100 * param1 / 150;
        og.field_o = 400 * param1 / 150;
        if (param0 > -18) {
          return;
        } else {
          og.field_a = (param1 << 932598544) / 150;
          return;
        }
    }

    final ca a(byte param0) {
        ca var2;
        if (param0 < -69) {
          var2 = this.field_a;
          if (this.field_c.field_d == var2) {
            this.field_a = null;
            return null;
          } else {
            this.field_a = var2.field_c;
            return var2;
          }
        } else {
          this.field_a = (ca) null;
          var2 = this.field_a;
          if (this.field_c.field_d == var2) {
            this.field_a = null;
            return null;
          } else {
            this.field_a = var2.field_c;
            return var2;
          }
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int incrementValue$1 = 0;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var13 = OrbDefence.field_D ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var7_int = param4 + ul.field_f * param3;
                        var8 = param2 & 16711935;
                        param2 = param2 & 65280;
                        var9 = 0;
                        if (param1 > 53) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        field_b = (String) null;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (param6 <= var9) {
                            statePc = 10;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var10 = (1 + var9) * (-param5 + param0) / (1 + param6) + param5;
                        var11 = ul.field_b[var7_int];
                        var12 = 16711935 & var11;
                        var11 = var11 & 65280;
                        var12 = (var8 * var10 & -16711936) + ((256 - var10) * var12 & -16711936);
                        var11 = (16711680 & var10 * param2) - -(16711680 & (-var10 + 256) * var11);
                        incrementValue$1 = var7_int;
                        var7_int++;
                        ul.field_b[incrementValue$1] = ge.a(var12, var11) >>> -1215909112;
                        var9++;
                        if (var13 == 0) {
                            statePc = 6;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        return;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (var13 == 0) {
                            statePc = 3;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        return;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 9: {
                    var7 = (RuntimeException) ((Object) caughtException);
                    throw dd.a((Throwable) ((Object) var7), "km.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
                }
                case 10: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void b(int param0) {
        Object var1 = null;
        Throwable var2 = null;
        Throwable decompiledCaughtException = null;
        if (null == nk.field_q) {
          if (param0 >= -39) {
            field_b = (String) null;
            return;
          } else {
            return;
          }
        } else {
          var1 = nk.field_q;
          synchronized (var1) {
            L0: {
              nk.field_q = null;
              break L0;
            }
          }
          L1: {
            if (param0 < -39) {
              break L1;
            } else {
              field_b = (String) null;
              break L1;
            }
          }
          return;
        }
    }

    final static void a(long param0, int param1) {
        try {
            try {
                Thread.sleep(param0);
            } catch (InterruptedException interruptedException) {
            }
            if (param1 != -25680) {
                km.b(-100);
                return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final ca d(int param0) {
        ca var2;
        var2 = this.field_c.field_d.field_e;
        if (param0 == 27935) {
          if (this.field_c.field_d == var2) {
            this.field_a = null;
            return null;
          } else {
            this.field_a = var2.field_e;
            return var2;
          }
        } else {
          this.field_c = (im) null;
          if (this.field_c.field_d == var2) {
            this.field_a = null;
            return null;
          } else {
            this.field_a = var2.field_e;
            return var2;
          }
        }
    }

    public static void e(int param0) {
        field_b = null;
        if (param0 <= 89) {
            km.a((byte) 49, 77);
        }
    }

    final ca a(ca param0, byte param1) {
        ca var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_8_0 = null;
        ca stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              L2: {
                if (param0 != null) {
                  break L2;
                } else {
                  var3 = this.field_c.field_d.field_e;
                  if (!OrbDefence.field_D) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              var3 = param0;
              break L1;
            }
            L3: {
              if (param1 == -1) {
                break L3;
              } else {
                km.a(true);
                break L3;
              }
            }
            if (this.field_c.field_d == var3) {
              this.field_a = null;
              stackIn_8_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              this.field_a = var3.field_e;
              stackIn_10_0 = (ca) (var3);
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var3_ref);

            stackIn_13_1 = new StringBuilder().append("km.D(");

            if (param0 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L4;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L4;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (ca) ((Object) stackIn_8_0);
        } else {
          return stackIn_10_0;
        }
    }

    km(im param0) {
        try {
            this.field_c = param0;
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) ((Object) runtimeException), "km.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final ca c(int param0) {
        ca var2;
        var2 = this.field_c.field_d.field_c;
        if (var2 == this.field_c.field_d) {
          this.field_a = null;
          return null;
        } else {
          this.field_a = var2.field_c;
          if (param0 != -7651) {
            field_b = (String) null;
            return var2;
          } else {
            return var2;
          }
        }
    }

    static {
        field_b = "Invalid password.";
    }
}
