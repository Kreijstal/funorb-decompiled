/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rk extends tb {
    static ee field_c;
    private int field_e;
    static volatile boolean field_m;
    static int field_g;
    private long field_j;
    private int field_l;
    private long field_h;
    private long[] field_f;
    static aj field_n;
    private long field_i;
    static aj field_d;
    static String field_k;

    final void a(byte param0) {
        this.field_i = 0L;
        if (param0 == 50) {
          if (this.field_h < this.field_j) {
            this.field_h = this.field_h + (this.field_j - this.field_h);
            return;
          } else {
            return;
          }
        } else {
          field_c = (ee) null;
          if (this.field_h >= this.field_j) {
            return;
          } else {
            this.field_h = this.field_h + (this.field_j - this.field_h);
            return;
          }
        }
    }

    public static void a(boolean param0) {
        field_d = null;
        field_k = null;
        field_n = null;
        if (!param0) {
            return;
        }
        field_c = null;
    }

    final long b(int param0) {
        if (param0 == 255) {
          this.field_h = this.field_h + this.c(10);
          if (this.field_j > this.field_h) {
            return (this.field_j - this.field_h) / 1000000L;
          } else {
            return 0L;
          }
        } else {
          field_m = true;
          this.field_h = this.field_h + this.c(10);
          if (this.field_j > this.field_h) {
            return (this.field_j - this.field_h) / 1000000L;
          } else {
            return 0L;
          }
        }
    }

    private final long c(int param0) {
        long var2 = 0L;
        long var4 = 0L;
        long var6 = 0L;
        int var8 = 0;
        int var9 = 0;
        var9 = Lexicominos.field_L ? 1 : 0;
        var2 = System.nanoTime();
        var4 = var2 - this.field_i;
        this.field_i = var2;
        if (var4 > -5000000000L) {
          if (5000000000L > var4) {
            this.field_f[this.field_e] = var4;
            this.field_e = (this.field_e + 1) % 10;
            if ((this.field_l ^ -1) <= -2) {
              var6 = 0L;
              var8 = 1;
              L0: while (true) {
                L1: {
                  if (this.field_l < var8) {
                    if (param0 == 10) {
                      break L1;
                    } else {
                      return -86L;
                    }
                  } else {
                    var6 = var6 + this.field_f[(this.field_e - (var8 + -10)) % 10];
                    var8++;
                    if (var9 != 0) {
                      break L1;
                    } else {
                      if (var9 == 0) {
                        continue L0;
                      } else {
                        if (param0 == 10) {
                          return var6 / (long)this.field_l;
                        } else {
                          return -86L;
                        }
                      }
                    }
                  }
                }
                return var6 / (long)this.field_l;
              }
            } else {
              this.field_l = this.field_l + 1;
              var6 = 0L;
              var8 = 1;
              L2: while (true) {
                L3: {
                  if (this.field_l < var8) {
                    if (param0 == 10) {
                      break L3;
                    } else {
                      return -86L;
                    }
                  } else {
                    var6 = var6 + this.field_f[(this.field_e - (var8 + -10)) % 10];
                    var8++;
                    if (var9 != 0) {
                      break L3;
                    } else {
                      if (var9 == 0) {
                        continue L2;
                      } else {
                        if (param0 == 10) {
                          return var6 / (long)this.field_l;
                        } else {
                          return -86L;
                        }
                      }
                    }
                  }
                }
                return var6 / (long)this.field_l;
              }
            }
          } else {
            var6 = 0L;
            var8 = 1;
            L4: while (true) {
              L5: {
                if (this.field_l < var8) {
                  if (param0 == 10) {
                    break L5;
                  } else {
                    return -86L;
                  }
                } else {
                  var6 = var6 + this.field_f[(this.field_e - (var8 + -10)) % 10];
                  var8++;
                  if (var9 != 0) {
                    break L5;
                  } else {
                    if (var9 == 0) {
                      continue L4;
                    } else {
                      if (param0 == 10) {
                        return var6 / (long)this.field_l;
                      } else {
                        return -86L;
                      }
                    }
                  }
                }
              }
              return var6 / (long)this.field_l;
            }
          }
        } else {
          var6 = 0L;
          var8 = 1;
          L6: while (true) {
            if (this.field_l < var8) {
              if (param0 != 10) {
                return -86L;
              } else {
                return var6 / (long)this.field_l;
              }
            } else {
              var6 = var6 + this.field_f[(this.field_e - (var8 + -10)) % 10];
              var8++;
              if (var9 == 0) {
                if (var9 == 0) {
                  continue L6;
                } else {
                  if (param0 == 10) {
                    return var6 / (long)this.field_l;
                  } else {
                    return -86L;
                  }
                }
              } else {
                return var6 / (long)this.field_l;
              }
            }
          }
        }
    }

    final int a(long param0, byte param1) {
        int var4 = 0;
        int var5 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_7_0 = 0;
        var5 = Lexicominos.field_L ? 1 : 0;
        if (param1 > 113) {
          if (this.field_h >= this.field_j) {
            var4 = 0;
            L0: while (true) {
              this.field_j = this.field_j + param0;
              var4++;
              stackOut_16_0 = var4 ^ -1;
              stackIn_17_0 = stackOut_16_0;
              L1: while (true) {
                L2: {
                  if (stackIn_17_0 <= -11) {
                    break L2;
                  } else {
                    if ((this.field_j ^ -1L) > (this.field_h ^ -1L)) {
                      continue L0;
                    } else {
                      break L2;
                    }
                  }
                }
                stackOut_19_0 = ((this.field_j ^ -1L) < (this.field_h ^ -1L) ? -1 : ((this.field_j ^ -1L) == (this.field_h ^ -1L) ? 0 : 1));
                stackIn_17_0 = stackOut_19_0;
                stackIn_20_0 = stackOut_19_0;
                if (var5 != 0) {
                  continue L1;
                } else {
                  L3: {
                    if (stackIn_20_0 > 0) {
                      this.field_j = this.field_h;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  return var4;
                }
              }
            }
          } else {
            this.field_i = this.field_i + (-this.field_h + this.field_j);
            this.field_h = this.field_h + (-this.field_h + this.field_j);
            this.field_j = this.field_j + param0;
            return 1;
          }
        } else {
          field_g = -117;
          if (this.field_h >= this.field_j) {
            var4 = 0;
            L4: while (true) {
              this.field_j = this.field_j + param0;
              var4++;
              stackOut_4_0 = var4 ^ -1;
              stackIn_5_0 = stackOut_4_0;
              L5: while (true) {
                L6: {
                  if (stackIn_5_0 <= -11) {
                    break L6;
                  } else {
                    if ((this.field_j ^ -1L) > (this.field_h ^ -1L)) {
                      continue L4;
                    } else {
                      break L6;
                    }
                  }
                }
                stackOut_7_0 = ((this.field_j ^ -1L) < (this.field_h ^ -1L) ? -1 : ((this.field_j ^ -1L) == (this.field_h ^ -1L) ? 0 : 1));
                stackIn_5_0 = stackOut_7_0;
                stackIn_8_0 = stackOut_7_0;
                if (var5 != 0) {
                  continue L5;
                } else {
                  L7: {
                    if (stackIn_8_0 > 0) {
                      this.field_j = this.field_h;
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  return var4;
                }
              }
            }
          } else {
            this.field_i = this.field_i + (-this.field_h + this.field_j);
            this.field_h = this.field_h + (-this.field_h + this.field_j);
            this.field_j = this.field_j + param0;
            return 1;
          }
        }
    }

    final static boolean a(int param0, boolean param1, CharSequence param2, boolean param3) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_10_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_44_0 = 0;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        String stackIn_48_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_43_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_39_0 = 0;
        int stackOut_33_0 = 0;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        RuntimeException stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        String stackOut_47_2 = null;
        RuntimeException stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        String stackOut_46_2 = null;
        var11 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1) {
                break L1;
              } else {
                rk.a(true);
                break L1;
              }
            }
            L2: {
              if (param0 < 2) {
                break L2;
              } else {
                if (param0 <= 36) {
                  var4_int = 0;
                  var5 = 0;
                  var6 = 0;
                  var7 = param2.length();
                  var8 = 0;
                  L3: while (true) {
                    L4: {
                      if (var7 <= var8) {
                        stackOut_43_0 = var5;
                        stackIn_44_0 = stackOut_43_0;
                        break L4;
                      } else {
                        var9 = param2.charAt(var8);
                        stackOut_9_0 = -1;
                        stackIn_44_0 = stackOut_9_0;
                        stackIn_10_0 = stackOut_9_0;
                        if (var11 != 0) {
                          break L4;
                        } else {
                          L5: {
                            L6: {
                              if (stackIn_10_0 != (var8 ^ -1)) {
                                break L6;
                              } else {
                                L7: {
                                  if (var9 == 45) {
                                    var4_int = 1;
                                    if (var11 == 0) {
                                      break L5;
                                    } else {
                                      break L7;
                                    }
                                  } else {
                                    break L7;
                                  }
                                }
                                if (var9 != 43) {
                                  break L6;
                                } else {
                                  if (param3) {
                                    break L5;
                                  } else {
                                    break L6;
                                  }
                                }
                              }
                            }
                            L8: {
                              L9: {
                                if (var9 < 48) {
                                  break L9;
                                } else {
                                  if (var9 > 57) {
                                    break L9;
                                  } else {
                                    var9 -= 48;
                                    break L8;
                                  }
                                }
                              }
                              L10: {
                                if (var9 < 65) {
                                  break L10;
                                } else {
                                  if (var9 > 90) {
                                    break L10;
                                  } else {
                                    var9 -= 55;
                                    if (var11 == 0) {
                                      break L8;
                                    } else {
                                      break L10;
                                    }
                                  }
                                }
                              }
                              if (var9 < 97) {
                                stackOut_28_0 = 0;
                                stackIn_29_0 = stackOut_28_0;
                                decompiledRegionSelector0 = 1;
                                break L0;
                              } else {
                                if (var9 <= 122) {
                                  var9 -= 87;
                                  if (var11 == 0) {
                                    break L8;
                                  } else {
                                    var9 -= 48;
                                    break L8;
                                  }
                                } else {
                                  return false;
                                }
                              }
                            }
                            if (var9 < param0) {
                              L11: {
                                if (var4_int != 0) {
                                  var9 = -var9;
                                  break L11;
                                } else {
                                  break L11;
                                }
                              }
                              var10 = var9 + param0 * var6;
                              if (var6 == var10 / param0) {
                                var5 = 1;
                                var6 = var10;
                                break L5;
                              } else {
                                stackOut_39_0 = 0;
                                stackIn_40_0 = stackOut_39_0;
                                decompiledRegionSelector0 = 3;
                                break L0;
                              }
                            } else {
                              stackOut_33_0 = 0;
                              stackIn_34_0 = stackOut_33_0;
                              decompiledRegionSelector0 = 2;
                              break L0;
                            }
                          }
                          var8++;
                          continue L3;
                        }
                      }
                    }
                    decompiledRegionSelector0 = 0;
                    break L0;
                  }
                } else {
                  break L2;
                }
              }
            }
            throw new IllegalArgumentException("" + param0);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var4 = decompiledCaughtException;
            stackOut_45_0 = (RuntimeException) (var4);
            stackOut_45_1 = new StringBuilder().append("rk.A(").append(param0).append(',').append(param1).append(',');
            stackIn_47_0 = stackOut_45_0;
            stackIn_47_1 = stackOut_45_1;
            stackIn_46_0 = stackOut_45_0;
            stackIn_46_1 = stackOut_45_1;
            if (param2 == null) {
              stackOut_47_0 = (RuntimeException) ((Object) stackIn_47_0);
              stackOut_47_1 = (StringBuilder) ((Object) stackIn_47_1);
              stackOut_47_2 = "null";
              stackIn_48_0 = stackOut_47_0;
              stackIn_48_1 = stackOut_47_1;
              stackIn_48_2 = stackOut_47_2;
              break L12;
            } else {
              stackOut_46_0 = (RuntimeException) ((Object) stackIn_46_0);
              stackOut_46_1 = (StringBuilder) ((Object) stackIn_46_1);
              stackOut_46_2 = "{...}";
              stackIn_48_0 = stackOut_46_0;
              stackIn_48_1 = stackOut_46_1;
              stackIn_48_2 = stackOut_46_2;
              break L12;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_48_0), stackIn_48_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_44_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_29_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_34_0 != 0;
            } else {
              return stackIn_40_0 != 0;
            }
          }
        }
    }

    rk() {
        this.field_j = 0L;
        this.field_h = 0L;
        this.field_f = new long[10];
        this.field_e = 0;
        this.field_i = 0L;
        this.field_l = 1;
        this.field_h = System.nanoTime();
        this.field_j = System.nanoTime();
    }

    static {
        field_m = true;
        field_n = new aj(2, 4, 4, 0);
        field_d = new aj(6, 0, 4, 2);
        field_k = "2 of 4";
    }
}
