/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class g extends aa {
    private int field_f;
    private long field_j;
    private int field_h;
    private long field_i;
    static int[] field_g;
    private long field_k;
    private long[] field_e;

    final void b(int param0) {
        if ((this.field_i ^ -1L) > (this.field_j ^ -1L)) {
          this.field_i = this.field_i + (-this.field_i + this.field_j);
          this.field_k = (long)param0;
          return;
        } else {
          this.field_k = (long)param0;
          return;
        }
    }

    public static void b(byte param0) {
        field_g = null;
        int var1 = 31 / ((48 - param0) / 47);
    }

    final int a(int param0, long param1) {
        int var4 = 0;
        int var5 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_7_0 = 0;
        var5 = OrbDefence.field_D ? 1 : 0;
        if (param0 == -21342) {
          if (this.field_j <= this.field_i) {
            var4 = 0;
            L0: while (true) {
              this.field_j = this.field_j + param1;
              var4++;
              stackOut_15_0 = 10;
              stackIn_16_0 = stackOut_15_0;
              L1: while (true) {
                L2: {
                  if (stackIn_16_0 <= var4) {
                    break L2;
                  } else {
                    if ((this.field_i ^ -1L) < (this.field_j ^ -1L)) {
                      continue L0;
                    } else {
                      break L2;
                    }
                  }
                }
                stackOut_18_0 = ((this.field_j ^ -1L) < (this.field_i ^ -1L) ? -1 : ((this.field_j ^ -1L) == (this.field_i ^ -1L) ? 0 : 1));
                stackIn_16_0 = stackOut_18_0;
                stackIn_19_0 = stackOut_18_0;
                if (var5 != 0) {
                  continue L1;
                } else {
                  if (stackIn_19_0 > 0) {
                    this.field_j = this.field_i;
                    return var4;
                  } else {
                    return var4;
                  }
                }
              }
            }
          } else {
            this.field_k = this.field_k + (this.field_j - this.field_i);
            this.field_i = this.field_i + (-this.field_i + this.field_j);
            this.field_j = this.field_j + param1;
            return 1;
          }
        } else {
          this.field_h = 48;
          if (this.field_j <= this.field_i) {
            var4 = 0;
            L3: while (true) {
              this.field_j = this.field_j + param1;
              var4++;
              stackOut_4_0 = 10;
              stackIn_5_0 = stackOut_4_0;
              L4: while (true) {
                L5: {
                  if (stackIn_5_0 <= var4) {
                    break L5;
                  } else {
                    if ((this.field_i ^ -1L) < (this.field_j ^ -1L)) {
                      continue L3;
                    } else {
                      break L5;
                    }
                  }
                }
                stackOut_7_0 = ((this.field_j ^ -1L) < (this.field_i ^ -1L) ? -1 : ((this.field_j ^ -1L) == (this.field_i ^ -1L) ? 0 : 1));
                stackIn_5_0 = stackOut_7_0;
                stackIn_8_0 = stackOut_7_0;
                if (var5 != 0) {
                  continue L4;
                } else {
                  if (stackIn_8_0 <= 0) {
                    return var4;
                  } else {
                    this.field_j = this.field_i;
                    return var4;
                  }
                }
              }
            }
          } else {
            this.field_k = this.field_k + (this.field_j - this.field_i);
            this.field_i = this.field_i + (-this.field_i + this.field_j);
            this.field_j = this.field_j + param1;
            return 1;
          }
        }
    }

    final long a(int param0) {
        this.field_i = this.field_i + this.a(false);
        if (param0 != 17990) {
            if (!(this.field_i >= this.field_j)) {
                return (this.field_j - this.field_i) / 1000000L;
            }
            return 0L;
        }
        if (!(this.field_i >= this.field_j)) {
            return (this.field_j - this.field_i) / 1000000L;
        }
        return 0L;
    }

    final static String a(CharSequence param0, byte param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        String stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_5_0 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == -119) {
                break L1;
              } else {
                g.b((byte) 111);
                break L1;
              }
            }
            L2: {
              var2 = jj.a(param1 + 14580, bk.a(124, param0));
              if (var2 == null) {
                var2 = "";
                break L2;
              } else {
                break L2;
              }
            }
            stackOut_5_0 = (String) (var2);
            stackIn_6_0 = stackOut_5_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2_ref = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var2_ref);
            stackOut_7_1 = new StringBuilder().append("g.G(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ')');
        }
        return stackIn_6_0;
    }

    final static String[] a(int param0, char param1, String param2) {
        int incrementValue$2 = 0;
        int var3_int = 0;
        RuntimeException var3 = null;
        String[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        CharSequence var11 = null;
        String[] stackIn_13_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        String[] stackOut_12_0 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var10 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            var11 = (CharSequence) ((Object) param2);
            var3_int = bi.a(var11, param1, 126);
            var4 = new String[1 + var3_int];
            var5 = 0;
            var7 = 85 % ((param0 - -27) / 51);
            var6 = 0;
            var8 = 0;
            L1: while (true) {
              L2: {
                if (var3_int <= var8) {
                  var4[var3_int] = param2.substring(var6);
                  break L2;
                } else {
                  if (var10 != 0) {
                    break L2;
                  } else {
                    var9 = var6;
                    L3: while (true) {
                      L4: {
                        L5: {
                          if (param1 == param2.charAt(var9)) {
                            break L5;
                          } else {
                            var9++;
                            if (var10 != 0) {
                              break L4;
                            } else {
                              if (var10 == 0) {
                                continue L3;
                              } else {
                                break L5;
                              }
                            }
                          }
                        }
                        incrementValue$2 = var5;
                        var5++;
                        var4[incrementValue$2] = param2.substring(var6, var9);
                        var6 = var9 + 1;
                        var8++;
                        break L4;
                      }
                      continue L1;
                    }
                  }
                }
              }
              stackOut_12_0 = (String[]) (var4);
              stackIn_13_0 = stackOut_12_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) (var3);
            stackOut_14_1 = new StringBuilder().append("g.A(").append(param0).append(',').append(param1).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param2 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L6;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L6;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
        }
        return stackIn_13_0;
    }

    private final long a(boolean param0) {
        long var2 = 0L;
        long var4 = 0L;
        long var6 = 0L;
        int var8 = 0;
        int var9 = 0;
        long stackIn_5_0 = 0L;
        long stackIn_7_0 = 0L;
        long stackIn_15_0 = 0L;
        long stackIn_17_0 = 0L;
        long stackIn_25_0 = 0L;
        long stackIn_27_0 = 0L;
        long stackIn_34_0 = 0L;
        long stackIn_36_0 = 0L;
        long stackOut_33_0 = 0L;
        long stackOut_35_0 = 0L;
        long stackOut_24_0 = 0L;
        long stackOut_26_0 = 0L;
        long stackOut_14_0 = 0L;
        long stackOut_16_0 = 0L;
        long stackOut_4_0 = 0L;
        long stackOut_6_0 = 0L;
        var9 = OrbDefence.field_D ? 1 : 0;
        var2 = System.nanoTime();
        var4 = -this.field_k + var2;
        this.field_k = var2;
        if (var4 > -5000000000L) {
          if (5000000000L > var4) {
            this.field_e[this.field_f] = var4;
            this.field_f = (this.field_f - -1) % 10;
            if (1 > this.field_h) {
              this.field_h = this.field_h + 1;
              if (param0) {
                return 29L;
              } else {
                var6 = 0L;
                var8 = 1;
                L0: while (true) {
                  L1: {
                    L2: {
                      if (var8 > this.field_h) {
                        break L2;
                      } else {
                        stackOut_33_0 = var6 + this.field_e[(-var8 + this.field_f + 10) % 10];
                        stackIn_36_0 = stackOut_33_0;
                        stackIn_34_0 = stackOut_33_0;
                        if (var9 != 0) {
                          break L1;
                        } else {
                          var6 = stackIn_34_0;
                          var8++;
                          if (var9 == 0) {
                            continue L0;
                          } else {
                            break L2;
                          }
                        }
                      }
                    }
                    stackOut_35_0 = var6 / (long)this.field_h;
                    stackIn_36_0 = stackOut_35_0;
                    break L1;
                  }
                  return stackIn_36_0;
                }
              }
            } else {
              if (param0) {
                return 29L;
              } else {
                var6 = 0L;
                var8 = 1;
                L3: while (true) {
                  L4: {
                    L5: {
                      if (var8 > this.field_h) {
                        break L5;
                      } else {
                        stackOut_24_0 = var6 + this.field_e[(-var8 + this.field_f + 10) % 10];
                        stackIn_27_0 = stackOut_24_0;
                        stackIn_25_0 = stackOut_24_0;
                        if (var9 != 0) {
                          break L4;
                        } else {
                          var6 = stackIn_25_0;
                          var8++;
                          if (var9 == 0) {
                            continue L3;
                          } else {
                            break L5;
                          }
                        }
                      }
                    }
                    stackOut_26_0 = var6 / (long)this.field_h;
                    stackIn_27_0 = stackOut_26_0;
                    break L4;
                  }
                  return stackIn_27_0;
                }
              }
            }
          } else {
            if (param0) {
              return 29L;
            } else {
              var6 = 0L;
              var8 = 1;
              L6: while (true) {
                L7: {
                  L8: {
                    if (var8 > this.field_h) {
                      break L8;
                    } else {
                      stackOut_14_0 = var6 + this.field_e[(-var8 + this.field_f + 10) % 10];
                      stackIn_17_0 = stackOut_14_0;
                      stackIn_15_0 = stackOut_14_0;
                      if (var9 != 0) {
                        break L7;
                      } else {
                        var6 = stackIn_15_0;
                        var8++;
                        if (var9 == 0) {
                          continue L6;
                        } else {
                          break L8;
                        }
                      }
                    }
                  }
                  stackOut_16_0 = var6 / (long)this.field_h;
                  stackIn_17_0 = stackOut_16_0;
                  break L7;
                }
                return stackIn_17_0;
              }
            }
          }
        } else {
          if (param0) {
            return 29L;
          } else {
            var6 = 0L;
            var8 = 1;
            L9: while (true) {
              L10: {
                L11: {
                  if (var8 > this.field_h) {
                    break L11;
                  } else {
                    stackOut_4_0 = var6 + this.field_e[(-var8 + this.field_f + 10) % 10];
                    stackIn_7_0 = stackOut_4_0;
                    stackIn_5_0 = stackOut_4_0;
                    if (var9 != 0) {
                      break L10;
                    } else {
                      var6 = stackIn_5_0;
                      var8++;
                      if (var9 == 0) {
                        continue L9;
                      } else {
                        break L11;
                      }
                    }
                  }
                }
                stackOut_6_0 = var6 / (long)this.field_h;
                stackIn_7_0 = stackOut_6_0;
                break L10;
              }
              return stackIn_7_0;
            }
          }
        }
    }

    final static void a(int param0, java.applet.Applet param1) {
        try {
            String[] discarded$7 = null;
            Object discarded$8 = null;
            Object discarded$9 = null;
            Object discarded$10 = null;
            Object discarded$11 = null;
            Object discarded$12 = null;
            Object discarded$13 = null;
            Throwable var2 = null;
            RuntimeException var2_ref = null;
            String var3 = null;
            String var4 = null;
            java.net.URL var5 = null;
            RuntimeException stackIn_7_0 = null;
            StringBuilder stackIn_7_1 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            String stackIn_9_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_6_0 = null;
            StringBuilder stackOut_6_1 = null;
            RuntimeException stackOut_8_0 = null;
            StringBuilder stackOut_8_1 = null;
            String stackOut_8_2 = null;
            RuntimeException stackOut_7_0 = null;
            StringBuilder stackOut_7_1 = null;
            String stackOut_7_2 = null;
            try {
              try {
                L0: {
                  L1: {
                    if (param0 == 1) {
                      break L1;
                    } else {
                      var4 = (String) null;
                      discarded$7 = g.a(16, 'L', (String) null);
                      break L1;
                    }
                  }
                  var5 = param1.getCodeBase();
                  var3 = f.a(param1, var5, -123).getFile();
                  discarded$8 = gm.a(true, "updatelinks", new Object[]{"home", var3 + "home.ws"}, param1);
                  discarded$9 = gm.a(true, "updatelinks", new Object[]{"gamelist", var3 + "togamelist.ws"}, param1);
                  discarded$10 = gm.a(true, "updatelinks", new Object[]{"serverlist", var3 + "toserverlist.ws"}, param1);
                  discarded$11 = gm.a(true, "updatelinks", new Object[]{"options", var3 + "options.ws"}, param1);
                  discarded$12 = gm.a(true, "updatelinks", new Object[]{"terms", var3 + "terms.ws"}, param1);
                  discarded$13 = gm.a(true, "updatelinks", new Object[]{"privacy", var3 + "privacy.ws"}, param1);
                  break L0;
                }
              } catch (java.lang.Throwable decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var2 = decompiledCaughtException;
                return;
              }
              return;
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L2: {
                var2_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_6_0 = (RuntimeException) (var2_ref);
                stackOut_6_1 = new StringBuilder().append("g.D(").append(param0).append(',');
                stackIn_8_0 = stackOut_6_0;
                stackIn_8_1 = stackOut_6_1;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                if (param1 == null) {
                  stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
                  stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
                  stackOut_8_2 = "null";
                  stackIn_9_0 = stackOut_8_0;
                  stackIn_9_1 = stackOut_8_1;
                  stackIn_9_2 = stackOut_8_2;
                  break L2;
                } else {
                  stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
                  stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
                  stackOut_7_2 = "{...}";
                  stackIn_9_0 = stackOut_7_0;
                  stackIn_9_1 = stackOut_7_1;
                  stackIn_9_2 = stackOut_7_2;
                  break L2;
                }
              }
              throw dd.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    g() {
        this.field_f = 0;
        this.field_h = 1;
        this.field_i = 0L;
        this.field_k = 0L;
        this.field_j = 0L;
        this.field_e = new long[10];
        this.field_i = System.nanoTime();
        this.field_j = System.nanoTime();
    }

    static {
        field_g = new int[128];
    }
}
