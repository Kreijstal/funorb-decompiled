/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gla extends ci {
    private int field_n;
    static String field_q;
    static it field_p;
    static String field_o;
    static int field_m;

    public static void d(byte param0) {
        field_p = null;
        field_o = null;
        if (param0 >= -91) {
            field_p = (it) null;
            field_q = null;
            return;
        }
        field_q = null;
    }

    final int[] c(int param0, int param1) {
        int stackIn_16_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_52_0 = 0;
        int stackIn_58_0 = 0;
        int stackIn_65_0 = 0;
        int stackIn_72_0 = 0;
        int[] var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int[] var9;
        int[] var10;
        int[] var11;
        var8 = TombRacer.field_G ? 1 : 0;
        if (param0 == 1) {
          var11 = this.field_i.a((byte) 17, param1);
          var10 = var11;
          var9 = var10;
          var3 = var9;
          if (this.field_i.field_d) {
            var4 = sj.field_b[param1];
            var5 = 0;
            L0: while (true) {
              if (ns.field_g > var5) {
                L1: {
                  var6 = ht.field_Fb[var5];
                  if (var6 <= this.field_n) {
                    break L1;
                  } else {
                    if (var6 >= -this.field_n + 4096) {
                      break L1;
                    } else {
                      if (var4 <= -this.field_n + 2048) {
                        break L1;
                      } else {
                        if (var4 < this.field_n + 2048) {
                          L2: {
                            var7 = 2048 + -var6;
                            if (-1 < (var7 ^ -1)) {
                              stackIn_52_0 = -var7;
                              break L2;
                            } else {
                              stackIn_52_0 = var7;
                              break L2;
                            }
                          }
                          var7 = stackIn_52_0;
                          var7 = var7 << 12;
                          var7 = var7 / (-this.field_n + 2048);
                          var9[var5] = -var7 + 4096;
                          var5++;
                          continue L0;
                        } else {
                          break L1;
                        }
                      }
                    }
                  }
                }
                L3: {
                  if (var6 <= 2048 + -this.field_n) {
                    break L3;
                  } else {
                    if (var6 >= 2048 - -this.field_n) {
                      break L3;
                    } else {
                      L4: {
                        var7 = var4 + -2048;
                        if (0 > var7) {
                          stackIn_58_0 = -var7;
                          break L4;
                        } else {
                          stackIn_58_0 = var7;
                          break L4;
                        }
                      }
                      var7 = stackIn_58_0;
                      var7 = var7 - this.field_n;
                      var7 = var7 << 12;
                      var9[var5] = var7 / (-this.field_n + 2048);
                      var5++;
                      continue L0;
                    }
                  }
                }
                L5: {
                  if (this.field_n > var4) {
                    break L5;
                  } else {
                    if (4096 - this.field_n >= var4) {
                      L6: {
                        if (var6 < this.field_n) {
                          break L6;
                        } else {
                          if (var6 <= -this.field_n + 4096) {
                            var11[var5] = 0;
                            var5++;
                            continue L0;
                          } else {
                            break L6;
                          }
                        }
                      }
                      L7: {
                        var7 = 2048 - var4;
                        if ((var7 ^ -1) > -1) {
                          stackIn_72_0 = -var7;
                          break L7;
                        } else {
                          stackIn_72_0 = var7;
                          break L7;
                        }
                      }
                      var7 = stackIn_72_0;
                      var7 = var7 << 12;
                      var7 = var7 / (2048 - this.field_n);
                      var9[var5] = -var7 + 4096;
                      var5++;
                      continue L0;
                    } else {
                      break L5;
                    }
                  }
                }
                L8: {
                  var7 = var6 - 2048;
                  if ((var7 ^ -1) <= -1) {
                    stackIn_65_0 = var7;
                    break L8;
                  } else {
                    stackIn_65_0 = -var7;
                    break L8;
                  }
                }
                var7 = stackIn_65_0;
                var7 = var7 - this.field_n;
                var7 = var7 << 12;
                var9[var5] = var7 / (-this.field_n + 2048);
                var5++;
                continue L0;
              } else {
                return var9;
              }
            }
          } else {
            return var9;
          }
        } else {
          field_p = (it) null;
          var11 = this.field_i.a((byte) 17, param1);
          var10 = var11;
          var9 = var10;
          var3 = var9;
          if (this.field_i.field_d) {
            var9 = var3;
            var11 = var10;
            var4 = sj.field_b[param1];
            var5 = 0;
            L9: while (true) {
              if (ns.field_g > var5) {
                L10: {
                  var6 = ht.field_Fb[var5];
                  if (var6 <= this.field_n) {
                    break L10;
                  } else {
                    if (var6 >= -this.field_n + 4096) {
                      break L10;
                    } else {
                      if (var4 <= -this.field_n + 2048) {
                        break L10;
                      } else {
                        if (var4 < this.field_n + 2048) {
                          L11: {
                            var7 = 2048 + -var6;
                            if (-1 < (var7 ^ -1)) {
                              stackIn_16_0 = -var7;
                              break L11;
                            } else {
                              stackIn_16_0 = var7;
                              break L11;
                            }
                          }
                          var7 = stackIn_16_0;
                          var7 = var7 << 12;
                          var7 = var7 / (-this.field_n + 2048);
                          var9[var5] = -var7 + 4096;
                          var5++;
                          continue L9;
                        } else {
                          break L10;
                        }
                      }
                    }
                  }
                }
                L12: {
                  if (var6 <= 2048 + -this.field_n) {
                    break L12;
                  } else {
                    if (var6 >= 2048 - -this.field_n) {
                      break L12;
                    } else {
                      L13: {
                        var7 = var4 + -2048;
                        if (0 > var7) {
                          stackIn_22_0 = -var7;
                          break L13;
                        } else {
                          stackIn_22_0 = var7;
                          break L13;
                        }
                      }
                      var7 = stackIn_22_0;
                      var7 = var7 - this.field_n;
                      var7 = var7 << 12;
                      var9[var5] = var7 / (-this.field_n + 2048);
                      var5++;
                      continue L9;
                    }
                  }
                }
                L14: {
                  if (this.field_n > var4) {
                    break L14;
                  } else {
                    if (4096 - this.field_n >= var4) {
                      L15: {
                        if (var6 < this.field_n) {
                          break L15;
                        } else {
                          if (var6 <= -this.field_n + 4096) {
                            var11[var5] = 0;
                            var5++;
                            continue L9;
                          } else {
                            break L15;
                          }
                        }
                      }
                      L16: {
                        var7 = 2048 - var4;
                        if ((var7 ^ -1) > -1) {
                          stackIn_36_0 = -var7;
                          break L16;
                        } else {
                          stackIn_36_0 = var7;
                          break L16;
                        }
                      }
                      var7 = stackIn_36_0;
                      var7 = var7 << 12;
                      var7 = var7 / (2048 - this.field_n);
                      var9[var5] = -var7 + 4096;
                      var5++;
                      continue L9;
                    } else {
                      break L14;
                    }
                  }
                }
                L17: {
                  var7 = var6 - 2048;
                  if ((var7 ^ -1) <= -1) {
                    stackIn_29_0 = var7;
                    break L17;
                  } else {
                    stackIn_29_0 = -var7;
                    break L17;
                  }
                }
                var7 = stackIn_29_0;
                var7 = var7 - this.field_n;
                var7 = var7 << 12;
                var9[var5] = var7 / (-this.field_n + 2048);
                var5++;
                continue L9;
              } else {
                return var9;
              }
            }
          } else {
            return var9;
          }
        }
    }

    public gla() {
        super(0, true);
        this.field_n = 585;
    }

    final void a(byte param0, uia param1, int param2) {
        int var4_int = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          L0: {
            L1: {
              var4_int = param2;
              if (var4_int == 0) {
                this.field_n = param1.d(124);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param0 == 107) {
                break L2;
              } else {
                gla.d((byte) 92);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var4);

            stackIn_8_1 = new StringBuilder().append("gla.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param2 + ')');
        }
    }

    static {
        field_q = "Room complete +<%0>";
        field_p = new it();
        field_o = "Idols";
        field_m = -1;
    }
}
