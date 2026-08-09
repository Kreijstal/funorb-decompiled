/*
 * Decompiled by CFR-JS 0.4.0.
 */
class k extends br {
    int field_j;
    byte[] field_m;
    static int field_k;
    static int[] field_n;
    static boolean field_f;
    static String field_h;
    static vp field_l;
    static cj field_g;
    static int[] field_i;

    final int e(byte param0) {
        if (param0 == -49) {
          if ((this.field_m[this.field_j] ^ -1) > -1) {
            return this.i(-1478490344) & 2147483647;
          } else {
            return this.d((byte) 69);
          }
        } else {
          field_k = -8;
          if ((this.field_m[this.field_j] ^ -1) > -1) {
            return this.i(-1478490344) & 2147483647;
          } else {
            return this.d((byte) 69);
          }
        }
    }

    final void a(byte param0, int param1) {
        this.field_m[this.field_j + -param1 - 4] = (byte)(param1 >> -660463464);
        this.field_m[this.field_j - param1 - 3] = (byte)(param1 >> -1444588944);
        this.field_m[this.field_j + (-param1 + -2)] = (byte)(param1 >> -1553235672);
        this.field_m[this.field_j - param1 + -1] = (byte)param1;
        if (param0 == 123) {
          return;
        } else {
          this.e((byte) 75);
          return;
        }
    }

    final void a(byte[] param0, int param1, int param2, int param3) {
        int fieldTemp$1 = 0;
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
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = ZombieDawnMulti.field_E ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param3 > 105) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        field_k = -45;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var5_int = param2;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (param2 - -param1 <= var5_int) {
                            statePc = 14;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        fieldTemp$1 = this.field_j;
                        this.field_j = this.field_j + 1;
                        this.field_m[fieldTemp$1] = param0[var5_int];
                        var5_int++;
                        if (var6 == 0) {
                            statePc = 7;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        return;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (var6 == 0) {
                            statePc = 4;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        return;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 10: {
                    var5 = (RuntimeException) ((Object) caughtException);
                    stackIn_12_0 = (RuntimeException) (var5);
                    stackIn_11_0 = stackIn_12_0;
                    stackIn_12_1 = new StringBuilder().append("k.HB(");
                    stackIn_11_1 = stackIn_12_1;
                    if (param0 == null) {
                        statePc = 12;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    stackIn_13_0 = (RuntimeException) ((Object) stackIn_11_0);
                    stackIn_13_1 = (StringBuilder) ((Object) stackIn_11_1);
                    stackIn_13_2 = "{...}";
                    statePc = 13;
                    continue stateLoop;
                }
                case 12: {
                    stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
                    stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
                    stackIn_13_2 = "null";
                    statePc = 13;
                    continue stateLoop;
                }
                case 13: {
                    throw fa.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
                }
                case 14: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void b(boolean param0) {
        field_n = null;
        field_i = null;
        field_g = null;
        field_l = null;
        if (param0) {
            return;
        }
        field_h = null;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int stackIn_7_0 = 0;
        int stackIn_28_0 = 0;
        int var6;
        int var7;
        ka.field_f[lj.field_n] = param4;
        la.field_c[lj.field_n] = lj.field_n;
        lb.field_c[lj.field_n] = param3;
        if (ab.field_j <= param3) {
          L0: {
            if (param3 > up.field_d) {
              ba.field_m = param3;
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            vk.field_J[lj.field_n] = param2;
            kj.field_p[lj.field_n] = param1;
            ie.field_ob[lj.field_n] = param5;
            var6 = param5 + param2 + param1;
            if (var6 == 0) {
              stackIn_28_0 = 0;
              break L1;
            } else {
              stackIn_28_0 = param2 * 1000 / var6;
              break L1;
            }
          }
          var7 = stackIn_28_0;
          hn.field_f[lj.field_n] = var7;
          if (param0 == 1000) {
            L2: {
              if (var7 > ba.field_m) {
                ba.field_m = var7;
                break L2;
              } else {
                break L2;
              }
            }
            lj.field_n = lj.field_n + 1;
            if (var7 >= mj.field_Ub) {
              return;
            } else {
              mj.field_Ub = var7;
              return;
            }
          } else {
            L3: {
              field_h = (String) null;
              if (var7 > ba.field_m) {
                ba.field_m = var7;
                break L3;
              } else {
                break L3;
              }
            }
            lj.field_n = lj.field_n + 1;
            if (var7 >= mj.field_Ub) {
              return;
            } else {
              mj.field_Ub = var7;
              return;
            }
          }
        } else {
          L4: {
            mj.field_Ub = param3;
            if (param3 > up.field_d) {
              ba.field_m = param3;
              break L4;
            } else {
              break L4;
            }
          }
          L5: {
            vk.field_J[lj.field_n] = param2;
            kj.field_p[lj.field_n] = param1;
            ie.field_ob[lj.field_n] = param5;
            var6 = param5 + param2 + param1;
            if (var6 == 0) {
              stackIn_7_0 = 0;
              break L5;
            } else {
              stackIn_7_0 = param2 * 1000 / var6;
              break L5;
            }
          }
          var7 = stackIn_7_0;
          hn.field_f[lj.field_n] = var7;
          if (param0 == 1000) {
            L6: {
              if (var7 > ba.field_m) {
                ba.field_m = var7;
                break L6;
              } else {
                break L6;
              }
            }
            lj.field_n = lj.field_n + 1;
            if (var7 >= mj.field_Ub) {
              return;
            } else {
              mj.field_Ub = var7;
              return;
            }
          } else {
            L7: {
              field_h = (String) null;
              if (var7 > ba.field_m) {
                ba.field_m = var7;
                break L7;
              } else {
                break L7;
              }
            }
            lj.field_n = lj.field_n + 1;
            if (var7 >= mj.field_Ub) {
              return;
            } else {
              mj.field_Ub = var7;
              return;
            }
          }
        }
    }

    final int i(int param0) {
        if (param0 != -1478490344) {
          return 125;
        } else {
          this.field_j = this.field_j + 4;
          return (this.field_m[this.field_j + -1] & 255) + ((this.field_m[-2 + this.field_j] & 255) << 751431464) + ((-16777216 & this.field_m[this.field_j - 4] << -1478490344) - -(16711680 & this.field_m[-3 + this.field_j] << 480091888));
        }
    }

    final static ja a(int param0, int param1, int param2) {
        ja var3 = null;
        int var4 = 0;
        int var5 = 0;
        ja stackIn_6_0 = null;
        ja stackIn_7_0 = null;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var5 = ZombieDawnMulti.field_E ? 1 : 0;
                    var3 = new ja(param1, param1);
                    if (param0 < -107) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    k.a(-115, -116, 63);
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    var4 = 0;
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    if (var3.field_B.length > var4) {
                        statePc = 5;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    return var3;
                }
                case 5: {
                    stackIn_7_0 = (ja) (var3);
                    stackIn_6_0 = stackIn_7_0;
                    if (var5 == 0) {
                        statePc = 7;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    return stackIn_6_0;
                }
                case 7: {
                    stackIn_7_0.field_B[var4] = param2;
                    var4++;
                    if (var5 == 0) {
                        statePc = 3;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    return var3;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static cj f(int param0) {
        if (param0 != 23000) {
            k.f(-7);
            return hf.field_e.field_Gb;
        }
        return hf.field_e.field_Gb;
    }

    final int f(int param0, int param1) {
        int var3;
        if (param1 < 111) {
          this.e(-90, -121);
          var3 = c.a(this.field_m, this.field_j, true, param0);
          this.b(8, var3);
          return var3;
        } else {
          var3 = c.a(this.field_m, this.field_j, true, param0);
          this.b(8, var3);
          return var3;
        }
    }

    final void a(String param0, byte param1) {
        int var3_int = 0;
        CharSequence var4 = null;
        int fieldTemp$0 = 0;
        try {
            var3_int = param0.indexOf(' ');
            if ((var3_int ^ -1) <= -1) {
                throw new IllegalArgumentException("");
            }
            if (param1 != 105) {
                this.a(68);
            }
            var4 = (CharSequence) ((Object) param0);
            this.field_j = this.field_j + tg.a(this.field_j, var4, 0, param1 ^ -151, this.field_m, param0.length());
            fieldTemp$0 = this.field_j;
            this.field_j = this.field_j + 1;
            this.field_m[fieldTemp$0] = (byte) 0;
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "k.TA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(byte param0, boolean param1) {
        dk.f(param1, 13758);
        if (param0 < 108) {
            return;
        }
        if (!(ui.field_j == null)) {
            qk.a(ui.field_j, -113);
        }
    }

    final int h(int param0) {
        int var2;
        var2 = 255 & this.field_m[this.field_j];
        if (param0 == 22219) {
          if (var2 < 128) {
            return this.g(31365) + -64;
          } else {
            return this.d((byte) 69) + -49152;
          }
        } else {
          return -13;
        }
    }

    final void a(int param0, byte param1) {
        int fieldTemp$4 = 0;
        int fieldTemp$5 = 0;
        int fieldTemp$6 = 0;
        int fieldTemp$7 = 0;
        if (param1 >= -41) {
          field_h = (String) null;
          fieldTemp$4 = this.field_j;
          this.field_j = this.field_j + 1;
          this.field_m[fieldTemp$4] = (byte)(param0 >> -154415736);
          fieldTemp$5 = this.field_j;
          this.field_j = this.field_j + 1;
          this.field_m[fieldTemp$5] = (byte)param0;
          return;
        } else {
          fieldTemp$6 = this.field_j;
          this.field_j = this.field_j + 1;
          this.field_m[fieldTemp$6] = (byte)(param0 >> -154415736);
          fieldTemp$7 = this.field_j;
          this.field_j = this.field_j + 1;
          this.field_m[fieldTemp$7] = (byte)param0;
          return;
        }
    }

    final void d(int param0, int param1) {
        int fieldTemp$6 = 0;
        int fieldTemp$7 = 0;
        int fieldTemp$8 = 0;
        int fieldTemp$9 = 0;
        int fieldTemp$10 = 0;
        int fieldTemp$11 = 0;
        if (param1 != -8593) {
          field_n = (int[]) null;
          fieldTemp$6 = this.field_j;
          this.field_j = this.field_j + 1;
          this.field_m[fieldTemp$6] = (byte)(param0 >> -1505464016);
          fieldTemp$7 = this.field_j;
          this.field_j = this.field_j + 1;
          this.field_m[fieldTemp$7] = (byte)(param0 >> -1371272024);
          fieldTemp$8 = this.field_j;
          this.field_j = this.field_j + 1;
          this.field_m[fieldTemp$8] = (byte)param0;
          return;
        } else {
          fieldTemp$9 = this.field_j;
          this.field_j = this.field_j + 1;
          this.field_m[fieldTemp$9] = (byte)(param0 >> -1505464016);
          fieldTemp$10 = this.field_j;
          this.field_j = this.field_j + 1;
          this.field_m[fieldTemp$10] = (byte)(param0 >> -1371272024);
          fieldTemp$11 = this.field_j;
          this.field_j = this.field_j + 1;
          this.field_m[fieldTemp$11] = (byte)param0;
          return;
        }
    }

    final void b(long param0, boolean param1) {
        int fieldTemp$9 = 0;
        int fieldTemp$5 = this.field_j;
        this.field_j = this.field_j + 1;
        this.field_m[fieldTemp$5] = (byte)(int)(param0 >> 1165644128);
        int fieldTemp$6 = this.field_j;
        this.field_j = this.field_j + 1;
        this.field_m[fieldTemp$6] = (byte)(int)(param0 >> -560523944);
        int fieldTemp$7 = this.field_j;
        this.field_j = this.field_j + 1;
        this.field_m[fieldTemp$7] = (byte)(int)(param0 >> -823876848);
        int fieldTemp$8 = this.field_j;
        this.field_j = this.field_j + 1;
        this.field_m[fieldTemp$8] = (byte)(int)(param0 >> 512937544);
        if (!param1) {
          return;
        } else {
          fieldTemp$9 = this.field_j;
          this.field_j = this.field_j + 1;
          this.field_m[fieldTemp$9] = (byte)(int)param0;
          return;
        }
    }

    final void g(int param0, int param1) {
        if (param0 != (-128 & param1)) {
          if (0 != (param1 & -16384)) {
            if ((param1 & -2097152) != 0) {
              if ((param1 & -268435456) == 0) {
                this.a(-59, param1 >>> 2028326325 | 128);
                this.a(113, 128 | param1 >>> 815015694);
                this.a(-31, (16405 | param1) >>> -75694233);
                this.a(111, 127 & param1);
                return;
              } else {
                this.a(110, param1 >>> 400482940 | 128);
                this.a(-59, param1 >>> 2028326325 | 128);
                this.a(113, 128 | param1 >>> 815015694);
                this.a(-31, (16405 | param1) >>> -75694233);
                this.a(111, 127 & param1);
                return;
              }
            } else {
              this.a(113, 128 | param1 >>> 815015694);
              this.a(-31, (16405 | param1) >>> -75694233);
              this.a(111, 127 & param1);
              return;
            }
          } else {
            this.a(-31, (16405 | param1) >>> -75694233);
            this.a(111, 127 & param1);
            return;
          }
        } else {
          this.a(111, 127 & param1);
          return;
        }
    }

    final void a(int param0, String param1) {
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        long var3_long = 0L;
        RuntimeException var3 = null;
        long var5 = 0L;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var10 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            var3_long = 0L;
            var5 = 0L;
            var7 = param1.length();
            var8 = 19;
            L1: while (true) {
              L2: {
                L3: {
                  L4: {
                    if ((var8 ^ -1) > -1) {
                      break L4;
                    } else {
                      var3_long = var3_long * 38L;
                      var12 = var8 ^ -1;
                      var11 = var7 ^ -1;
                      if (var10 != 0) {
                        if (var11 == var12) {
                          break L2;
                        } else {
                          break L3;
                        }
                      } else {
                        L5: {
                          if (var11 >= var12) {
                            break L5;
                          } else {
                            L6: {
                              var9 = param1.charAt(var8);
                              if (var9 < 65) {
                                break L6;
                              } else {
                                if (var9 > 90) {
                                  break L6;
                                } else {
                                  var3_long = var3_long + (long)(2 - -var9 - 65);
                                  if (var10 == 0) {
                                    break L5;
                                  } else {
                                    break L6;
                                  }
                                }
                              }
                            }
                            L7: {
                              L8: {
                                if (var9 < 97) {
                                  break L8;
                                } else {
                                  if (var9 <= 122) {
                                    break L7;
                                  } else {
                                    break L8;
                                  }
                                }
                              }
                              L9: {
                                if (var9 < 48) {
                                  break L9;
                                } else {
                                  if (var9 > 57) {
                                    break L9;
                                  } else {
                                    var3_long = var3_long + (long)(28 - (-var9 + 48));
                                    if (var10 == 0) {
                                      break L5;
                                    } else {
                                      break L9;
                                    }
                                  }
                                }
                              }
                              var3_long = var3_long + 1L;
                              if (var10 == 0) {
                                break L5;
                              } else {
                                break L7;
                              }
                            }
                            var3_long = var3_long + (long)(-97 + (2 + var9));
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
                          continue L1;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  if (param0 == 13066) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
                this.a((byte) -11);
                break L2;
              }
              this.a(var3_long, param0 ^ -13160);
              this.a(var5, -112);
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var3 = decompiledCaughtException;
            stackIn_29_0 = (RuntimeException) (var3);

            stackIn_29_1 = new StringBuilder().append("k.P(").append(param0).append(',');

            if (param1 == null) {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "null";
              break L11;
            } else {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "{...}";
              break L11;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_30_0), stackIn_30_2 + ')');
        }
    }

    final long a(byte param0) {
        long var2;
        long var4;
        if (param0 != -30) {
          this.c(-125);
          var2 = (long)this.i(param0 + -1478490314) & 4294967295L;
          var4 = (long)this.i(-1478490344) & 4294967295L;
          return var4 + (var2 << -442871200);
        } else {
          var2 = (long)this.i(param0 + -1478490314) & 4294967295L;
          var4 = (long)this.i(-1478490344) & 4294967295L;
          return var4 + (var2 << -442871200);
        }
    }

    final int c(byte param0) {
        int var2;
        L0: {
          this.field_j = this.field_j + 2;
          var2 = (65280 & this.field_m[this.field_j - 2] << -956695352) + (this.field_m[this.field_j + -1] & 255);
          if ((var2 ^ -1) >= -32768) {
            break L0;
          } else {
            var2 = var2 - 65536;
            break L0;
          }
        }
        if (param0 != -18) {
          return -120;
        } else {
          return var2;
        }
    }

    final int d(byte param0) {
        this.field_j = this.field_j + 2;
        if (param0 != 69) {
          k.a(10, -33, 94, -107, -118, 82);
          return (this.field_m[this.field_j + -1] & 255) + (this.field_m[this.field_j + -2] << 1513073800 & 65280);
        } else {
          return (this.field_m[this.field_j + -1] & 255) + (this.field_m[this.field_j + -2] << 1513073800 & 65280);
        }
    }

    final void a(java.math.BigInteger param0, int param1, java.math.BigInteger param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        byte[] var5 = null;
        java.math.BigInteger var6 = null;
        java.math.BigInteger var7 = null;
        byte[] var8 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_8_1 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var4_int = this.field_j;
            this.field_j = 0;
            var5 = new byte[var4_int];
            this.a(0, -6351, var4_int, var5);
            var6 = new java.math.BigInteger(var5);
            var7 = var6.modPow(param0, param2);
            var8 = var7.toByteArray();
            this.field_j = 0;
            this.a(var8.length, (byte) -101);
            this.a(var8, var8.length, 0, param1 ^ -2617);
            if (param1 == -2628) {
              break L0;
            } else {
              field_l = (vp) null;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (var4);

            stackIn_5_1 = new StringBuilder().append("k.WA(");

            if (param0 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L1;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_8_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_6_0), stackIn_9_2 + ')');
        }
    }

    final void b(int param0, String param1) {
        int var3_int = 0;
        int fieldTemp$0 = 0;
        CharSequence var4 = null;
        int fieldTemp$1 = 0;
        try {
            var3_int = param1.indexOf(' ');
            if (-1 >= (var3_int ^ -1)) {
                throw new IllegalArgumentException("");
            }
            if (param0 != -16171) {
                field_k = 118;
            }
            fieldTemp$0 = this.field_j;
            this.field_j = this.field_j + 1;
            this.field_m[fieldTemp$0] = (byte) 0;
            var4 = (CharSequence) ((Object) param1);
            this.field_j = this.field_j + tg.a(this.field_j, var4, 0, -256, this.field_m, param1.length());
            fieldTemp$1 = this.field_j;
            this.field_j = this.field_j + 1;
            this.field_m[fieldTemp$1] = (byte) 0;
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "k.GA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final String g(byte param0) {
        int[] var3;
        if (this.field_m[this.field_j] == 0) {
          this.field_j = this.field_j + 1;
          return null;
        } else {
          if (param0 != -89) {
            var3 = (int[]) null;
            this.a(28, (int[]) null);
            return this.f((byte) -48);
          } else {
            return this.f((byte) -48);
          }
        }
    }

    final String c(int param0) {
        int fieldTemp$1 = 0;
        int fieldTemp$0 = this.field_j;
        this.field_j = this.field_j + 1;
        int var2 = this.field_m[fieldTemp$0];
        if (!(param0 == var2)) {
            throw new IllegalStateException("");
        }
        int var3 = this.field_j;
        while (true) {
            fieldTemp$1 = this.field_j;
            this.field_j = this.field_j + 1;
            if (-1 == (this.field_m[fieldTemp$1] ^ -1)) {
                break;
            }
        }
        int var4 = -1 + -var3 + this.field_j;
        if (!(0 != var4)) {
            return "";
        }
        return oe.a(var4, this.field_m, false, var3);
    }

    final String f(byte param0) {
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        int var2;
        int var3;
        if (param0 < -4) {
          var2 = this.field_j;
          L0: while (true) {
            fieldTemp$2 = this.field_j;
            this.field_j = this.field_j + 1;
            if (this.field_m[fieldTemp$2] == 0) {
              var3 = -1 + this.field_j + -var2;
              if (var3 == 0) {
                return "";
              } else {
                return oe.a(var3, this.field_m, false, var2);
              }
            } else {
              continue L0;
            }
          }
        } else {
          this.c(-126, -45);
          var2 = this.field_j;
          L1: while (true) {
            fieldTemp$3 = this.field_j;
            this.field_j = this.field_j + 1;
            if (this.field_m[fieldTemp$3] == 0) {
              var3 = -1 + this.field_j + -var2;
              if (var3 == 0) {
                return "";
              } else {
                return oe.a(var3, this.field_m, false, var2);
              }
            } else {
              continue L1;
            }
          }
        }
    }

    final void e(int param0, int param1) {
        if (param0 < 15) {
            return;
        }
        this.field_m[-1 + -param1 + this.field_j] = (byte)param1;
    }

    final void c(int param0, int param1) {
        if (64 <= param0) {
          if (-16385 < (param0 ^ -1)) {
            if (16383 < (param0 ^ -1)) {
              if (param1 != 0) {
                this.c(false);
                throw new IllegalArgumentException();
              } else {
                throw new IllegalArgumentException();
              }
            } else {
              this.a(param0 - -49152, (byte) -83);
              return;
            }
          } else {
            if (param1 != 0) {
              this.c(false);
              throw new IllegalArgumentException();
            } else {
              throw new IllegalArgumentException();
            }
          }
        } else {
          if ((param0 ^ -1) > 63) {
            if (-16385 < (param0 ^ -1)) {
              if (16383 < (param0 ^ -1)) {
                if (param1 != 0) {
                  this.c(false);
                  throw new IllegalArgumentException();
                } else {
                  throw new IllegalArgumentException();
                }
              } else {
                this.a(param0 - -49152, (byte) -83);
                return;
              }
            } else {
              if (param1 != 0) {
                this.c(false);
                throw new IllegalArgumentException();
              } else {
                throw new IllegalArgumentException();
              }
            }
          } else {
            this.a(121, 64 + param0);
            return;
          }
        }
    }

    final int g(int param0) {
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        if (param0 != 31365) {
          field_h = (String) null;
          fieldTemp$2 = this.field_j;
          this.field_j = this.field_j + 1;
          return this.field_m[fieldTemp$2] & 255;
        } else {
          fieldTemp$3 = this.field_j;
          this.field_j = this.field_j + 1;
          return this.field_m[fieldTemp$3] & 255;
        }
    }

    final void b(boolean param0, int param1) {
        if (param0) {
          return;
        } else {
          this.field_m[-2 + (-param1 + this.field_j)] = (byte)(param1 >> 1460556776);
          this.field_m[-1 + (-param1 + this.field_j)] = (byte)param1;
          return;
        }
    }

    final void b(int param0, int param1) {
        int fieldTemp$0 = this.field_j;
        this.field_j = this.field_j + 1;
        this.field_m[fieldTemp$0] = (byte)(param1 >> -1327389576);
        int fieldTemp$1 = this.field_j;
        this.field_j = this.field_j + 1;
        this.field_m[fieldTemp$1] = (byte)(param1 >> -1215600080);
        int fieldTemp$2 = this.field_j;
        this.field_j = this.field_j + 1;
        this.field_m[fieldTemp$2] = (byte)(param1 >> -263403256);
        int var3 = -96 % ((param0 - -58) / 41);
        int fieldTemp$3 = this.field_j;
        this.field_j = this.field_j + 1;
        this.field_m[fieldTemp$3] = (byte)param1;
    }

    final int e(int param0) {
        if (param0 != 128) {
          return 54;
        } else {
          this.field_j = this.field_j + 3;
          return (255 & this.field_m[this.field_j - 1]) + ((255 & this.field_m[-2 + this.field_j]) << 529537512) + ((255 & this.field_m[this.field_j - 3]) << 1527922608);
        }
    }

    final void a(int param0, int param1) {
        int fieldTemp$0 = this.field_j;
        this.field_j = this.field_j + 1;
        this.field_m[fieldTemp$0] = (byte)param1;
        int var3 = 81 / ((param0 - 45) / 62);
    }

    final byte d(int param0) {
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        if (param0 != -249699580) {
          this.b(-15, (byte) -127);
          fieldTemp$2 = this.field_j;
          this.field_j = this.field_j + 1;
          return this.field_m[fieldTemp$2];
        } else {
          fieldTemp$3 = this.field_j;
          this.field_j = this.field_j + 1;
          return this.field_m[fieldTemp$3];
        }
    }

    private final void a(long param0, int param1) {
        int var4 = -44 % ((-13 - param1) / 42);
        int fieldTemp$0 = this.field_j;
        this.field_j = this.field_j + 1;
        this.field_m[fieldTemp$0] = (byte)(int)(param0 >> -1906816720);
        int fieldTemp$1 = this.field_j;
        this.field_j = this.field_j + 1;
        this.field_m[fieldTemp$1] = (byte)(int)(param0 >> 1362536744);
        int fieldTemp$2 = this.field_j;
        this.field_j = this.field_j + 1;
        this.field_m[fieldTemp$2] = (byte)(int)(param0 >> 411570912);
        int fieldTemp$3 = this.field_j;
        this.field_j = this.field_j + 1;
        this.field_m[fieldTemp$3] = (byte)(int)(param0 >> -741946024);
        int fieldTemp$4 = this.field_j;
        this.field_j = this.field_j + 1;
        this.field_m[fieldTemp$4] = (byte)(int)(param0 >> 1127210000);
        int fieldTemp$5 = this.field_j;
        this.field_j = this.field_j + 1;
        this.field_m[fieldTemp$5] = (byte)(int)(param0 >> -154739064);
        int fieldTemp$6 = this.field_j;
        this.field_j = this.field_j + 1;
        this.field_m[fieldTemp$6] = (byte)(int)param0;
    }

    final int a(int param0) {
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        byte stackIn_4_0 = 0;
        byte stackIn_5_0 = 0;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = ZombieDawnMulti.field_E ? 1 : 0;
                    fieldTemp$2 = this.field_j;
                    this.field_j = this.field_j + 1;
                    var2 = this.field_m[fieldTemp$2];
                    var3 = param0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    if (0 > var2) {
                        statePc = 3;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    return var2 | var3;
                }
                case 3: {
                    var3 = (var2 & 127 | var3) << 452978023;
                    fieldTemp$3 = this.field_j;
                    this.field_j = this.field_j + 1;
                    stackIn_5_0 = this.field_m[fieldTemp$3];
                    stackIn_4_0 = stackIn_5_0;
                    if (var4 == 0) {
                        statePc = 5;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    return stackIn_4_0;
                }
                case 5: {
                    var2 = stackIn_5_0;
                    if (var4 == 0) {
                        statePc = 1;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    return var2 | var3;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void b(int param0, byte param1) {
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        int var4 = 0;
        byte[] var5 = null;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = ZombieDawnMulti.field_E ? 1 : 0;
                    if (param1 < 92) {
                        statePc = 7;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    if (this.field_j < param0) {
                        statePc = 3;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    return;
                }
                case 3: {
                    fieldTemp$2 = this.field_j;
                    this.field_j = this.field_j + 1;
                    this.field_m[fieldTemp$2] = (byte) 0;
                    if (var4 == 0) {
                        statePc = 5;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    return;
                }
                case 5: {
                    if (var4 == 0) {
                        statePc = 1;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    return;
                }
                case 7: {
                    var5 = (byte[]) null;
                    this.a((byte[]) null, -125, -32, 77);
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    if (this.field_j < param0) {
                        statePc = 10;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    return;
                }
                case 10: {
                    fieldTemp$3 = this.field_j;
                    this.field_j = this.field_j + 1;
                    this.field_m[fieldTemp$3] = (byte) 0;
                    if (var4 == 0) {
                        statePc = 12;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    return;
                }
                case 12: {
                    if (var4 == 0) {
                        statePc = 8;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final boolean c(boolean param0) {
        int var2;
        int var3;
        int stackIn_4_0 = 0;
        this.field_j = this.field_j - 4;
        if (param0) {
          field_f = true;
          var2 = c.a(this.field_m, this.field_j, true, 0);
          var3 = this.i(-1478490344);
          if (var2 != var3) {
            return false;
          } else {
            return true;
          }
        } else {
          L0: {
            var2 = c.a(this.field_m, this.field_j, true, 0);
            var3 = this.i(-1478490344);
            if (var2 == var3) {
              stackIn_4_0 = 1;
              break L0;
            } else {
              stackIn_4_0 = 0;
              break L0;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final void a(int param0, int[] param1, int param2, int param3) {
        int incrementValue$0 = 0;
        int stackIn_4_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var13 = ZombieDawnMulti.field_E ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var5_int = this.field_j;
                        this.field_j = param3;
                        var6 = (param0 + -param3) / 8;
                        var7 = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (var6 <= var7) {
                            statePc = 11;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var8 = this.i(param2 + -1478487780);
                        var9 = this.i(-1478490344);
                        var10 = -957401312;
                        var11 = -1640531527;
                        stackIn_12_0 = 32;
                        stackIn_4_0 = stackIn_12_0;
                        if (var13 != 0) {
                            statePc = 12;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var12 = stackIn_4_0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        incrementValue$0 = var12;
                        var12--;
                        if ((incrementValue$0 ^ -1) >= -1) {
                            statePc = 9;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var9 = var9 - (param1[var10 >>> 932792459 & -1663041533] + var10 ^ (var8 << -400860700 ^ var8 >>> 1647008421) - -var8);
                        var10 = var10 - var11;
                        var8 = var8 - ((var9 << -249699580 ^ var9 >>> 1439880101) + var9 ^ var10 - -param1[3 & var10]);
                        if (var13 != 0) {
                            statePc = 10;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (var13 == 0) {
                            statePc = 5;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        this.field_j = this.field_j - 8;
                        this.b(-121, var8);
                        this.b(22, var9);
                        var7++;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (var13 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        stackIn_12_0 = param2;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (stackIn_12_0 == -2564) {
                            statePc = 14;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 13: {
                    return;
                }
                case 14: {
                    try {
                        this.field_j = var5_int;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 16: {
                    var5 = (RuntimeException) ((Object) caughtException);
                    stackIn_18_0 = (RuntimeException) (var5);
                    stackIn_17_0 = stackIn_18_0;
                    stackIn_18_1 = new StringBuilder().append("k.KA(").append(param0).append(',');
                    stackIn_17_1 = stackIn_18_1;
                    if (param1 == null) {
                        statePc = 18;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    stackIn_19_0 = (RuntimeException) ((Object) stackIn_17_0);
                    stackIn_19_1 = (StringBuilder) ((Object) stackIn_17_1);
                    stackIn_19_2 = "{...}";
                    statePc = 19;
                    continue stateLoop;
                }
                case 18: {
                    stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
                    stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
                    stackIn_19_2 = "null";
                    statePc = 19;
                    continue stateLoop;
                }
                case 19: {
                    throw fa.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param2 + ',' + param3 + ')');
                }
                case 20: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void c(int param0, byte param1) {
        int var3;
        if (0 > param0) {
          if (-1 >= (param0 ^ -1)) {
            if (-32769 >= (param0 ^ -1)) {
              var3 = 22 % ((param1 - 0) / 46);
              throw new IllegalArgumentException();
            } else {
              this.a(param0 + 32768, (byte) -75);
              return;
            }
          } else {
            var3 = 22 % ((param1 - 0) / 46);
            throw new IllegalArgumentException();
          }
        } else {
          if (128 <= param0) {
            if (-1 >= (param0 ^ -1)) {
              if (-32769 >= (param0 ^ -1)) {
                var3 = 22 % ((param1 - 0) / 46);
                throw new IllegalArgumentException();
              } else {
                this.a(param0 + 32768, (byte) -75);
                return;
              }
            } else {
              var3 = 22 % ((param1 - 0) / 46);
              throw new IllegalArgumentException();
            }
          } else {
            this.a(-53, param0);
            return;
          }
        }
    }

    final void a(int param0, int param1, int param2, byte[] param3) {
        int fieldTemp$1 = 0;
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
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = ZombieDawnMulti.field_E ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var5_int = param0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (param2 + param0 <= var5_int) {
                            statePc = 6;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        fieldTemp$1 = this.field_j;
                        this.field_j = this.field_j + 1;
                        param3[var5_int] = this.field_m[fieldTemp$1];
                        var5_int++;
                        if (var6 != 0) {
                            statePc = 13;
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
                        if (var6 == 0) {
                            statePc = 2;
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
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (param1 == -6351) {
                            statePc = 13;
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
                        field_h = (String) null;
                        return;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 9: {
                    var5 = (RuntimeException) ((Object) caughtException);
                    stackIn_11_0 = (RuntimeException) (var5);
                    stackIn_10_0 = stackIn_11_0;
                    stackIn_11_1 = new StringBuilder().append("k.IA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
                    stackIn_10_1 = stackIn_11_1;
                    if (param3 == null) {
                        statePc = 11;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    stackIn_12_0 = (RuntimeException) ((Object) stackIn_10_0);
                    stackIn_12_1 = (StringBuilder) ((Object) stackIn_10_1);
                    stackIn_12_2 = "{...}";
                    statePc = 12;
                    continue stateLoop;
                }
                case 11: {
                    stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
                    stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
                    stackIn_12_2 = "null";
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    throw fa.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
                }
                case 13: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final int h(byte param0) {
        int var2;
        var2 = 255 & this.field_m[this.field_j];
        if (param0 <= -102) {
          if (var2 >= 128) {
            return -32768 + this.d((byte) 69);
          } else {
            return this.g(31365);
          }
        } else {
          field_g = (cj) null;
          if (var2 >= 128) {
            return -32768 + this.d((byte) 69);
          } else {
            return this.g(31365);
          }
        }
    }

    final void a(int param0, int[] param1) {
        int incrementValue$0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var10 = ZombieDawnMulti.field_E ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var3_int = this.field_j / 8;
                        this.field_j = param0;
                        var4 = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (var4 >= var3_int) {
                            statePc = 17;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var5 = this.i(-1478490344);
                        var6 = this.i(-1478490344);
                        var7 = 0;
                        var8 = -1640531527;
                        if (var10 == 0) {
                            statePc = 5;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        return;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var9 = 32;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        incrementValue$0 = var9;
                        var9--;
                        if (0 >= incrementValue$0) {
                            statePc = 10;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var5 = var5 + (var6 + (var6 << -822920828 ^ var6 >>> 1779652421) ^ var7 - -param1[var7 & 3]);
                        var7 = var7 + var8;
                        var6 = var6 + (param1[(6402 & var7) >>> -1057174581] + var7 ^ (var5 << -43658236 ^ var5 >>> -1099706043) - -var5);
                        if (var10 != 0) {
                            statePc = 11;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (var10 == 0) {
                            statePc = 6;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        this.field_j = this.field_j - 8;
                        this.b(-100, var5);
                        this.b(-103, var6);
                        var4++;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (var10 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 13: {
                    var3 = (RuntimeException) ((Object) caughtException);
                    stackIn_15_0 = (RuntimeException) (var3);
                    stackIn_14_0 = stackIn_15_0;
                    stackIn_15_1 = new StringBuilder().append("k.GB(").append(param0).append(',');
                    stackIn_14_1 = stackIn_15_1;
                    if (param1 == null) {
                        statePc = 15;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    stackIn_16_0 = (RuntimeException) ((Object) stackIn_14_0);
                    stackIn_16_1 = (StringBuilder) ((Object) stackIn_14_1);
                    stackIn_16_2 = "{...}";
                    statePc = 16;
                    continue stateLoop;
                }
                case 15: {
                    stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
                    stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
                    stackIn_16_2 = "null";
                    statePc = 16;
                    continue stateLoop;
                }
                case 16: {
                    throw fa.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
                }
                case 17: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(long param0, boolean param1) {
        int fieldTemp$9 = 0;
        int fieldTemp$10 = 0;
        int fieldTemp$11 = 0;
        int fieldTemp$12 = 0;
        int fieldTemp$13 = 0;
        int fieldTemp$14 = 0;
        int fieldTemp$15 = 0;
        int fieldTemp$8 = this.field_j;
        this.field_j = this.field_j + 1;
        this.field_m[fieldTemp$8] = (byte)(int)(param0 >> 1853850808);
        if (!param1) {
          return;
        } else {
          fieldTemp$9 = this.field_j;
          this.field_j = this.field_j + 1;
          this.field_m[fieldTemp$9] = (byte)(int)(param0 >> -1612143312);
          fieldTemp$10 = this.field_j;
          this.field_j = this.field_j + 1;
          this.field_m[fieldTemp$10] = (byte)(int)(param0 >> 1925537832);
          fieldTemp$11 = this.field_j;
          this.field_j = this.field_j + 1;
          this.field_m[fieldTemp$11] = (byte)(int)(param0 >> 156118560);
          fieldTemp$12 = this.field_j;
          this.field_j = this.field_j + 1;
          this.field_m[fieldTemp$12] = (byte)(int)(param0 >> 1758226392);
          fieldTemp$13 = this.field_j;
          this.field_j = this.field_j + 1;
          this.field_m[fieldTemp$13] = (byte)(int)(param0 >> -687475056);
          fieldTemp$14 = this.field_j;
          this.field_j = this.field_j + 1;
          this.field_m[fieldTemp$14] = (byte)(int)(param0 >> -1336882680);
          fieldTemp$15 = this.field_j;
          this.field_j = this.field_j + 1;
          this.field_m[fieldTemp$15] = (byte)(int)param0;
          return;
        }
    }

    k(int param0) {
        this.field_j = 0;
        this.field_m = fl.a(-105, param0);
    }

    k(byte[] param0) {
        try {
            this.field_j = 0;
            this.field_m = param0;
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "k.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_k = -1;
        field_n = da.a(8);
        field_h = "Counter";
    }
}
