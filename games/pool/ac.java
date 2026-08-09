/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ac extends tm {
    static String field_l;
    static dd field_n;
    static vh field_p;
    static int[] field_r;
    static String field_q;
    static int[] field_o;
    static int field_m;

    final static void a(int param0, boolean param1, boolean param2, cg param3) {
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        Throwable decompiledCaughtException = null;
        Object var4 = null;
        RuntimeException var4_ref = null;
        try {
          L0: {
            L1: {
              if (ij.field_u == param3) {
                break L1;
              } else {
                var4 = tl.field_N;
                synchronized (var4) {
                  L2: {
                    tl.field_N.a((byte) -121, -1, 256);
                    ij.field_u = param3;
                    tl.field_N.a(param3, param1, (byte) -14, param2);
                    break L2;
                  }
                }
                break L1;
              }
            }
            L3: {
              if (param0 == 256) {
                break L3;
              } else {
                field_p = (vh) null;
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var4_ref);

            stackIn_11_1 = new StringBuilder().append("ac.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
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
          throw wm.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
        }
    }

    final int a(int param0, boolean param1) {
        int var3;
        int var4;
        di var5;
        var4 = Pool.field_O;
        if (!param1) {
          var5 = (di) null;
          this.a(-117, (di) null);
          var3 = param0;
          if (var3 != 0) {
            if (1 != var3) {
              if (var3 != 2) {
                if (var3 != 3) {
                  if (-5 != (var3 ^ -1)) {
                    if (5 != var3) {
                      if (6 != var3) {
                        if (7 != var3) {
                          if (var3 != 8) {
                            if (-10 != (var3 ^ -1)) {
                              if (10 != var3) {
                                if (var3 != 11) {
                                  if ((var3 ^ -1) != -13) {
                                    if (13 != var3) {
                                      if (-15 != (var3 ^ -1)) {
                                        if ((var3 ^ -1) == -16) {
                                          return this.c(101, 1);
                                        } else {
                                          return 16711935;
                                        }
                                      } else {
                                        return this.c(101, 1);
                                      }
                                    } else {
                                      return this.c(101, 1);
                                    }
                                  } else {
                                    return this.c(101, 1);
                                  }
                                } else {
                                  return this.c(101, 1);
                                }
                              } else {
                                return this.c(101, 1);
                              }
                            } else {
                              return this.c(101, 1);
                            }
                          } else {
                            return 3355443;
                          }
                        } else {
                          return this.c(91, 0);
                        }
                      } else {
                        return this.c(91, 0);
                      }
                    } else {
                      return this.c(91, 0);
                    }
                  } else {
                    return this.c(91, 0);
                  }
                } else {
                  return this.c(91, 0);
                }
              } else {
                return this.c(91, 0);
              }
            } else {
              return this.c(91, 0);
            }
          } else {
            return 13421772;
          }
        } else {
          var3 = param0;
          if (var3 != 0) {
            if (1 != var3) {
              if (var3 != 2) {
                if (var3 != 3) {
                  if (-5 != (var3 ^ -1)) {
                    if (5 != var3) {
                      if (6 != var3) {
                        if (7 != var3) {
                          if (var3 != 8) {
                            if (-10 != (var3 ^ -1)) {
                              if (10 != var3) {
                                if (var3 != 11) {
                                  if ((var3 ^ -1) != -13) {
                                    if (13 != var3) {
                                      if (-15 != (var3 ^ -1)) {
                                        if ((var3 ^ -1) != -16) {
                                          return 16711935;
                                        } else {
                                          return this.c(101, 1);
                                        }
                                      } else {
                                        return this.c(101, 1);
                                      }
                                    } else {
                                      return this.c(101, 1);
                                    }
                                  } else {
                                    return this.c(101, 1);
                                  }
                                } else {
                                  return this.c(101, 1);
                                }
                              } else {
                                return this.c(101, 1);
                              }
                            } else {
                              return this.c(101, 1);
                            }
                          } else {
                            return 3355443;
                          }
                        } else {
                          return this.c(91, 0);
                        }
                      } else {
                        return this.c(91, 0);
                      }
                    } else {
                      return this.c(91, 0);
                    }
                  } else {
                    return this.c(91, 0);
                  }
                } else {
                  return this.c(91, 0);
                }
              } else {
                return this.c(91, 0);
              }
            } else {
              return this.c(91, 0);
            }
          } else {
            return 13421772;
          }
        }
    }

    final String a(byte param0, int param1) {
        if (param0 < 9) {
            return (String) null;
        }
        if ((param1 ^ -1) == -1) {
            return ae.field_b;
        }
        return ae.field_b;
    }

    final boolean c(int param0) {
        if (param0 != 2) {
            field_q = (String) null;
            return false;
        }
        return false;
    }

    public static void i(int param0) {
        if (param0 < 78) {
          ac.i(94);
          field_l = null;
          field_n = null;
          field_q = null;
          field_p = null;
          field_o = null;
          field_r = null;
          return;
        } else {
          field_l = null;
          field_n = null;
          field_q = null;
          field_p = null;
          field_o = null;
          field_r = null;
          return;
        }
    }

    private final int c(int param0, int param1) {
        if (param0 > 75) {
          if (param1 != 0) {
            if ((param1 ^ -1) != -2) {
              return 16777215;
            } else {
              return 6715289;
            }
          } else {
            return 13158;
          }
        } else {
          ac.i(-122);
          if (param1 != 0) {
            if ((param1 ^ -1) != -2) {
              return 16777215;
            } else {
              return 6715289;
            }
          } else {
            return 13158;
          }
        }
    }

    final void a(int param0, di param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 198123656) {
                break L1;
              } else {
                this.c(45);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("ac.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    final static void b(int param0, byte param1) {
        int var2 = 99 % ((-11 - param1) / 49);
        fm.field_M = fm.field_M + param0;
        tq.field_q = (no.field_q.field_y - -sa.field_h.field_C >> 106614625) + fm.field_M;
    }

    final void a(di param0, byte param1) {
        eg dupTemp$0 = null;
        if (this.field_a != null) {
            return;
        }
        try {
            this.field_a = new eg[16];
            this.field_a[0] = this.g(-930305852);
            dupTemp$0 = eg.a(param0, "", "balls/ball_killer_red");
            this.field_a[15] = dupTemp$0;
            this.field_a[14] = dupTemp$0;
            this.field_a[13] = dupTemp$0;
            this.field_a[12] = dupTemp$0;
            this.field_a[11] = dupTemp$0;
            this.field_a[10] = dupTemp$0;
            this.field_a[9] = dupTemp$0;
            this.field_a[7] = dupTemp$0;
            this.field_a[6] = dupTemp$0;
            this.field_a[5] = dupTemp$0;
            this.field_a[4] = dupTemp$0;
            this.field_a[3] = dupTemp$0;
            this.field_a[2] = dupTemp$0;
            this.field_a[1] = dupTemp$0;
            this.field_a[8] = eg.a(param0, "", "balls/ball_killer_black");
            if (param1 != 117) {
                this.c(40);
            }
            this.field_a[1].a(8, 8, 8, 4);
            this.field_a[8].a(8, 8, 8, 4);
            li.a(this.field_a[1], 0);
            li.a(this.field_a[8], 0);
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) ((Object) runtimeException), "ac.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    ac() {
        this.field_g = false;
    }

    static {
        int var0 = 0;
        long var4 = 0L;
        long var6 = 0L;
        int var2 = 0;
        int var3 = 0;
        int var1 = 0;
        field_l = "Player Name: ";
        field_q = "Unpacking music";
        field_r = new int[]{2, 20, 21, 49, 6, 5, 9};
        field_o = new int[98304];
        for (var0 = 92682; 46341 <= var0; var0--) {
            var4 = (long)((var0 << 738371457) + -1);
            var6 = (long)((var0 << -604846783) + 1);
            var2 = (int)(-32768L + (var4 * var4 >> -220200046));
            var3 = (int)(-32768L + (var6 * var6 >> 581461202));
            if (field_o.length <= var3) {
                var3 = -1 + field_o.length;
            }
            for (var1 = (var2 ^ -1) <= -1 ? var2 : 0; var3 >= var1; var1++) {
                field_o[var1] = var0;
            }
        }
        field_m = -1;
    }
}
