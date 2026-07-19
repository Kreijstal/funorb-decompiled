/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class es extends ip {
    private long field_e;
    private long[] field_i;
    static int[] field_h;
    private int field_g;
    private int field_c;
    private long field_f;
    private long field_d;

    final void a(int param0) {
        boolean discarded$2 = false;
        L0: {
          if ((this.field_d ^ -1L) > (this.field_f ^ -1L)) {
            this.field_d = this.field_d + (-this.field_d + this.field_f);
            break L0;
          } else {
            break L0;
          }
        }
        this.field_e = 0L;
        if (param0 <= 100) {
          discarded$2 = es.a(false);
          return;
        } else {
          return;
        }
    }

    final int a(long param0, int param1) {
        int var4 = 0;
        int var5 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_7_0 = 0;
        var5 = TombRacer.field_G ? 1 : 0;
        if (param1 == 0) {
          if (this.field_d < this.field_f) {
            this.field_e = this.field_e + (this.field_f - this.field_d);
            this.field_d = this.field_d + (-this.field_d + this.field_f);
            this.field_f = this.field_f + param0;
            return 1;
          } else {
            var4 = 0;
            L0: while (true) {
              var4++;
              this.field_f = this.field_f + param0;
              stackOut_4_0 = -11;
              stackIn_5_0 = stackOut_4_0;
              L1: while (true) {
                L2: {
                  if (stackIn_5_0 >= (var4 ^ -1)) {
                    break L2;
                  } else {
                    if ((this.field_f ^ -1L) > (this.field_d ^ -1L)) {
                      continue L0;
                    } else {
                      break L2;
                    }
                  }
                }
                stackOut_7_0 = (this.field_f < this.field_d ? -1 : (this.field_f == this.field_d ? 0 : 1));
                stackIn_5_0 = stackOut_7_0;
                stackIn_8_0 = stackOut_7_0;
                if (var5 != 0) {
                  continue L1;
                } else {
                  L3: {
                    if (stackIn_8_0 < 0) {
                      this.field_f = this.field_d;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  return var4;
                }
              }
            }
          }
        } else {
          return 57;
        }
    }

    final long a(byte param0) {
        boolean discarded$5 = false;
        this.field_d = this.field_d + this.d(-97);
        if (param0 >= 27) {
          if ((this.field_f ^ -1L) < (this.field_d ^ -1L)) {
            return (-this.field_d + this.field_f) / 1000000L;
          } else {
            return 0L;
          }
        } else {
          discarded$5 = es.a(false);
          if ((this.field_f ^ -1L) < (this.field_d ^ -1L)) {
            return (-this.field_d + this.field_f) / 1000000L;
          } else {
            return 0L;
          }
        }
    }

    final static boolean a(boolean param0) {
        Object var1 = null;
        Throwable var2 = null;
        int stackIn_6_0 = 0;
        int stackIn_8_0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_7_0 = 0;
        L0: {
          if (param0) {
            break L0;
          } else {
            field_h = (int[]) null;
            break L0;
          }
        }
        var1 = nfa.field_n;
        synchronized (var1) {
          L1: {
            if (vha.field_b == nt.field_a) {
              stackOut_5_0 = 0;
              stackIn_6_0 = stackOut_5_0;
              return stackIn_6_0 != 0;
            } else {
              fna.field_h = dl.field_o[vha.field_b];
              kda.field_td = uk.field_O[vha.field_b];
              vha.field_b = 1 + vha.field_b & 127;
              stackOut_7_0 = 1;
              stackIn_8_0 = stackOut_7_0;
              break L1;
            }
          }
        }
        return stackIn_8_0 != 0;
    }

    private final long d(int param0) {
        long var2 = 0L;
        long var4 = 0L;
        long var6 = 0L;
        int var8 = 0;
        int var9 = 0;
        long stackIn_5_0 = 0L;
        long stackIn_7_0 = 0L;
        long stackIn_11_0 = 0L;
        long stackIn_13_0 = 0L;
        long stackIn_20_0 = 0L;
        long stackIn_22_0 = 0L;
        long stackIn_26_0 = 0L;
        long stackIn_28_0 = 0L;
        long stackIn_35_0 = 0L;
        long stackIn_37_0 = 0L;
        long stackIn_41_0 = 0L;
        long stackIn_43_0 = 0L;
        long stackIn_49_0 = 0L;
        long stackIn_51_0 = 0L;
        long stackIn_55_0 = 0L;
        long stackIn_57_0 = 0L;
        long stackOut_54_0 = 0L;
        long stackOut_56_0 = 0L;
        long stackOut_48_0 = 0L;
        long stackOut_50_0 = 0L;
        long stackOut_40_0 = 0L;
        long stackOut_42_0 = 0L;
        long stackOut_34_0 = 0L;
        long stackOut_36_0 = 0L;
        long stackOut_25_0 = 0L;
        long stackOut_27_0 = 0L;
        long stackOut_19_0 = 0L;
        long stackOut_21_0 = 0L;
        long stackOut_10_0 = 0L;
        long stackOut_12_0 = 0L;
        long stackOut_4_0 = 0L;
        long stackOut_6_0 = 0L;
        var9 = TombRacer.field_G ? 1 : 0;
        var2 = System.nanoTime();
        var4 = var2 + -this.field_e;
        this.field_e = var2;
        if (-5000000000L < var4) {
          if ((var4 ^ -1L) > -5000000001L) {
            this.field_i[this.field_g] = var4;
            this.field_g = (this.field_g + 1) % 10;
            if (1 > this.field_c) {
              this.field_c = this.field_c + 1;
              var6 = 0L;
              if (param0 > 0) {
                this.field_i = (long[]) null;
                var8 = 1;
                L0: while (true) {
                  L1: {
                    L2: {
                      if (var8 > this.field_c) {
                        break L2;
                      } else {
                        stackOut_54_0 = var6 + this.field_i[(-var8 + this.field_g + 10) % 10];
                        stackIn_57_0 = stackOut_54_0;
                        stackIn_55_0 = stackOut_54_0;
                        if (var9 != 0) {
                          break L1;
                        } else {
                          var6 = stackIn_55_0;
                          var8++;
                          if (var9 == 0) {
                            continue L0;
                          } else {
                            break L2;
                          }
                        }
                      }
                    }
                    stackOut_56_0 = var6 / (long)this.field_c;
                    stackIn_57_0 = stackOut_56_0;
                    break L1;
                  }
                  return stackIn_57_0;
                }
              } else {
                var8 = 1;
                L3: while (true) {
                  L4: {
                    L5: {
                      if (var8 > this.field_c) {
                        break L5;
                      } else {
                        stackOut_48_0 = var6 + this.field_i[(-var8 + this.field_g + 10) % 10];
                        stackIn_51_0 = stackOut_48_0;
                        stackIn_49_0 = stackOut_48_0;
                        if (var9 != 0) {
                          break L4;
                        } else {
                          var6 = stackIn_49_0;
                          var8++;
                          if (var9 == 0) {
                            continue L3;
                          } else {
                            break L5;
                          }
                        }
                      }
                    }
                    stackOut_50_0 = var6 / (long)this.field_c;
                    stackIn_51_0 = stackOut_50_0;
                    break L4;
                  }
                  return stackIn_51_0;
                }
              }
            } else {
              var6 = 0L;
              if (param0 > 0) {
                this.field_i = (long[]) null;
                var8 = 1;
                L6: while (true) {
                  L7: {
                    L8: {
                      if (var8 > this.field_c) {
                        break L8;
                      } else {
                        stackOut_40_0 = var6 + this.field_i[(-var8 + this.field_g + 10) % 10];
                        stackIn_43_0 = stackOut_40_0;
                        stackIn_41_0 = stackOut_40_0;
                        if (var9 != 0) {
                          break L7;
                        } else {
                          var6 = stackIn_41_0;
                          var8++;
                          if (var9 == 0) {
                            continue L6;
                          } else {
                            break L8;
                          }
                        }
                      }
                    }
                    stackOut_42_0 = var6 / (long)this.field_c;
                    stackIn_43_0 = stackOut_42_0;
                    break L7;
                  }
                  return stackIn_43_0;
                }
              } else {
                var8 = 1;
                L9: while (true) {
                  L10: {
                    L11: {
                      if (var8 > this.field_c) {
                        break L11;
                      } else {
                        stackOut_34_0 = var6 + this.field_i[(-var8 + this.field_g + 10) % 10];
                        stackIn_37_0 = stackOut_34_0;
                        stackIn_35_0 = stackOut_34_0;
                        if (var9 != 0) {
                          break L10;
                        } else {
                          var6 = stackIn_35_0;
                          var8++;
                          if (var9 == 0) {
                            continue L9;
                          } else {
                            break L11;
                          }
                        }
                      }
                    }
                    stackOut_36_0 = var6 / (long)this.field_c;
                    stackIn_37_0 = stackOut_36_0;
                    break L10;
                  }
                  return stackIn_37_0;
                }
              }
            }
          } else {
            var6 = 0L;
            if (param0 > 0) {
              this.field_i = (long[]) null;
              var8 = 1;
              L12: while (true) {
                L13: {
                  L14: {
                    if (var8 > this.field_c) {
                      break L14;
                    } else {
                      stackOut_25_0 = var6 + this.field_i[(-var8 + this.field_g + 10) % 10];
                      stackIn_28_0 = stackOut_25_0;
                      stackIn_26_0 = stackOut_25_0;
                      if (var9 != 0) {
                        break L13;
                      } else {
                        var6 = stackIn_26_0;
                        var8++;
                        if (var9 == 0) {
                          continue L12;
                        } else {
                          break L14;
                        }
                      }
                    }
                  }
                  stackOut_27_0 = var6 / (long)this.field_c;
                  stackIn_28_0 = stackOut_27_0;
                  break L13;
                }
                return stackIn_28_0;
              }
            } else {
              var8 = 1;
              L15: while (true) {
                L16: {
                  L17: {
                    if (var8 > this.field_c) {
                      break L17;
                    } else {
                      stackOut_19_0 = var6 + this.field_i[(-var8 + this.field_g + 10) % 10];
                      stackIn_22_0 = stackOut_19_0;
                      stackIn_20_0 = stackOut_19_0;
                      if (var9 != 0) {
                        break L16;
                      } else {
                        var6 = stackIn_20_0;
                        var8++;
                        if (var9 == 0) {
                          continue L15;
                        } else {
                          break L17;
                        }
                      }
                    }
                  }
                  stackOut_21_0 = var6 / (long)this.field_c;
                  stackIn_22_0 = stackOut_21_0;
                  break L16;
                }
                return stackIn_22_0;
              }
            }
          }
        } else {
          var6 = 0L;
          if (param0 > 0) {
            this.field_i = (long[]) null;
            var8 = 1;
            L18: while (true) {
              L19: {
                L20: {
                  if (var8 > this.field_c) {
                    break L20;
                  } else {
                    stackOut_10_0 = var6 + this.field_i[(-var8 + this.field_g + 10) % 10];
                    stackIn_13_0 = stackOut_10_0;
                    stackIn_11_0 = stackOut_10_0;
                    if (var9 != 0) {
                      break L19;
                    } else {
                      var6 = stackIn_11_0;
                      var8++;
                      if (var9 == 0) {
                        continue L18;
                      } else {
                        break L20;
                      }
                    }
                  }
                }
                stackOut_12_0 = var6 / (long)this.field_c;
                stackIn_13_0 = stackOut_12_0;
                break L19;
              }
              return stackIn_13_0;
            }
          } else {
            var8 = 1;
            L21: while (true) {
              L22: {
                L23: {
                  if (var8 > this.field_c) {
                    break L23;
                  } else {
                    stackOut_4_0 = var6 + this.field_i[(-var8 + this.field_g + 10) % 10];
                    stackIn_7_0 = stackOut_4_0;
                    stackIn_5_0 = stackOut_4_0;
                    if (var9 != 0) {
                      break L22;
                    } else {
                      var6 = stackIn_5_0;
                      var8++;
                      if (var9 == 0) {
                        continue L21;
                      } else {
                        break L23;
                      }
                    }
                  }
                }
                stackOut_6_0 = var6 / (long)this.field_c;
                stackIn_7_0 = stackOut_6_0;
                break L22;
              }
              return stackIn_7_0;
            }
          }
        }
    }

    public static void c(int param0) {
        int var1 = 118 % ((-58 - param0) / 32);
        field_h = null;
    }

    final static jua a(byte param0, boolean param1) {
        int var3 = -49 / ((-41 - param0) / 63);
        jua var2 = new jua(true);
        var2.field_a = param1 ? true : false;
        return var2;
    }

    es() {
        this.field_g = 0;
        this.field_i = new long[10];
        this.field_e = 0L;
        this.field_c = 1;
        this.field_f = 0L;
        this.field_d = 0L;
        this.field_d = System.nanoTime();
        this.field_f = System.nanoTime();
    }

    static {
        field_h = new int[]{85, 130, 220, 340, 440, 520, 520};
    }
}
