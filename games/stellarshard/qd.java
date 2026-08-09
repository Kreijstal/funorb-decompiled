/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qd {
    private boolean field_g;
    private int field_b;
    int field_f;
    static java.awt.Canvas field_j;
    int field_i;
    private int field_c;
    private int field_a;
    static boolean field_h;
    private int field_d;
    static String field_e;

    final void a(int param0, int param1, int param2) {
        if (this.field_i > param0) {
          if (this.field_i > param1) {
            L0: {
              this.field_b = 0;
              this.field_c = 0;
              if (0 == gh.field_c) {
                break L0;
              } else {
                this.field_g = true;
                this.field_d = gh.field_c;
                this.field_f = param1;
                this.field_a = bf.field_b;
                this.field_c = gh.field_c;
                break L0;
              }
            }
            L1: {
              if (this.field_d == 0) {
                if (0 != gh.field_c) {
                  break L1;
                } else {
                  if (fb.field_n != 0) {
                    break L1;
                  } else {
                    this.field_d = 0;
                    break L1;
                  }
                }
              } else {
                if (0 != gh.field_c) {
                  break L1;
                } else {
                  if (fb.field_n != 0) {
                    break L1;
                  } else {
                    this.field_d = 0;
                    break L1;
                  }
                }
              }
            }
            L2: {
              if ((this.field_d ^ -1) != param2) {
                break L2;
              } else {
                L3: {
                  if (this.field_g) {
                    break L3;
                  } else {
                    if (qc.field_a) {
                      break L3;
                    } else {
                      break L2;
                    }
                  }
                }
                if (-1 >= (param0 ^ -1)) {
                  L4: {
                    if (param0 != this.field_f) {
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  this.field_g = true;
                  this.field_f = param0;
                  break L2;
                } else {
                  if (!this.field_g) {
                    break L2;
                  } else {
                    this.field_f = -1;
                    break L2;
                  }
                }
              }
            }
            return;
          } else {
            throw new IllegalArgumentException();
          }
        } else {
          throw new IllegalArgumentException();
        }
    }

    final static void a(java.applet.Applet param0, byte param1) {
        try {
            java.net.URL var2 = null;
            java.applet.Applet var3 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            String stackIn_9_2 = null;
            Throwable decompiledCaughtException = null;
            Exception var2_ref = null;
            RuntimeException var2_ref2 = null;
            try {
              L0: {
                try {
                  L1: {
                    var2 = new java.net.URL(param0.getCodeBase(), "subscribe.ws");
                    param0.getAppletContext().showDocument(lk.a(param0, var2, 114), "_top");
                    break L1;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L2: {
                    var2_ref = (Exception) (Object) decompiledCaughtException;
                    var2_ref.printStackTrace();
                    break L2;
                  }
                }
                L3: {
                  if (param1 == -30) {
                    break L3;
                  } else {
                    var3 = (java.applet.Applet) null;
                    qd.a((java.applet.Applet) null, (byte) 50);
                    break L3;
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L4: {
                var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_8_0 = (RuntimeException) (var2_ref2);

                stackIn_8_1 = new StringBuilder().append("qd.C(");

                if (param0 == null) {
                  stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
                  stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
                  stackIn_9_2 = "null";
                  break L4;
                } else {
                  stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
                  stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
                  stackIn_9_2 = "{...}";
                  break L4;
                }
              }
              throw ma.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void b(int param0) {
        field_e = null;
        field_j = null;
        int var1 = 114 / ((param0 - -85) / 39);
    }

    final static pb a(pf param0, String param1, String param2, byte param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        java.applet.Applet var6 = null;
        pb stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var4_int = param0.b(param2, (byte) -118);
              if (param3 >= 41) {
                break L1;
              } else {
                var6 = (java.applet.Applet) null;
                qd.a((java.applet.Applet) null, (byte) -109);
                break L1;
              }
            }
            var5 = param0.a(var4_int, param1, (byte) -11);
            stackIn_3_0 = vc.a(param0, var5, var4_int, -2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var4);

            stackIn_6_1 = new StringBuilder().append("qd.A(");

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
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param2 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_7_0), stackIn_13_2 + ',' + param3 + ')');
        }
        return stackIn_3_0;
    }

    final void a(int param0, int param1, boolean param2, boolean param3) {
        this.field_d = 0;
        this.field_g = param2 ? true : false;
        if (param3) {
            return;
        }
        if (!this.field_g) {
            this.field_f = param1;
        } else {
            this.field_f = param0;
        }
    }

    final void a(int param0) {
        this.field_c = 0;
        this.field_b = param0;
        if (-1 == (this.field_d ^ -1)) {
            if (!((gi.field_f ^ -1) != -99)) {
                if (-1 <= (this.field_f ^ -1)) {
                    this.field_f = this.field_i;
                }
                this.field_f = this.field_f - 1;
                this.field_g = false;
            }
        }
        if (!(this.field_d != 0)) {
            this.field_b = gi.field_f;
        }
        if (this.field_d == 0 && 99 == gi.field_f) {
            this.field_f = this.field_f + 1;
            if (!(this.field_f < this.field_i)) {
                this.field_f = 0;
            }
            this.field_g = false;
        }
    }

    final boolean c(int param0) {
        int stackIn_8_0 = 0;
        L0: {
          if (param0 < -9) {
            break L0;
          } else {
            this.field_a = 75;
            break L0;
          }
        }
        L1: {
          L2: {
            if (0 != this.field_c) {
              break L2;
            } else {
              if (84 == this.field_b) {
                break L2;
              } else {
                if ((this.field_b ^ -1) != -84) {
                  stackIn_8_0 = 0;
                  break L1;
                } else {
                  break L2;
                }
              }
            }
          }
          stackIn_8_0 = 1;
          break L1;
        }
        return stackIn_8_0 != 0;
    }

    final static pb[] a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int var9;
        pb[] var10;
        pb[] var11_ref_pb__;
        int var11;
        int var12;
        pb var13;
        int var14;
        int var15;
        String var16;
        var15 = stellarshard.field_B;
        var9 = param1 + param5 - -param7;
        var10 = new pb[]{new pb(var9, var9), new pb(param8, var9), new pb(var9, var9), new pb(var9, param8), new pb(64, 64), new pb(var9, param8), new pb(var9, var9), new pb(param8, var9), new pb(var9, var9)};
        var11_ref_pb__ = var10;
        var12 = 0;
        L0: while (true) {
          if (var12 >= var11_ref_pb__.length) {
            L1: {
              var11 = 0;
              if (param6 == -1) {
                break L1;
              } else {
                var16 = (String) null;
                qd.a((pf) null, (String) null, (String) null, (byte) 11);
                break L1;
              }
            }
            L2: while (true) {
              if (var11 >= param5) {
                var11 = 0;
                L3: while (true) {
                  if (param5 <= var11) {
                    var11 = 0;
                    L4: while (true) {
                      if (var11 >= param8) {
                        var11 = 0;
                        L5: while (true) {
                          if (var11 >= param8 >> -688875967) {
                            return var10;
                          } else {
                            var12 = 0;
                            L6: while (true) {
                              if (var12 < param7) {
                                var10[1].field_z[var11 + (var9 + (-var12 + -1)) * param8] = param3;
                                var10[3].field_z[var11 * var9 + (-var12 + -1) + var9] = param3;
                                var10[7].field_z[var12 * param8 + var11] = param3;
                                var10[5].field_z[var12 + var9 * var11] = param3;
                                var12++;
                                continue L6;
                              } else {
                                var11++;
                                continue L5;
                              }
                            }
                          }
                        }
                      } else {
                        var12 = 0;
                        L7: while (true) {
                          if (param5 > var12) {
                            var10[7].field_z[(-1 + (-var12 + var9)) * param8 - -var11] = param2;
                            var10[5].field_z[var11 * var9 - -var9 - (1 + var12)] = param2;
                            var10[1].field_z[param8 * var12 - -var11] = param0;
                            var10[3].field_z[var12 + var11 * var9] = param0;
                            var12++;
                            continue L7;
                          } else {
                            var11++;
                            continue L4;
                          }
                        }
                      }
                    }
                  } else {
                    var12 = 0;
                    L8: while (true) {
                      if (var9 <= var12) {
                        var11++;
                        continue L3;
                      } else {
                        var10[0].field_z[var12 + var11 * var9] = param0;
                        var10[0].field_z[var9 * var12 + var11] = param0;
                        if (-var11 + var9 > var12) {
                          var10[2].field_z[var12 - -(var9 * var11)] = param0;
                          var10[6].field_z[var11 + var9 * var12] = param0;
                          var12++;
                          continue L8;
                        } else {
                          var12++;
                          continue L8;
                        }
                      }
                    }
                  }
                }
              } else {
                var12 = 0;
                L9: while (true) {
                  if (var9 > var12) {
                    var10[6].field_z[var12 + var9 * (-1 + -var11 + var9)] = param2;
                    var10[8].field_z[var12 + (-1 + (var9 + -var11)) * var9] = param2;
                    var10[2].field_z[var9 * var12 + var9 - (1 - -var11)] = param2;
                    var10[8].field_z[-1 - -var9 + (-var11 + var12 * var9)] = param2;
                    var12++;
                    continue L9;
                  } else {
                    var11++;
                    continue L2;
                  }
                }
              }
            }
          } else {
            var13 = var11_ref_pb__[var12];
            var14 = 0;
            L10: while (true) {
              if (var13.field_z.length <= var14) {
                var12++;
                continue L0;
              } else {
                var13.field_z[var14] = param4;
                var14++;
                continue L10;
              }
            }
          }
        }
    }

    final void a(int param0, int param1) {
        L0: {
          this.field_b = 0;
          if (param1 == 84) {
            break L0;
          } else {
            field_j = (java.awt.Canvas) null;
            break L0;
          }
        }
        L1: {
          this.field_c = 0;
          if (-1 != (this.field_d ^ -1)) {
            break L1;
          } else {
            this.field_b = gi.field_f;
            break L1;
          }
        }
        L2: {
          if (0 != this.field_d) {
            break L2;
          } else {
            if (96 == gi.field_f) {
              L3: {
                if (-1 <= (this.field_f ^ -1)) {
                  this.field_f = this.field_i;
                  break L3;
                } else {
                  break L3;
                }
              }
              this.field_g = false;
              this.field_f = this.field_f - 1;
              break L2;
            } else {
              break L2;
            }
          }
        }
        L4: {
          if (-1 != (this.field_d ^ -1)) {
            break L4;
          } else {
            if ((gi.field_f ^ -1) != -98) {
              break L4;
            } else {
              L5: {
                this.field_f = this.field_f + 1;
                if (this.field_i > this.field_f) {
                  break L5;
                } else {
                  this.field_f = 0;
                  break L5;
                }
              }
              this.field_g = false;
              break L4;
            }
          }
        }
        L6: {
          if (this.field_d != 0) {
            break L6;
          } else {
            L7: {
              if (gi.field_f == 98) {
                break L7;
              } else {
                if (gi.field_f == 99) {
                  break L7;
                } else {
                  break L6;
                }
              }
            }
            this.field_g = false;
            if (0 > this.field_f) {
              this.field_f = param0;
              break L6;
            } else {
              break L6;
            }
          }
        }
    }

    qd(int param0) {
        this.field_f = 0;
        this.field_g = false;
        this.field_i = param0;
    }

    static {
        field_e = "Loading music";
    }
}
