/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kk extends ve {
    private int field_m;
    private int field_j;
    private int field_h;
    static int field_o;
    static String field_n;
    private int field_g;
    static int field_r;
    static String field_q;
    private int field_f;
    private le field_k;
    static String field_i;
    private boolean field_p;
    private String field_l;

    final void a(int param0, int param1, String param2, le param3, int param4) {
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
        le var7 = null;
        rj var8 = null;
        rj var9 = null;
        try {
          L0: {
            if (param2 == null) {
              this.field_c = null;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (this.field_k != param3) {
                  break L1;
                } else {
                  if (!this.field_p) {
                    break L1;
                  } else {
                    if (-1 != (this.field_f ^ -1)) {
                      break L1;
                    } else {
                      if (null == this.field_l) {
                        break L1;
                      } else {
                        if (this.field_l.equals(param2)) {
                          decompiledRegionSelector0 = 1;
                          break L0;
                        } else {
                          break L1;
                        }
                      }
                    }
                  }
                }
              }
              L2: {
                this.field_l = param2;
                if (param0 >= 94) {
                  break L2;
                } else {
                  var7 = (le) null;
                  this.a(-77, 114, (String) null, (le) null, -62);
                  break L2;
                }
              }
              this.field_p = true;
              this.field_k = param3;
              this.field_f = 0;
              var8 = this.a(param3, param2, (byte) 121, param4);
              var9 = var8;
              var8.field_a[0] = param1;
              var9.field_a[param2.length()] = param3.b(param2) + param1;
              fa.a(var9, param3, 0, param2, (byte) 123);
              decompiledRegionSelector0 = 2;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var6);

            stackIn_17_1 = new StringBuilder().append("kk.K(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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

            if (param3 == null) {
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
          throw ld.a((Throwable) ((Object) stackIn_18_0), stackIn_21_2 + ',' + param4 + ')');
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

    final static java.applet.Applet c(int param0) {
        if (pg.field_b != null) {
            return pg.field_b;
        }
        if (param0 != -14047) {
            kk.c(7);
            return (java.applet.Applet) ((Object) c.field_j);
        }
        return (java.applet.Applet) ((Object) c.field_j);
    }

    final void a(le param0, int param1, int param2, int param3, int param4, int param5, int param6, String param7) {
        rj stackIn_36_0;
        rj stackIn_36_1;
        int stackIn_36_2;
        int stackIn_36_3;
        rj stackIn_37_0 = null;
        rj stackIn_37_1 = null;
        int stackIn_37_2 = 0;
        int stackIn_37_3 = 0;
        int stackIn_37_4 = 0;
        rj stackIn_40_0 = null;
        le stackIn_40_1 = null;
        rj stackIn_41_0 = null;
        le stackIn_41_1 = null;
        int stackIn_41_2 = 0;
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
        rj var14 = null;
        int var15 = 0;
        String[] var16 = null;
        String[] var17 = null;
        var15 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param2 != 0) {
                break L1;
              } else {
                param2 = param0.field_C;
                break L1;
              }
            }
            if (param7 == null) {
              this.field_c = null;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L2: {
                if (this.field_k != param0) {
                  break L2;
                } else {
                  if (this.field_p) {
                    break L2;
                  } else {
                    if (param1 != this.field_f) {
                      break L2;
                    } else {
                      if (this.field_h != param3) {
                        break L2;
                      } else {
                        if (this.field_g != param2) {
                          break L2;
                        } else {
                          if (param5 != this.field_m) {
                            break L2;
                          } else {
                            if (param4 != this.field_j) {
                              break L2;
                            } else {
                              if (this.field_l == null) {
                                break L2;
                              } else {
                                if (!this.field_l.equals(param7)) {
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
                this.field_l = param7;
                this.field_h = param3;
                this.field_f = param1;
                this.field_j = param4;
                this.field_g = param2;
                this.field_p = false;
                this.field_k = param0;
                this.field_m = param5;
                var16 = new String[param0.a(param7, param4) + 1];
                var17 = var16;
                if (param6 < -113) {
                  break L3;
                } else {
                  this.field_k = (le) null;
                  break L3;
                }
              }
              L4: {
                var10 = Math.max(1, param0.a(param7, new int[]{param4}, var17));
                if (-4 != (this.field_h ^ -1)) {
                  break L4;
                } else {
                  if (1 != var10) {
                    break L4;
                  } else {
                    this.field_h = 1;
                    break L4;
                  }
                }
              }
              L5: {
                this.field_c = new rj[var10];
                if (this.field_h == 0) {
                  var11 = param0.field_E;
                  break L5;
                } else {
                  if (-2 == (this.field_h ^ -1)) {
                    var11 = (this.field_m + -(var10 * this.field_g) >> 1882456225) + param0.field_E;
                    break L5;
                  } else {
                    if (2 != this.field_h) {
                      L6: {
                        var12 = (this.field_m + -(this.field_g * var10)) / (var10 - -1);
                        if (0 <= var12) {
                          break L6;
                        } else {
                          var12 = 0;
                          break L6;
                        }
                      }
                      var11 = param0.field_E - -var12;
                      this.field_g = this.field_g + var12;
                      break L5;
                    } else {
                      var11 = -(this.field_g * var10) + this.field_m + -param0.field_G;
                      break L5;
                    }
                  }
                }
              }
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

                    stackIn_36_2 = var11 - param0.field_E;

                    stackIn_36_3 = param0.field_G + var11;

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
                    var14 = new rj(stackIn_37_2, stackIn_37_3, stackIn_37_4);
                    var14.field_a[0] = 0;
                    if (var13 == null) {
                      break L9;
                    } else {
                      L10: {
                        var14.field_a[var13.length()] = param0.b(var13);
                        stackIn_40_0 = (rj) (var14);

                        stackIn_40_1 = (le) (param0);

                        if (-4 != (param1 ^ -1)) {
                          stackIn_41_0 = (rj) ((Object) stackIn_40_0);
                          stackIn_41_1 = (le) ((Object) stackIn_40_1);
                          stackIn_41_2 = 0;
                          break L10;
                        } else {
                          stackIn_41_0 = (rj) ((Object) stackIn_40_0);
                          stackIn_41_1 = (le) ((Object) stackIn_40_1);
                          stackIn_41_2 = this.a(param4, false, param0.b(var13), var13);
                          break L10;
                        }
                      }
                      fa.a(stackIn_41_0, stackIn_41_1, stackIn_41_2, var13, (byte) 124);
                      break L9;
                    }
                  }
                  var11 = var11 + param2;
                  this.field_c[var12] = var14;
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

            stackIn_46_1 = new StringBuilder().append("kk.M(");

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
          throw ld.a((Throwable) ((Object) stackIn_47_0), stackIn_50_2 + ')');
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

    private final rj a(le param0, String param1, byte param2, int param3) {
        rj var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        rj var7 = null;
        rj stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var7 = new rj(-param0.field_E + param3, param0.field_G + param3, param1.length());
            var5 = var7;
            var6 = -83 % ((param2 - 29) / 32);
            this.field_c = new rj[]{var7};
            stackIn_1_0 = (rj) (var5);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5_ref = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var5_ref);

            stackIn_4_1 = new StringBuilder().append("kk.P(");

            if (param0 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_7_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',');

            if (param1 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_5_0), stackIn_8_2 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_1_0;
    }

    public static void d(int param0) {
        if (param0 >= -70) {
          field_r = 82;
          field_n = null;
          field_i = null;
          field_q = null;
          return;
        } else {
          field_n = null;
          field_i = null;
          field_q = null;
          return;
        }
    }

    final void a(int param0, le param1, String param2, int param3, byte param4) {
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        int var7 = 0;
        String var8 = null;
        rj var9 = null;
        try {
          L0: {
            if (param2 != null) {
              L1: {
                if (this.field_k != param1) {
                  break L1;
                } else {
                  if (!this.field_p) {
                    break L1;
                  } else {
                    if (-2 != (this.field_f ^ -1)) {
                      break L1;
                    } else {
                      if (null == this.field_l) {
                        break L1;
                      } else {
                        if (!this.field_l.equals(param2)) {
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
              L2: {
                this.field_k = param1;
                this.field_p = true;
                if (param4 == -11) {
                  break L2;
                } else {
                  var8 = (String) null;
                  this.a(59, (le) null, (String) null, 117, (byte) -57);
                  break L2;
                }
              }
              this.field_f = 1;
              var9 = this.a(param1, param2, (byte) 93, param0);
              var7 = param1.b(param2);
              var9.field_a[0] = -(var7 >> -516197599) + param3;
              var9.field_a[param2.length()] = param3 - -(var7 >> -349956415);
              fa.a(var9, param1, 0, param2, (byte) 107);
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              this.field_c = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var6);

            stackIn_16_1 = new StringBuilder().append("kk.J(").append(param0).append(',');

            if (param1 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L3;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_19_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',');

            if (param2 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L4;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L4;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_17_0), stackIn_20_2 + ',' + param3 + ',' + param4 + ')');
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

    final void a(le param0, String param1, byte param2, int param3, int param4) {
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        String var7 = null;
        rj var9 = null;
        rj var10 = null;
        try {
          L0: {
            if (param1 != null) {
              L1: {
                if (param0 != this.field_k) {
                  break L1;
                } else {
                  if (!this.field_p) {
                    break L1;
                  } else {
                    if (-3 != (this.field_f ^ -1)) {
                      break L1;
                    } else {
                      if (this.field_l == null) {
                        break L1;
                      } else {
                        if (this.field_l.equals(param1)) {
                          decompiledRegionSelector0 = 1;
                          break L0;
                        } else {
                          break L1;
                        }
                      }
                    }
                  }
                }
              }
              L2: {
                this.field_k = param0;
                this.field_l = param1;
                if (param2 <= -69) {
                  break L2;
                } else {
                  var7 = (String) null;
                  this.a((le) null, (String) null, (byte) 76, -31, 44);
                  break L2;
                }
              }
              this.field_p = true;
              this.field_f = 2;
              var9 = this.a(param0, param1, (byte) -36, param4);
              var10 = var9;
              var10.field_a[0] = -param0.b(param1) + param3;
              var10.field_a[param1.length()] = param3;
              fa.a(var10, param0, 0, param1, (byte) 120);
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              this.field_c = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var6);

            stackIn_16_1 = new StringBuilder().append("kk.O(");

            if (param0 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L3;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_19_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',');

            if (param1 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L4;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L4;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_17_0), stackIn_20_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
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

    public kk() {
    }

    static {
        field_n = "This tutorial consists of a series of demonstrations, each teaching one lesson. Move and rotate the falling blocks to make words.";
        field_r = -1;
        field_q = "The game is over when a falling block cannot fully enter the playing area.<br><br>For further details, see the instructions, which are available from the main menu and the pause menu.";
        field_i = "We closed the connection because the game was left unattended for 20 minutes. Please feel free to reconnect immediately if you are there.";
    }
}
