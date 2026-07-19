/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class af {
    static fta field_g;
    private od field_c;
    private int field_e;
    private od[] field_d;
    private long field_h;
    static cn field_b;
    private od field_a;
    private int field_f;

    final static dh[] a(int param0, fia param1) {
        RuntimeException var2 = null;
        int[] var3 = null;
        dh[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        dh var7 = null;
        int var8 = 0;
        naa var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        dh[] stackIn_3_0 = null;
        dh[] stackIn_11_0 = null;
        dh[] stackIn_15_0 = null;
        dh[] stackIn_18_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        dh[] stackOut_10_0 = null;
        dh[] stackOut_14_0 = null;
        dh[] stackOut_17_0 = null;
        dh[] stackOut_2_0 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var8 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (param1.a((byte) 69)) {
              var9 = param1.a(-111);
              L1: while (true) {
                L2: {
                  L3: {
                    if (-1 != (var9.field_b ^ -1)) {
                      break L3;
                    } else {
                      vja.a(0, 10L);
                      if (var8 != 0) {
                        break L2;
                      } else {
                        if (var8 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  if (2 != var9.field_b) {
                    break L2;
                  } else {
                    stackOut_10_0 = new dh[]{};
                    stackIn_11_0 = stackOut_10_0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
                var11 = (int[]) (var9.field_f);
                var10 = var11;
                var3 = var10;
                var4 = new dh[var11.length >> -525539166];
                var6 = 63 / ((param0 - 0) / 46);
                var5 = 0;
                L4: while (true) {
                  L5: {
                    L6: {
                      if (var4.length <= var5) {
                        break L6;
                      } else {
                        var7 = new dh();
                        stackOut_14_0 = (dh[]) (var4);
                        stackIn_18_0 = stackOut_14_0;
                        stackIn_15_0 = stackOut_14_0;
                        if (var8 != 0) {
                          break L5;
                        } else {
                          stackIn_15_0[var5] = var7;
                          var7.field_a = var3[var5 << 955207010];
                          var7.field_c = var3[1 + (var5 << 485852130)];
                          var7.field_d = var3[2 + (var5 << 275939202)];
                          var7.field_b = var3[(var5 << -1059328670) - -3];
                          var5++;
                          if (var8 == 0) {
                            continue L4;
                          } else {
                            break L6;
                          }
                        }
                      }
                    }
                    stackOut_17_0 = (dh[]) (var4);
                    stackIn_18_0 = stackOut_17_0;
                    break L5;
                  }
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            } else {
              stackOut_2_0 = new dh[]{};
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) (var2);
            stackOut_19_1 = new StringBuilder().append("af.D(").append(param0).append(',');
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param1 == null) {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L7;
            } else {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L7;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_11_0;
          } else {
            return stackIn_18_0;
          }
        }
    }

    final void a(int param0, od param1, long param2) {
        od var5 = null;
        try {
            if (param1.field_f != null) {
                param1.c(-7975);
            }
            var5 = this.field_d[(int)((long)(param0 + this.field_e) & param2)];
            param1.field_f = var5.field_f;
            param1.field_g = var5;
            param1.field_f.field_g = param1;
            param1.field_j = param2;
            param1.field_g.field_f = param1;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "af.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    public static void a(int param0) {
        if (param0 <= 72) {
            af.a(-28);
            field_g = null;
            field_b = null;
            return;
        }
        field_g = null;
        field_b = null;
    }

    final od a(byte param0) {
        int fieldTemp$4 = 0;
        int fieldTemp$5 = 0;
        int fieldTemp$6 = 0;
        int fieldTemp$7 = 0;
        int var3 = 0;
        od var4 = null;
        od var5 = null;
        od var18 = null;
        od var38 = null;
        od var39 = null;
        od var40 = null;
        var3 = TombRacer.field_G ? 1 : 0;
        if (this.field_f <= 0) {
          if (param0 != -112) {
            this.a(55, (od) null, 93L);
            L0: while (true) {
              if (this.field_f < this.field_e) {
                fieldTemp$4 = this.field_f;
                this.field_f = this.field_f + 1;
                var4 = this.field_d[fieldTemp$4].field_g;
                var40 = var4;
                if (var4 == this.field_d[this.field_f + -1]) {
                  if (var3 == 0) {
                    continue L0;
                  } else {
                    return null;
                  }
                } else {
                  this.field_a = var40.field_g;
                  return var40;
                }
              } else {
                return null;
              }
            }
          } else {
            L1: while (true) {
              if (this.field_f < this.field_e) {
                fieldTemp$5 = this.field_f;
                this.field_f = this.field_f + 1;
                var4 = this.field_d[fieldTemp$5].field_g;
                var39 = var4;
                if (var4 == this.field_d[this.field_f + -1]) {
                  if (var3 == 0) {
                    continue L1;
                  } else {
                    return null;
                  }
                } else {
                  this.field_a = var39.field_g;
                  return var39;
                }
              } else {
                return null;
              }
            }
          }
        } else {
          if (this.field_a == this.field_d[-1 + this.field_f]) {
            if (param0 != -112) {
              this.a(55, (od) null, 93L);
              L2: while (true) {
                if (this.field_f < this.field_e) {
                  fieldTemp$6 = this.field_f;
                  this.field_f = this.field_f + 1;
                  var4 = this.field_d[fieldTemp$6].field_g;
                  var18 = var4;
                  if (var4 == this.field_d[this.field_f + -1]) {
                    if (var3 == 0) {
                      continue L2;
                    } else {
                      return null;
                    }
                  } else {
                    this.field_a = var18.field_g;
                    return var18;
                  }
                } else {
                  return null;
                }
              }
            } else {
              L3: while (true) {
                if (this.field_f < this.field_e) {
                  fieldTemp$7 = this.field_f;
                  this.field_f = this.field_f + 1;
                  var4 = this.field_d[fieldTemp$7].field_g;
                  var5 = var4;
                  if (var4 == this.field_d[this.field_f + -1]) {
                    if (var3 == 0) {
                      continue L3;
                    } else {
                      return null;
                    }
                  } else {
                    this.field_a = var5.field_g;
                    return var5;
                  }
                } else {
                  return null;
                }
              }
            }
          } else {
            var38 = this.field_a;
            this.field_a = var38.field_g;
            return var38;
          }
        }
    }

    final od b(int param0) {
        int var2 = -55 % ((-40 - param0) / 47);
        this.field_f = 0;
        return this.a((byte) -112);
    }

    final od a(int param0, long param1) {
        od var4 = null;
        od var5 = null;
        int var6 = 0;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        Object stackIn_15_0 = null;
        Object stackIn_16_0 = null;
        Object stackOut_5_0 = null;
        Object stackOut_14_0 = null;
        var6 = TombRacer.field_G ? 1 : 0;
        if (param0 <= -104) {
          this.field_h = param1;
          var4 = this.field_d[(int)(param1 & (long)(-1 + this.field_e))];
          this.field_c = var4.field_g;
          L0: while (true) {
            if (this.field_c != var4) {
              stackOut_5_0 = this;
              stackIn_7_0 = stackOut_5_0;
              stackIn_6_0 = stackOut_5_0;
              if (var6 == 0) {
                if (((af) (this)).field_c.field_j != param1) {
                  this.field_c = this.field_c.field_g;
                  continue L0;
                } else {
                  var5 = this.field_c;
                  this.field_c = this.field_c.field_g;
                  return var5;
                }
              } else {
                ((af) (this)).field_c = null;
                return null;
              }
            } else {
              this.field_c = null;
              return null;
            }
          }
        } else {
          this.field_f = 105;
          this.field_h = param1;
          var4 = this.field_d[(int)(param1 & (long)(-1 + this.field_e))];
          this.field_c = var4.field_g;
          L1: while (true) {
            if (this.field_c != var4) {
              stackOut_14_0 = this;
              stackIn_16_0 = stackOut_14_0;
              stackIn_15_0 = stackOut_14_0;
              if (var6 == 0) {
                if (((af) (this)).field_c.field_j != param1) {
                  this.field_c = this.field_c.field_g;
                  continue L1;
                } else {
                  var5 = this.field_c;
                  this.field_c = this.field_c.field_g;
                  return var5;
                }
              } else {
                ((af) (this)).field_c = null;
                return null;
              }
            } else {
              this.field_c = null;
              return null;
            }
          }
        }
    }

    final od b(byte param0) {
        od var2 = null;
        od var3 = null;
        int var4 = 0;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        Object stackOut_7_0 = null;
        var4 = TombRacer.field_G ? 1 : 0;
        if (param0 > 13) {
          if (null != this.field_c) {
            var2 = this.field_d[(int)(this.field_h & (long)(-1 + this.field_e))];
            L0: while (true) {
              if (var2 != this.field_c) {
                stackOut_7_0 = this;
                stackIn_9_0 = stackOut_7_0;
                stackIn_8_0 = stackOut_7_0;
                if (var4 == 0) {
                  if ((((af) (this)).field_c.field_j ^ -1L) == (this.field_h ^ -1L)) {
                    var3 = this.field_c;
                    this.field_c = this.field_c.field_g;
                    return var3;
                  } else {
                    this.field_c = this.field_c.field_g;
                    continue L0;
                  }
                } else {
                  ((af) (this)).field_c = null;
                  return null;
                }
              } else {
                this.field_c = null;
                return null;
              }
            }
          } else {
            return null;
          }
        } else {
          return (od) null;
        }
    }

    af(int param0) {
        od dupTemp$2 = null;
        int var2 = 0;
        od var3 = null;
        int var4 = 0;
        var4 = TombRacer.field_G ? 1 : 0;
        this.field_f = 0;
        this.field_e = param0;
        this.field_d = new od[param0];
        var2 = 0;
        L0: while (true) {
          if (var2 < param0) {
            dupTemp$2 = new od();
            var3 = dupTemp$2;
            this.field_d[var2] = dupTemp$2;
            var3.field_f = var3;
            var3.field_g = var3;
            var2++;
            if (var4 == 0) {
              continue L0;
            } else {
              return;
            }
          } else {
            return;
          }
        }
    }

    static {
        field_g = new fta();
    }
}
