/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ol {
    private int field_b;
    private int[] field_i;
    private int[] field_a;
    private int field_d;
    static na field_h;
    private int field_f;
    private int field_c;
    static id field_g;
    static int field_e;

    public static void a(int param0) {
        field_g = null;
        if (param0 < 108) {
            field_h = (na) null;
        }
        field_h = null;
    }

    final int c(int param0) {
        if (!(param0 != this.field_d)) {
            this.b(param0 ^ 0);
            this.field_d = 256;
        }
        int fieldTemp$0 = this.field_d - 1;
        this.field_d = this.field_d - 1;
        return this.field_a[fieldTemp$0];
    }

    private final void d(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (param0 == 8273) {
          var6 = -1640531527;
          var4 = -1640531527;
          var3 = -1640531527;
          var10 = -1640531527;
          var9 = -1640531527;
          var8 = -1640531527;
          var5 = -1640531527;
          var7 = -1640531527;
          var2 = 0;
          L0: while (true) {
            L1: {
              L2: {
                if (4 <= var2) {
                  break L2;
                } else {
                  var3 = var3 ^ var4 << 573062603;
                  var4 = var4 + var5;
                  var6 = var6 + var3;
                  var4 = var4 ^ var5 >>> 929804802;
                  var7 = var7 + var4;
                  var5 = var5 + var6;
                  var5 = var5 ^ var6 << 19940136;
                  var8 = var8 + var5;
                  var6 = var6 + var7;
                  var6 = var6 ^ var7 >>> 1533786544;
                  var9 = var9 + var6;
                  var7 = var7 + var8;
                  var7 = var7 ^ var8 << 1573691690;
                  var8 = var8 + var9;
                  var10 = var10 + var7;
                  var8 = var8 ^ var9 >>> -1167363356;
                  var3 = var3 + var8;
                  var9 = var9 + var10;
                  var9 = var9 ^ var10 << 1607644456;
                  var10 = var10 + var3;
                  var4 = var4 + var9;
                  var10 = var10 ^ var3 >>> -869402487;
                  var3 = var3 + var4;
                  var5 = var5 + var10;
                  var2++;
                  if (var11 != 0) {
                    break L1;
                  } else {
                    if (var11 == 0) {
                      continue L0;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              var2 = 0;
              break L1;
            }
            L3: while (true) {
              L4: {
                L5: {
                  if ((var2 ^ -1) <= -257) {
                    break L5;
                  } else {
                    var5 = var5 + this.field_a[2 + var2];
                    var4 = var4 + this.field_a[var2 - -1];
                    var6 = var6 + this.field_a[var2 + 3];
                    var9 = var9 + this.field_a[6 + var2];
                    var7 = var7 + this.field_a[4 + var2];
                    var10 = var10 + this.field_a[var2 - -7];
                    var3 = var3 + this.field_a[var2];
                    var8 = var8 + this.field_a[var2 - -5];
                    var3 = var3 ^ var4 << -850095765;
                    var4 = var4 + var5;
                    var6 = var6 + var3;
                    var4 = var4 ^ var5 >>> 1288611490;
                    var7 = var7 + var4;
                    var5 = var5 + var6;
                    var5 = var5 ^ var6 << -914708728;
                    var8 = var8 + var5;
                    var6 = var6 + var7;
                    var6 = var6 ^ var7 >>> 532454032;
                    var9 = var9 + var6;
                    var7 = var7 + var8;
                    var7 = var7 ^ var8 << -1520898710;
                    var8 = var8 + var9;
                    var10 = var10 + var7;
                    var8 = var8 ^ var9 >>> -45382492;
                    var3 = var3 + var8;
                    var9 = var9 + var10;
                    var9 = var9 ^ var10 << 1187904808;
                    var4 = var4 + var9;
                    var10 = var10 + var3;
                    var10 = var10 ^ var3 >>> 2076644009;
                    var3 = var3 + var4;
                    var5 = var5 + var10;
                    this.field_i[var2] = var3;
                    this.field_i[1 + var2] = var4;
                    this.field_i[var2 + 2] = var5;
                    this.field_i[3 + var2] = var6;
                    this.field_i[4 + var2] = var7;
                    this.field_i[5 + var2] = var8;
                    this.field_i[6 + var2] = var9;
                    this.field_i[var2 - -7] = var10;
                    var2 += 8;
                    if (var11 != 0) {
                      break L4;
                    } else {
                      if (var11 == 0) {
                        continue L3;
                      } else {
                        break L5;
                      }
                    }
                  }
                }
                var2 = 0;
                break L4;
              }
              L6: while (true) {
                L7: {
                  L8: {
                    if ((var2 ^ -1) <= -257) {
                      break L8;
                    } else {
                      var6 = var6 + this.field_i[3 + var2];
                      var8 = var8 + this.field_i[var2 - -5];
                      var7 = var7 + this.field_i[var2 - -4];
                      var3 = var3 + this.field_i[var2];
                      var5 = var5 + this.field_i[2 + var2];
                      var4 = var4 + this.field_i[var2 + 1];
                      var10 = var10 + this.field_i[var2 - -7];
                      var9 = var9 + this.field_i[var2 + 6];
                      var3 = var3 ^ var4 << -1534587381;
                      var4 = var4 + var5;
                      var6 = var6 + var3;
                      var4 = var4 ^ var5 >>> 585986754;
                      var7 = var7 + var4;
                      var5 = var5 + var6;
                      var5 = var5 ^ var6 << -364741208;
                      var6 = var6 + var7;
                      var8 = var8 + var5;
                      var6 = var6 ^ var7 >>> -531678064;
                      var7 = var7 + var8;
                      var9 = var9 + var6;
                      var7 = var7 ^ var8 << -1428087446;
                      var8 = var8 + var9;
                      var10 = var10 + var7;
                      var8 = var8 ^ var9 >>> -577372732;
                      var9 = var9 + var10;
                      var3 = var3 + var8;
                      var9 = var9 ^ var10 << -1415483064;
                      var4 = var4 + var9;
                      var10 = var10 + var3;
                      var10 = var10 ^ var3 >>> 248481641;
                      var5 = var5 + var10;
                      var3 = var3 + var4;
                      this.field_i[var2] = var3;
                      this.field_i[1 + var2] = var4;
                      this.field_i[2 + var2] = var5;
                      this.field_i[var2 + 3] = var6;
                      this.field_i[4 + var2] = var7;
                      this.field_i[var2 - -5] = var8;
                      this.field_i[6 + var2] = var9;
                      this.field_i[var2 - -7] = var10;
                      var2 += 8;
                      if (var11 != 0) {
                        break L7;
                      } else {
                        if (var11 == 0) {
                          continue L6;
                        } else {
                          break L8;
                        }
                      }
                    }
                  }
                  this.b(0);
                  this.field_d = 256;
                  break L7;
                }
                return;
              }
            }
          }
        } else {
          return;
        }
    }

    final static void a(byte[] param0, int param1) {
        byte dupTemp$1 = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        byte[] var8 = null;
        byte[] var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var15 = 0;
        gk var16 = null;
        gk var17 = null;
        byte[] var18 = null;
        byte[] var19 = null;
        byte[] var20 = null;
        byte[] var21 = null;
        int stackIn_27_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_34_1 = 0;
        int stackIn_38_0 = 0;
        int stackIn_38_1 = 0;
        int stackIn_52_0 = 0;
        int stackIn_60_0 = 0;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        String stackIn_70_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_30_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_33_1 = 0;
        int stackOut_36_0 = 0;
        int stackOut_36_1 = 0;
        int stackOut_46_0 = 0;
        int stackOut_46_1 = 0;
        int stackOut_59_0 = 0;
        int stackOut_51_0 = 0;
        int stackOut_62_0 = 0;
        RuntimeException stackOut_67_0 = null;
        StringBuilder stackOut_67_1 = null;
        RuntimeException stackOut_69_0 = null;
        StringBuilder stackOut_69_1 = null;
        String stackOut_69_2 = null;
        RuntimeException stackOut_68_0 = null;
        StringBuilder stackOut_68_1 = null;
        String stackOut_68_2 = null;
        var15 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            var16 = new gk(param0);
            var17 = var16;
            var17.field_h = -2 + param0.length;
            eg.field_c = var17.j(17277);
            ra.field_ab = new int[eg.field_c];
            j.field_d = new boolean[eg.field_c];
            cb.field_b = new byte[eg.field_c][];
            qc.field_P = new int[eg.field_c];
            da.field_c = new int[eg.field_c];
            mb.field_b = new int[eg.field_c];
            jj.field_E = new byte[eg.field_c][];
            var17.field_h = -7 + param0.length - 8 * eg.field_c;
            nj.field_d = var17.j(17277);
            qk.field_a = var17.j(17277);
            var3 = (255 & var17.a((byte) 114)) - -1;
            var4 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (var4 >= eg.field_c) {
                    break L3;
                  } else {
                    qc.field_P[var4] = var16.j(17277);
                    var4++;
                    if (var15 != 0) {
                      break L2;
                    } else {
                      if (var15 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                if (param1 <= -53) {
                  break L2;
                } else {
                  field_e = 83;
                  break L2;
                }
              }
              var4 = 0;
              L4: while (true) {
                L5: {
                  L6: {
                    if (var4 >= eg.field_c) {
                      break L6;
                    } else {
                      mb.field_b[var4] = var16.j(17277);
                      var4++;
                      if (var15 != 0) {
                        break L5;
                      } else {
                        if (var15 == 0) {
                          continue L4;
                        } else {
                          break L6;
                        }
                      }
                    }
                  }
                  var4 = 0;
                  break L5;
                }
                L7: while (true) {
                  L8: {
                    L9: {
                      if (var4 >= eg.field_c) {
                        break L9;
                      } else {
                        da.field_c[var4] = var16.j(17277);
                        var4++;
                        if (var15 != 0) {
                          break L8;
                        } else {
                          if (var15 == 0) {
                            continue L7;
                          } else {
                            break L9;
                          }
                        }
                      }
                    }
                    var4 = 0;
                    break L8;
                  }
                  L10: while (true) {
                    L11: {
                      L12: {
                        if (var4 >= eg.field_c) {
                          break L12;
                        } else {
                          ra.field_ab[var4] = var16.j(17277);
                          var4++;
                          if (var15 != 0) {
                            break L11;
                          } else {
                            if (var15 == 0) {
                              continue L10;
                            } else {
                              break L12;
                            }
                          }
                        }
                      }
                      var17.field_h = -(3 * (var3 + -1)) + -(8 * eg.field_c) + (-7 + param0.length);
                      fk.field_d = new int[var3];
                      break L11;
                    }
                    var4 = 1;
                    L13: while (true) {
                      L14: {
                        if (var3 <= var4) {
                          var17.field_h = 0;
                          stackOut_30_0 = 0;
                          stackIn_31_0 = stackOut_30_0;
                          break L14;
                        } else {
                          fk.field_d[var4] = var16.c((byte) -121);
                          stackOut_26_0 = fk.field_d[var4];
                          stackIn_31_0 = stackOut_26_0;
                          stackIn_27_0 = stackOut_26_0;
                          if (var15 != 0) {
                            break L14;
                          } else {
                            L15: {
                              if (stackIn_27_0 != 0) {
                                break L15;
                              } else {
                                fk.field_d[var4] = 1;
                                break L15;
                              }
                            }
                            var4++;
                            continue L13;
                          }
                        }
                      }
                      var4 = stackIn_31_0;
                      L16: while (true) {
                        stackOut_32_0 = var4;
                        stackIn_33_0 = stackOut_32_0;
                        L17: while (true) {
                          stackOut_33_0 = stackIn_33_0;
                          stackOut_33_1 = eg.field_c;
                          stackIn_34_0 = stackOut_33_0;
                          stackIn_34_1 = stackOut_33_1;
                          L18: while (true) {
                            L19: {
                              if (stackIn_34_0 >= stackIn_34_1) {
                                break L19;
                              } else {
                                var5 = da.field_c[var4];
                                var6 = ra.field_ab[var4];
                                var7 = var6 * var5;
                                var20 = new byte[var7];
                                var18 = var20;
                                var8 = var18;
                                cb.field_b[var4] = var20;
                                var21 = new byte[var7];
                                var19 = var21;
                                var9 = var19;
                                jj.field_E[var4] = var21;
                                var10 = 0;
                                var11 = var17.a((byte) 114);
                                if (var15 != 0) {
                                  decompiledRegionSelector0 = 1;
                                  break L0;
                                } else {
                                  stackOut_36_0 = -1;
                                  stackOut_36_1 = var11 & 1 ^ -1;
                                  stackIn_38_0 = stackOut_36_0;
                                  stackIn_38_1 = stackOut_36_1;
                                  L20: {
                                    L21: {
                                      L22: {
                                        if (stackIn_38_0 != stackIn_38_1) {
                                          break L22;
                                        } else {
                                          var12 = 0;
                                          L23: while (true) {
                                            if (var12 >= var7) {
                                              if (0 == (2 & var11)) {
                                                break L21;
                                              } else {
                                                var12 = 0;
                                                if (var12 >= var7) {
                                                  if (var15 == 0) {
                                                    break L21;
                                                  } else {
                                                    break L22;
                                                  }
                                                } else {
                                                  dupTemp$1 = var16.k(-108);
                                                  var9[var12] = dupTemp$1;
                                                  var13 = dupTemp$1;
                                                  stackOut_46_0 = var10;
                                                  stackOut_46_1 = var13 ^ -1;
                                                  stackIn_34_0 = stackOut_46_0;
                                                  stackIn_34_1 = stackOut_46_1;
                                                  continue L18;
                                                }
                                              }
                                            } else {
                                              var8[var12] = var16.k(-77);
                                              var12++;
                                              if (var15 != 0) {
                                                break L20;
                                              } else {
                                                continue L23;
                                              }
                                            }
                                          }
                                        }
                                      }
                                      var12 = 0;
                                      L24: while (true) {
                                        L25: {
                                          if (var12 >= var5) {
                                            stackOut_59_0 = 0;
                                            stackIn_60_0 = stackOut_59_0;
                                            break L25;
                                          } else {
                                            stackOut_51_0 = 0;
                                            stackIn_60_0 = stackOut_51_0;
                                            stackIn_52_0 = stackOut_51_0;
                                            if (var15 != 0) {
                                              break L25;
                                            } else {
                                              var13 = stackIn_52_0;
                                              L26: while (true) {
                                                L27: {
                                                  if (var6 <= var13) {
                                                    var12++;
                                                    break L27;
                                                  } else {
                                                    var8[var12 + var5 * var13] = var16.k(34);
                                                    var13++;
                                                    if (var15 != 0) {
                                                      break L27;
                                                    } else {
                                                      continue L26;
                                                    }
                                                  }
                                                }
                                                continue L24;
                                              }
                                            }
                                          }
                                        }
                                        if (stackIn_60_0 == (var11 & 2)) {
                                          break L21;
                                        } else {
                                          var12 = 0;
                                          if (var12 >= var5) {
                                            break L21;
                                          } else {
                                            stackOut_62_0 = 0;
                                            stackIn_33_0 = stackOut_62_0;
                                            continue L17;
                                          }
                                        }
                                      }
                                    }
                                    j.field_d[var4] = var10 != 0;
                                    var4++;
                                    break L20;
                                  }
                                  if (var15 == 0) {
                                    continue L16;
                                  } else {
                                    break L19;
                                  }
                                }
                              }
                            }
                            decompiledRegionSelector0 = 0;
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
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L28: {
            var2 = decompiledCaughtException;
            stackOut_67_0 = (RuntimeException) (var2);
            stackOut_67_1 = new StringBuilder().append("ol.B(");
            stackIn_69_0 = stackOut_67_0;
            stackIn_69_1 = stackOut_67_1;
            stackIn_68_0 = stackOut_67_0;
            stackIn_68_1 = stackOut_67_1;
            if (param0 == null) {
              stackOut_69_0 = (RuntimeException) ((Object) stackIn_69_0);
              stackOut_69_1 = (StringBuilder) ((Object) stackIn_69_1);
              stackOut_69_2 = "null";
              stackIn_70_0 = stackOut_69_0;
              stackIn_70_1 = stackOut_69_1;
              stackIn_70_2 = stackOut_69_2;
              break L28;
            } else {
              stackOut_68_0 = (RuntimeException) ((Object) stackIn_68_0);
              stackOut_68_1 = (StringBuilder) ((Object) stackIn_68_1);
              stackOut_68_2 = "{...}";
              stackIn_70_0 = stackOut_68_0;
              stackIn_70_1 = stackOut_68_1;
              stackIn_70_2 = stackOut_68_2;
              break L28;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_70_0), stackIn_70_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void b(int param0) {
        int dupTemp$4 = 0;
        int dupTemp$5 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = MonkeyPuzzle2.field_F ? 1 : 0;
        int fieldTemp$3 = this.field_c + 1;
        this.field_c = this.field_c + 1;
        this.field_f = this.field_f + fieldTemp$3;
        var2 = param0;
        L0: while (true) {
          L1: {
            if (-257 >= (var2 ^ -1)) {
              break L1;
            } else {
              var3 = this.field_i[var2];
              if (var5 != 0) {
                break L1;
              } else {
                L2: {
                  L3: {
                    if ((var2 & 2) == 0) {
                      break L3;
                    } else {
                      L4: {
                        if (0 != (var2 & 1)) {
                          break L4;
                        } else {
                          this.field_b = this.field_b ^ this.field_b << -316251678;
                          if (var5 == 0) {
                            break L2;
                          } else {
                            break L4;
                          }
                        }
                      }
                      this.field_b = this.field_b ^ this.field_b >>> 200121584;
                      if (var5 == 0) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  L5: {
                    if (-1 != (1 & var2 ^ -1)) {
                      break L5;
                    } else {
                      this.field_b = this.field_b ^ this.field_b << 1363682445;
                      if (var5 == 0) {
                        break L2;
                      } else {
                        break L5;
                      }
                    }
                  }
                  this.field_b = this.field_b ^ this.field_b >>> 1428725478;
                  break L2;
                }
                this.field_b = this.field_b + this.field_i[var2 - -128 & 255];
                dupTemp$4 = this.field_i[ch.a(1020, var3) >> -765259934] + (this.field_b - -this.field_f);
                var4 = dupTemp$4;
                this.field_i[var2] = dupTemp$4;
                dupTemp$5 = var3 + this.field_i[ch.a(var4, 261285) >> 662818120 >> -1828268158];
                this.field_f = dupTemp$5;
                this.field_a[var2] = dupTemp$5;
                var2++;
                if (var5 == 0) {
                  continue L0;
                } else {
                  break L1;
                }
              }
            }
          }
          return;
        }
    }

    ol(int[] param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        int var3 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        var3 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            this.field_a = new int[256];
            this.field_i = new int[256];
            var2_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (param0.length <= var2_int) {
                    break L3;
                  } else {
                    this.field_a[var2_int] = param0[var2_int];
                    var2_int++;
                    if (var3 != 0) {
                      break L2;
                    } else {
                      if (var3 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                this.d(8273);
                break L2;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (runtimeException);
            stackOut_7_1 = new StringBuilder().append("ol.<init>(");
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
              break L4;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L4;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
    }

    final static ad a(int param0, int param1) {
        if (param0 >= -87) {
            field_g = (id) null;
        }
        return em.a(false, param1, false, true, 1, 50);
    }

    static {
        field_h = new na();
        field_e = 256;
    }
}
