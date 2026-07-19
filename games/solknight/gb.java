/*
 * Decompiled by CFR-JS 0.4.0.
 */
class gb extends gg {
    static o[] field_k;
    static ef field_i;
    int field_m;
    static pc field_h;
    static int field_j;
    byte[] field_l;

    final long a(int param0) {
        long var2 = 0L;
        long var4 = 0L;
        var2 = (long)this.e(true) & 4294967295L;
        if (param0 != 10526) {
          field_h = (pc) null;
          var4 = 4294967295L & (long)this.e(true);
          return var4 + (var2 << -746915296);
        } else {
          var4 = 4294967295L & (long)this.e(true);
          return var4 + (var2 << -746915296);
        }
    }

    final void c(int param0, int param1) {
        int var3 = 16 % ((-52 - param0) / 49);
        int fieldTemp$0 = this.field_m;
        this.field_m = this.field_m + 1;
        this.field_l[fieldTemp$0] = (byte)param1;
    }

    final int e(boolean param0) {
        if (!param0) {
          return -122;
        } else {
          this.field_m = this.field_m + 4;
          return ((this.field_l[this.field_m + -2] & 255) << -934697176) + ((-16777216 & this.field_l[-4 + this.field_m] << 682343608) - -((255 & this.field_l[-3 + this.field_m]) << 548596112) + (255 & this.field_l[this.field_m + -1]));
        }
    }

    final static wg a(String param0, byte param1) {
        boolean discarded$2 = false;
        RuntimeException var2 = null;
        Object stackIn_4_0 = null;
        Object stackIn_9_0 = null;
        wg stackIn_11_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        wg stackOut_10_0 = null;
        Object stackOut_8_0 = null;
        Object stackOut_3_0 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            L1: {
              if (param1 >= 98) {
                break L1;
              } else {
                discarded$2 = gb.a('*', 15);
                break L1;
              }
            }
            if (gf.field_Z != field_i) {
              L2: {
                if (field_i != da.field_d) {
                  break L2;
                } else {
                  if (param0.equals(uh.field_r)) {
                    field_i = el.field_p;
                    stackOut_10_0 = a.field_h;
                    stackIn_11_0 = stackOut_10_0;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    break L2;
                  }
                }
              }
              uh.field_r = param0;
              a.field_h = null;
              field_i = gf.field_Z;
              stackOut_8_0 = null;
              stackIn_9_0 = stackOut_8_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_3_0 = null;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (var2);
            stackOut_12_1 = new StringBuilder().append("gb.EA(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L3;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L3;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (wg) ((Object) stackIn_4_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (wg) ((Object) stackIn_9_0);
          } else {
            return stackIn_11_0;
          }
        }
    }

    final int e(int param0) {
        if (param0 == 6715) {
          if (this.field_l[this.field_m] >= 0) {
            return this.i(59);
          } else {
            return 2147483647 & this.e(true);
          }
        } else {
          return -126;
        }
    }

    final int c(boolean param0) {
        int var2 = 0;
        var2 = this.field_l[this.field_m] & 255;
        if (!param0) {
          if (-129 < (var2 ^ -1)) {
            return this.j(255);
          } else {
            return -32768 + this.i(-118);
          }
        } else {
          this.b((byte) 69, 86);
          if (-129 < (var2 ^ -1)) {
            return this.j(255);
          } else {
            return -32768 + this.i(-118);
          }
        }
    }

    private final void a(int param0, long param1) {
        int fieldTemp$10 = 0;
        int fieldTemp$11 = 0;
        int fieldTemp$12 = 0;
        int fieldTemp$13 = 0;
        int fieldTemp$7 = this.field_m;
        this.field_m = this.field_m + 1;
        this.field_l[fieldTemp$7] = (byte)(int)(param1 >> -524918224);
        int fieldTemp$8 = this.field_m;
        this.field_m = this.field_m + 1;
        this.field_l[fieldTemp$8] = (byte)(int)(param1 >> 1986540712);
        int fieldTemp$9 = this.field_m;
        this.field_m = this.field_m + 1;
        this.field_l[fieldTemp$9] = (byte)(int)(param1 >> -1572448416);
        if (param0 != -37) {
          return;
        } else {
          fieldTemp$10 = this.field_m;
          this.field_m = this.field_m + 1;
          this.field_l[fieldTemp$10] = (byte)(int)(param1 >> 73216600);
          fieldTemp$11 = this.field_m;
          this.field_m = this.field_m + 1;
          this.field_l[fieldTemp$11] = (byte)(int)(param1 >> -1076860400);
          fieldTemp$12 = this.field_m;
          this.field_m = this.field_m + 1;
          this.field_l[fieldTemp$12] = (byte)(int)(param1 >> -654249592);
          fieldTemp$13 = this.field_m;
          this.field_m = this.field_m + 1;
          this.field_l[fieldTemp$13] = (byte)(int)param1;
          return;
        }
    }

    final void a(int param0, String param1) {
        RuntimeException var3 = null;
        long var3_long = 0L;
        long var5 = 0L;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        var10 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              var3_long = 0L;
              var5 = 0L;
              if (param0 >= 41) {
                break L1;
              } else {
                field_j = 105;
                break L1;
              }
            }
            var7 = param1.length();
            var8 = 19;
            L2: while (true) {
              L3: {
                L4: {
                  if (0 > var8) {
                    break L4;
                  } else {
                    var3_long = var3_long * 38L;
                    if (var10 != 0) {
                      break L3;
                    } else {
                      L5: {
                        if (var8 < var7) {
                          L6: {
                            var9 = param1.charAt(var8);
                            if (var9 < 65) {
                              break L6;
                            } else {
                              if (var9 > 90) {
                                break L6;
                              } else {
                                var3_long = var3_long + (long)(-65 + (var9 + 2));
                                if (var10 == 0) {
                                  break L5;
                                } else {
                                  break L6;
                                }
                              }
                            }
                          }
                          L7: {
                            if (97 > var9) {
                              break L7;
                            } else {
                              if (122 < var9) {
                                break L7;
                              } else {
                                var3_long = var3_long + (long)(2 + (var9 - 97));
                                if (var10 == 0) {
                                  break L5;
                                } else {
                                  break L7;
                                }
                              }
                            }
                          }
                          L8: {
                            L9: {
                              if (var9 < 48) {
                                break L9;
                              } else {
                                if (57 >= var9) {
                                  break L8;
                                } else {
                                  break L9;
                                }
                              }
                            }
                            var3_long = var3_long + 1L;
                            if (var10 == 0) {
                              break L5;
                            } else {
                              break L8;
                            }
                          }
                          var3_long = var3_long + (long)(-48 + (28 + var9));
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                      L10: {
                        if (-11 == (var8 ^ -1)) {
                          var5 = var3_long;
                          var3_long = 0L;
                          break L10;
                        } else {
                          break L10;
                        }
                      }
                      var8--;
                      if (var10 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                this.a(-37, var3_long);
                this.a(-37, var5);
                break L3;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var3 = decompiledCaughtException;
            stackOut_25_0 = (RuntimeException) (var3);
            stackOut_25_1 = new StringBuilder().append("gb.PA(").append(param0).append(',');
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param1 == null) {
              stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackOut_27_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L11;
            } else {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L11;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ')');
        }
    }

    final void a(int param0, int param1, int param2, byte[] param3) {
        int fieldTemp$2 = 0;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        var6 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            var5_int = param1;
            L1: while (true) {
              L2: {
                L3: {
                  if (param1 - -param0 <= var5_int) {
                    break L3;
                  } else {
                    fieldTemp$2 = this.field_m;
                    this.field_m = this.field_m + 1;
                    param3[var5_int] = this.field_l[fieldTemp$2];
                    var5_int++;
                    if (var6 != 0) {
                      break L2;
                    } else {
                      if (var6 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                if (param2 < -109) {
                  break L2;
                } else {
                  this.a(-27, 8L);
                  return;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (var5);
            stackOut_9_1 = new StringBuilder().append("gb.S(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param3 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
        }
    }

    final void a(byte param0, int param1) {
        L0: {
          if ((-128 & param1) != 0) {
            L1: {
              if ((param1 & -16384) != 0) {
                if (0 == (-2097152 & param1)) {
                  this.c(-128, param1 >>> 703317902 | 128);
                  break L1;
                } else {
                  if ((-268435456 & param1) == 0) {
                    this.c(38, 128 | param1 >>> 244562069);
                    this.c(-128, param1 >>> 703317902 | 128);
                    this.c(param0 + -83, 128 | param1 >>> -2082394169);
                    this.c(param0 + 97, 127 & param1);
                    if (param0 == -25) {
                      return;
                    } else {
                      field_h = (pc) null;
                      return;
                    }
                  } else {
                    this.c(-115, 128 | param1 >>> 649166492);
                    this.c(38, 128 | param1 >>> 244562069);
                    this.c(-128, param1 >>> 703317902 | 128);
                    this.c(param0 + -83, 128 | param1 >>> -2082394169);
                    this.c(param0 + 97, 127 & param1);
                    if (param0 == -25) {
                      return;
                    } else {
                      field_h = (pc) null;
                      return;
                    }
                  }
                }
              } else {
                break L1;
              }
            }
            this.c(param0 + -83, 128 | param1 >>> -2082394169);
            break L0;
          } else {
            break L0;
          }
        }
        this.c(param0 + 97, 127 & param1);
        if (param0 == -25) {
          return;
        } else {
          field_h = (pc) null;
          return;
        }
    }

    final void b(byte param0, int param1) {
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        int var4 = 0;
        var4 = SolKnight.field_L ? 1 : 0;
        if (param0 != -65) {
          field_j = 4;
          L0: while (true) {
            if (param1 > this.field_m) {
              fieldTemp$2 = this.field_m;
              this.field_m = this.field_m + 1;
              this.field_l[fieldTemp$2] = (byte) 0;
              if (var4 == 0) {
                continue L0;
              } else {
                return;
              }
            } else {
              return;
            }
          }
        } else {
          L1: while (true) {
            if (param1 > this.field_m) {
              fieldTemp$3 = this.field_m;
              this.field_m = this.field_m + 1;
              this.field_l[fieldTemp$3] = (byte) 0;
              if (var4 == 0) {
                continue L1;
              } else {
                return;
              }
            } else {
              return;
            }
          }
        }
    }

    final int d(int param0) {
        int var2 = 0;
        int var3 = 0;
        var2 = 101 / ((-54 - param0) / 41);
        var3 = 255 & this.field_l[this.field_m];
        if (128 <= var3) {
          return this.i(91) + -49152;
        } else {
          return -64 + this.j(255);
        }
    }

    final void a(int param0, int param1, byte[] param2, int param3) {
        int fieldTemp$8 = 0;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var6 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == 8) {
                break L1;
              } else {
                field_h = (pc) null;
                break L1;
              }
            }
            var5_int = param3;
            L2: while (true) {
              if (var5_int >= param3 - -param1) {
                break L0;
              } else {
                fieldTemp$8 = this.field_m;
                this.field_m = this.field_m + 1;
                this.field_l[fieldTemp$8] = param2[var5_int];
                var5_int++;
                if (var6 == 0) {
                  continue L2;
                } else {
                  return;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (var5);
            stackOut_10_1 = new StringBuilder().append("gb.NA(").append(param0).append(',').append(param1).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param2 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param3 + ')');
        }
    }

    final int j(int param0) {
        int fieldTemp$4 = 0;
        int fieldTemp$5 = 0;
        if (param0 != 255) {
          this.a((byte) 56, -16);
          fieldTemp$4 = this.field_m;
          this.field_m = this.field_m + 1;
          return 255 & this.field_l[fieldTemp$4];
        } else {
          fieldTemp$5 = this.field_m;
          this.field_m = this.field_m + 1;
          return 255 & this.field_l[fieldTemp$5];
        }
    }

    final boolean k(int param0) {
        int var2 = 0;
        int var3 = 0;
        this.field_m = this.field_m - param0;
        var2 = ki.a(-27129, this.field_l, this.field_m, 0);
        var3 = this.e(true);
        if (var3 == var2) {
          return true;
        } else {
          return false;
        }
    }

    final byte a(byte param0) {
        if (param0 != -14) {
            return (byte) -103;
        }
        int fieldTemp$0 = this.field_m;
        this.field_m = this.field_m + 1;
        return this.field_l[fieldTemp$0];
    }

    final String g(int param0) {
        if (param0 <= 73) {
            field_j = -112;
            if (!(0 != this.field_l[this.field_m])) {
                this.field_m = this.field_m + 1;
                return null;
            }
            return this.h(72);
        }
        if (!(0 != this.field_l[this.field_m])) {
            this.field_m = this.field_m + 1;
            return null;
        }
        return this.h(72);
    }

    final void a(boolean param0, int param1) {
        int fieldTemp$5 = 0;
        int fieldTemp$4 = this.field_m;
        this.field_m = this.field_m + 1;
        this.field_l[fieldTemp$4] = (byte)(param1 >> 98792136);
        if (!param0) {
          return;
        } else {
          fieldTemp$5 = this.field_m;
          this.field_m = this.field_m + 1;
          this.field_l[fieldTemp$5] = (byte)param1;
          return;
        }
    }

    final String d(boolean param0) {
        int fieldTemp$1 = 0;
        int fieldTemp$0 = this.field_m;
        this.field_m = this.field_m + 1;
        int var2 = this.field_l[fieldTemp$0];
        if (0 != var2) {
            throw new IllegalStateException("");
        }
        int var3 = this.field_m;
        while (true) {
            fieldTemp$1 = this.field_m;
            this.field_m = this.field_m + 1;
            if (-1 == (this.field_l[fieldTemp$1] ^ -1)) {
                break;
            }
        }
        if (param0) {
            return (String) null;
        }
        int var4 = this.field_m - (var3 + 1);
        if (!(var4 != 0)) {
            return "";
        }
        return vd.a(this.field_l, var3, var4, 160);
    }

    final int c(byte param0) {
        int fieldTemp$5 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        byte stackIn_6_0 = 0;
        byte stackIn_7_0 = 0;
        byte stackOut_5_0 = 0;
        var4 = SolKnight.field_L ? 1 : 0;
        int fieldTemp$4 = this.field_m;
        this.field_m = this.field_m + 1;
        var2 = this.field_l[fieldTemp$4];
        if (param0 == 120) {
          var3 = 0;
          L0: while (true) {
            if (var2 < 0) {
              var3 = (var2 & 127 | var3) << -2064068153;
              fieldTemp$5 = this.field_m;
              this.field_m = this.field_m + 1;
              stackOut_5_0 = this.field_l[fieldTemp$5];
              stackIn_7_0 = stackOut_5_0;
              stackIn_6_0 = stackOut_5_0;
              if (var4 == 0) {
                var2 = stackIn_7_0;
                continue L0;
              } else {
                return stackIn_6_0;
              }
            } else {
              return var3 | var2;
            }
          }
        } else {
          return -115;
        }
    }

    final void a(byte param0, int[] param1) {
        int incrementValue$1 = 0;
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_4_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte stackOut_11_0 = 0;
        int stackOut_3_0 = 0;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var10 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            var3_int = this.field_m / 8;
            this.field_m = 0;
            var4 = 0;
            L1: while (true) {
              L2: {
                if (var4 >= var3_int) {
                  stackOut_11_0 = param0;
                  stackIn_12_0 = stackOut_11_0;
                  break L2;
                } else {
                  var5 = this.e(true);
                  var6 = this.e(true);
                  var7 = 0;
                  var8 = -1640531527;
                  stackOut_3_0 = 32;
                  stackIn_12_0 = stackOut_3_0;
                  stackIn_4_0 = stackOut_3_0;
                  if (var10 != 0) {
                    break L2;
                  } else {
                    var9 = stackIn_4_0;
                    L3: while (true) {
                      L4: {
                        L5: {
                          incrementValue$1 = var9;
                          var9--;
                          if (-1 <= (incrementValue$1 ^ -1)) {
                            break L5;
                          } else {
                            var5 = var5 + (var6 + (var6 >>> 1884979013 ^ var6 << -1752101500) ^ var7 + param1[var7 & 3]);
                            var7 = var7 + var8;
                            var6 = var6 + (var5 + (var5 >>> 355017509 ^ var5 << -181367068) ^ param1[(var7 & 6297) >>> -1853278261] + var7);
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
                        this.field_m = this.field_m - 8;
                        this.b(var5, false);
                        this.b(var6, false);
                        var4++;
                        break L4;
                      }
                      continue L1;
                    }
                  }
                }
              }
              if (stackIn_12_0 > 21) {
                break L0;
              } else {
                field_h = (pc) null;
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) (var3);
            stackOut_15_1 = new StringBuilder().append("gb.VA(").append(param0).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L6;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L6;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ')');
        }
    }

    final static void a(boolean param0, int param1, int param2) {
        ua.field_H = 0;
        ri.field_f = param1;
        if (param2 < -126) {
          if ((ri.field_f ^ -1) > -1) {
            return;
          } else {
            vd.field_d[ri.field_f].b(param0, 3367);
            return;
          }
        } else {
          field_h = (pc) null;
          if ((ri.field_f ^ -1) > -1) {
            return;
          } else {
            vd.field_d[ri.field_f].b(param0, 3367);
            return;
          }
        }
    }

    final void b(int param0, String param1) {
        int fieldTemp$0 = 0;
        CharSequence var4 = null;
        int fieldTemp$1 = 0;
        int var3_int = param1.indexOf(' ');
        if (var3_int >= 0) {
            throw new IllegalArgumentException("");
        }
        if (param0 != -1955895016) {
            return;
        }
        try {
            fieldTemp$0 = this.field_m;
            this.field_m = this.field_m + 1;
            this.field_l[fieldTemp$0] = (byte) 0;
            var4 = (CharSequence) ((Object) param1);
            this.field_m = this.field_m + ue.a(this.field_m, var4, param1.length(), 352, this.field_l, 0);
            fieldTemp$1 = this.field_m;
            this.field_m = this.field_m + 1;
            this.field_l[fieldTemp$1] = (byte) 0;
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) ((Object) runtimeException), "gb.CB(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean a(char param0, int param1) {
        int stackIn_27_0 = 0;
        int stackIn_30_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_26_0 = 0;
        if (param1 > 119) {
          if (param0 < 48) {
            if (65 > param0) {
              L0: {
                if (param0 < 97) {
                  break L0;
                } else {
                  if (param0 > 122) {
                    break L0;
                  } else {
                    return true;
                  }
                }
              }
              return false;
            } else {
              if (param0 <= 90) {
                stackOut_28_0 = 1;
                stackIn_30_0 = stackOut_28_0;
                return stackIn_30_0 != 0;
              } else {
                L1: {
                  L2: {
                    if (param0 < 97) {
                      break L2;
                    } else {
                      if (param0 > 122) {
                        break L2;
                      } else {
                        stackOut_25_0 = 1;
                        stackIn_27_0 = stackOut_25_0;
                        break L1;
                      }
                    }
                  }
                  stackOut_26_0 = 0;
                  stackIn_27_0 = stackOut_26_0;
                  break L1;
                }
                return stackIn_27_0 != 0;
              }
            }
          } else {
            if (param0 > 57) {
              if (65 <= param0) {
                if (param0 > 90) {
                  if (param0 >= 97) {
                    if (param0 > 122) {
                      return false;
                    } else {
                      return true;
                    }
                  } else {
                    return false;
                  }
                } else {
                  return true;
                }
              } else {
                if (param0 >= 97) {
                  if (param0 > 122) {
                    return false;
                  } else {
                    return true;
                  }
                } else {
                  return false;
                }
              }
            } else {
              return true;
            }
          }
        } else {
          return false;
        }
    }

    final void a(long param0, byte param1) {
        boolean discarded$17 = false;
        int fieldTemp$18 = 0;
        int fieldTemp$19 = 0;
        int fieldTemp$20 = 0;
        int fieldTemp$21 = 0;
        int fieldTemp$22 = 0;
        int fieldTemp$23 = 0;
        int fieldTemp$12 = this.field_m;
        this.field_m = this.field_m + 1;
        this.field_l[fieldTemp$12] = (byte)(int)(param0 >> 1051615416);
        int fieldTemp$13 = this.field_m;
        this.field_m = this.field_m + 1;
        this.field_l[fieldTemp$13] = (byte)(int)(param0 >> -1091926544);
        int fieldTemp$14 = this.field_m;
        this.field_m = this.field_m + 1;
        this.field_l[fieldTemp$14] = (byte)(int)(param0 >> -324552152);
        int fieldTemp$15 = this.field_m;
        this.field_m = this.field_m + 1;
        this.field_l[fieldTemp$15] = (byte)(int)(param0 >> 1185922144);
        int fieldTemp$16 = this.field_m;
        this.field_m = this.field_m + 1;
        this.field_l[fieldTemp$16] = (byte)(int)(param0 >> -163415656);
        if (param1 <= 16) {
          discarded$17 = gb.a('$', -122);
          fieldTemp$18 = this.field_m;
          this.field_m = this.field_m + 1;
          this.field_l[fieldTemp$18] = (byte)(int)(param0 >> 432517392);
          fieldTemp$19 = this.field_m;
          this.field_m = this.field_m + 1;
          this.field_l[fieldTemp$19] = (byte)(int)(param0 >> -110421176);
          fieldTemp$20 = this.field_m;
          this.field_m = this.field_m + 1;
          this.field_l[fieldTemp$20] = (byte)(int)param0;
          return;
        } else {
          fieldTemp$21 = this.field_m;
          this.field_m = this.field_m + 1;
          this.field_l[fieldTemp$21] = (byte)(int)(param0 >> 432517392);
          fieldTemp$22 = this.field_m;
          this.field_m = this.field_m + 1;
          this.field_l[fieldTemp$22] = (byte)(int)(param0 >> -110421176);
          fieldTemp$23 = this.field_m;
          this.field_m = this.field_m + 1;
          this.field_l[fieldTemp$23] = (byte)(int)param0;
          return;
        }
    }

    final int b(boolean param0) {
        this.field_m = this.field_m + 3;
        if (param0) {
          return -116;
        } else {
          return ((255 & this.field_l[this.field_m + -3]) << 893077712) + (((this.field_l[this.field_m - 2] & 255) << -1780793208) - -(this.field_l[this.field_m + -1] & 255));
        }
    }

    final void a(long param0, int param1) {
        boolean discarded$17 = false;
        int fieldTemp$12 = this.field_m;
        this.field_m = this.field_m + 1;
        this.field_l[fieldTemp$12] = (byte)(int)(param0 >> 59769888);
        int fieldTemp$13 = this.field_m;
        this.field_m = this.field_m + 1;
        this.field_l[fieldTemp$13] = (byte)(int)(param0 >> -1955895016);
        int fieldTemp$14 = this.field_m;
        this.field_m = this.field_m + 1;
        this.field_l[fieldTemp$14] = (byte)(int)(param0 >> 291434832);
        int fieldTemp$15 = this.field_m;
        this.field_m = this.field_m + 1;
        this.field_l[fieldTemp$15] = (byte)(int)(param0 >> -1541109560);
        int fieldTemp$16 = this.field_m;
        this.field_m = this.field_m + 1;
        this.field_l[fieldTemp$16] = (byte)(int)param0;
        if (param1 == 25576) {
          return;
        } else {
          discarded$17 = this.k(-66);
          return;
        }
    }

    final void a(int param0, byte param1) {
        if (param1 >= 64) {
          if (-65 < (param0 ^ -1)) {
            if ((param0 ^ -1) > 63) {
              if (16384 > param0) {
                if ((param0 ^ -1) <= 16383) {
                  this.a(true, param0 + 49152);
                  return;
                } else {
                  throw new IllegalArgumentException();
                }
              } else {
                throw new IllegalArgumentException();
              }
            } else {
              this.c(-116, param0 - -64);
              return;
            }
          } else {
            if (16384 > param0) {
              if ((param0 ^ -1) > 16383) {
                throw new IllegalArgumentException();
              } else {
                this.a(true, param0 + 49152);
                return;
              }
            } else {
              throw new IllegalArgumentException();
            }
          }
        } else {
          field_j = -15;
          if (-65 < (param0 ^ -1)) {
            if ((param0 ^ -1) > 63) {
              if (16384 > param0) {
                if ((param0 ^ -1) > 16383) {
                  throw new IllegalArgumentException();
                } else {
                  this.a(true, param0 + 49152);
                  return;
                }
              } else {
                throw new IllegalArgumentException();
              }
            } else {
              this.c(-116, param0 - -64);
              return;
            }
          } else {
            if (16384 > param0) {
              if ((param0 ^ -1) > 16383) {
                throw new IllegalArgumentException();
              } else {
                this.a(true, param0 + 49152);
                return;
              }
            } else {
              throw new IllegalArgumentException();
            }
          }
        }
    }

    final String h(int param0) {
        int fieldTemp$4 = 0;
        int fieldTemp$5 = 0;
        int var2 = 0;
        int var3 = 0;
        if (param0 >= 8) {
          var2 = this.field_m;
          L0: while (true) {
            fieldTemp$4 = this.field_m;
            this.field_m = this.field_m + 1;
            if (this.field_l[fieldTemp$4] == 0) {
              var3 = this.field_m + -var2 + -1;
              if (0 == var3) {
                return "";
              } else {
                return vd.a(this.field_l, var2, var3, 160);
              }
            } else {
              continue L0;
            }
          }
        } else {
          this.a(80L, 109);
          var2 = this.field_m;
          L1: while (true) {
            fieldTemp$5 = this.field_m;
            this.field_m = this.field_m + 1;
            if (this.field_l[fieldTemp$5] == 0) {
              var3 = this.field_m + -var2 + -1;
              if (0 == var3) {
                return "";
              } else {
                return vd.a(this.field_l, var2, var3, 160);
              }
            } else {
              continue L1;
            }
          }
        }
    }

    final void b(int param0, boolean param1) {
        int fieldTemp$8 = this.field_m;
        this.field_m = this.field_m + 1;
        this.field_l[fieldTemp$8] = (byte)(param0 >> -1075421320);
        int fieldTemp$9 = this.field_m;
        this.field_m = this.field_m + 1;
        this.field_l[fieldTemp$9] = (byte)(param0 >> 1425944624);
        int fieldTemp$10 = this.field_m;
        this.field_m = this.field_m + 1;
        this.field_l[fieldTemp$10] = (byte)(param0 >> -1485137016);
        int fieldTemp$11 = this.field_m;
        this.field_m = this.field_m + 1;
        this.field_l[fieldTemp$11] = (byte)param0;
        if (!param1) {
          return;
        } else {
          this.field_m = 84;
          return;
        }
    }

    final void a(String param0, int param1) {
        int var3_int = 0;
        CharSequence var4 = null;
        int fieldTemp$0 = 0;
        try {
            var3_int = param0.indexOf(' ');
            if (!((var3_int ^ -1) > -1)) {
                throw new IllegalArgumentException("");
            }
            var4 = (CharSequence) ((Object) param0);
            this.field_m = this.field_m + ue.a(this.field_m, var4, param0.length(), 352, this.field_l, param1);
            fieldTemp$0 = this.field_m;
            this.field_m = this.field_m + 1;
            this.field_l[fieldTemp$0] = (byte) 0;
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) ((Object) runtimeException), "gb.AB(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void b(int param0, int param1) {
        this.field_l[-param1 + (this.field_m - param0)] = (byte)param1;
    }

    final void a(java.math.BigInteger param0, int param1, java.math.BigInteger param2) {
        int var4_int = 0;
        byte[] var5 = null;
        java.math.BigInteger var6 = null;
        java.math.BigInteger var7 = null;
        byte[] var8 = null;
        try {
            var4_int = this.field_m;
            this.field_m = 0;
            var5 = new byte[var4_int];
            if (param1 != 59769888) {
                this.a(false, 58);
            }
            this.a(var4_int, 0, -111, var5);
            var6 = new java.math.BigInteger(var5);
            var7 = var6.modPow(param2, param0);
            var8 = var7.toByteArray();
            this.field_m = 0;
            this.a(true, var8.length);
            this.a(8, var8.length, var8, 0);
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) ((Object) runtimeException), "gb.BA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, boolean param1) {
        String var4 = null;
        this.field_l[-param0 + (this.field_m + -2)] = (byte)(param0 >> 1643933288);
        this.field_l[this.field_m + (-param0 - 1)] = (byte)param0;
        if (param1) {
          return;
        } else {
          var4 = (String) null;
          this.a((String) null, -30);
          return;
        }
    }

    public static void f(int param0) {
        field_k = null;
        if (param0 != -11) {
          gb.a(false, -86, 67);
          field_h = null;
          field_i = null;
          return;
        } else {
          field_h = null;
          field_i = null;
          return;
        }
    }

    final int i(int param0) {
        this.field_m = this.field_m + 2;
        int var2 = -76 / ((-63 - param0) / 36);
        return (255 & this.field_l[-1 + this.field_m]) + ((255 & this.field_l[-2 + this.field_m]) << -420067992);
    }

    final void a(int[] param0, int param1, int param2, int param3) {
        int incrementValue$1 = 0;
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var13 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            var5_int = this.field_m;
            this.field_m = param1;
            var6 = (-param1 + param3) / 8;
            if (param2 == 5838) {
              var7 = 0;
              L1: while (true) {
                L2: {
                  if (var7 >= var6) {
                    this.field_m = var5_int;
                    break L2;
                  } else {
                    var8 = this.e(true);
                    var9 = this.e(true);
                    var10 = -957401312;
                    var11 = -1640531527;
                    if (var13 != 0) {
                      break L2;
                    } else {
                      var12 = 32;
                      L3: while (true) {
                        L4: {
                          L5: {
                            incrementValue$1 = var12;
                            var12--;
                            if ((incrementValue$1 ^ -1) >= -1) {
                              break L5;
                            } else {
                              var9 = var9 - ((var8 >>> -256341883 ^ var8 << 1640343396) - -var8 ^ var10 + param0[(6680 & var10) >>> 955889419]);
                              var10 = var10 - var11;
                              var8 = var8 - (param0[3 & var10] + var10 ^ var9 + (var9 << 663740644 ^ var9 >>> -1389103419));
                              if (var13 != 0) {
                                break L4;
                              } else {
                                if (var13 == 0) {
                                  continue L3;
                                } else {
                                  break L5;
                                }
                              }
                            }
                          }
                          this.field_m = this.field_m - 8;
                          this.b(var8, false);
                          this.b(var9, false);
                          var7++;
                          break L4;
                        }
                        continue L1;
                      }
                    }
                  }
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) (var5);
            stackOut_15_1 = new StringBuilder().append("gb.TA(");
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param0 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L6;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L6;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void c(byte param0, int param1) {
        if (param0 > -10) {
          this.c((byte) -13, 19);
          this.field_l[this.field_m + (-param1 - 4)] = (byte)(param1 >> -776055784);
          this.field_l[-3 + (-param1 + this.field_m)] = (byte)(param1 >> -1506003216);
          this.field_l[-2 + -param1 + this.field_m] = (byte)(param1 >> 1218233000);
          this.field_l[-param1 + this.field_m - 1] = (byte)param1;
          return;
        } else {
          this.field_l[this.field_m + (-param1 - 4)] = (byte)(param1 >> -776055784);
          this.field_l[-3 + (-param1 + this.field_m)] = (byte)(param1 >> -1506003216);
          this.field_l[-2 + -param1 + this.field_m] = (byte)(param1 >> 1218233000);
          this.field_l[-param1 + this.field_m - 1] = (byte)param1;
          return;
        }
    }

    final int b(boolean param0, int param1) {
        int var3 = 0;
        if (!param0) {
          this.field_m = -7;
          var3 = ki.a(-27129, this.field_l, this.field_m, param1);
          this.b(var3, false);
          return var3;
        } else {
          var3 = ki.a(-27129, this.field_l, this.field_m, param1);
          this.b(var3, false);
          return var3;
        }
    }

    final void d(int param0, int param1) {
        int fieldTemp$6 = 0;
        int fieldTemp$7 = 0;
        int fieldTemp$8 = 0;
        int fieldTemp$9 = 0;
        int fieldTemp$10 = 0;
        int fieldTemp$11 = 0;
        if (param1 != 2132504424) {
          this.field_m = 1;
          fieldTemp$6 = this.field_m;
          this.field_m = this.field_m + 1;
          this.field_l[fieldTemp$6] = (byte)(param0 >> 1488527344);
          fieldTemp$7 = this.field_m;
          this.field_m = this.field_m + 1;
          this.field_l[fieldTemp$7] = (byte)(param0 >> 2132504424);
          fieldTemp$8 = this.field_m;
          this.field_m = this.field_m + 1;
          this.field_l[fieldTemp$8] = (byte)param0;
          return;
        } else {
          fieldTemp$9 = this.field_m;
          this.field_m = this.field_m + 1;
          this.field_l[fieldTemp$9] = (byte)(param0 >> 1488527344);
          fieldTemp$10 = this.field_m;
          this.field_m = this.field_m + 1;
          this.field_l[fieldTemp$10] = (byte)(param0 >> 2132504424);
          fieldTemp$11 = this.field_m;
          this.field_m = this.field_m + 1;
          this.field_l[fieldTemp$11] = (byte)param0;
          return;
        }
    }

    gb(int param0) {
        this.field_m = 0;
        this.field_l = fl.a(param0, -1);
    }

    gb(byte[] param0) {
        try {
            this.field_m = 0;
            this.field_l = param0;
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) ((Object) runtimeException), "gb.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_h = new pc();
        field_j = 0;
    }
}
