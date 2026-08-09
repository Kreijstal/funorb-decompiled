/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class cda extends dg {
    private boolean field_r;
    private boolean field_t;
    private boolean field_q;
    private int field_m;
    private int field_v;
    private int field_s;
    static String field_u;
    private int field_o;
    static volatile int field_p;
    private int field_n;

    public static void n(byte param0) {
        if (param0 < 0) {
            cda.a(-97, true);
            field_u = null;
            return;
        }
        field_u = null;
    }

    cda(int param0, la param1, kh param2) {
        super(param0, param1, param2);
        this.field_r = true;
    }

    final boolean a(boolean param0) {
        if (!param0) {
            this.field_t = true;
            return this.field_q;
        }
        return this.field_q;
    }

    void d(int param0) {
        int stackIn_8_0 = 0;
        int stackIn_16_0 = 0;
        Object stackIn_20_0 = null;
        Object stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        boolean stackIn_24_0 = false;
        boolean stackIn_25_0 = false;
        int stackIn_25_1 = 0;
        Object stackIn_28_0 = null;
        Object stackIn_29_0 = null;
        int stackIn_29_1 = 0;
        int stackIn_37_0 = 0;
        Object stackIn_41_0 = null;
        Object stackIn_42_0 = null;
        int stackIn_42_1 = 0;
        boolean stackIn_45_0 = false;
        boolean stackIn_46_0 = false;
        int stackIn_46_1 = 0;
        Object stackIn_49_0 = null;
        Object stackIn_50_0 = null;
        int stackIn_50_1 = 0;
        int stackIn_55_0 = 0;
        int stackIn_59_0 = 0;
        Object stackIn_63_0 = null;
        Object stackIn_64_0 = null;
        int stackIn_64_1 = 0;
        boolean stackIn_67_0 = false;
        boolean stackIn_68_0 = false;
        int stackIn_68_1 = 0;
        Object stackIn_71_0 = null;
        Object stackIn_72_0 = null;
        int stackIn_72_1 = 0;
        int stackIn_79_0 = 0;
        Object stackIn_83_0 = null;
        Object stackIn_84_0 = null;
        int stackIn_84_1 = 0;
        boolean stackIn_87_0 = false;
        boolean stackIn_88_0 = false;
        int stackIn_88_1 = 0;
        Object stackIn_91_0 = null;
        Object stackIn_92_0 = null;
        int stackIn_92_1 = 0;
        int stackIn_99_0 = 0;
        Object stackIn_103_0 = null;
        Object stackIn_104_0 = null;
        int stackIn_104_1 = 0;
        boolean stackIn_107_0 = false;
        boolean stackIn_108_0 = false;
        int stackIn_108_1 = 0;
        Object stackIn_111_0 = null;
        Object stackIn_112_0 = null;
        int stackIn_112_1 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        fsa var7;
        int var8;
        L0: {
          var8 = TombRacer.field_G ? 1 : 0;
          super.d(param0);
          var2 = 0;
          var3 = 0;
          var4 = 0;
          var5 = 0;
          var6 = 0;
          if (!(this.field_h instanceof fsa)) {
            var4 = this.field_h.d(3);
            var5 = this.field_h.e(9648);
            var6 = this.field_h.g(-25787);
            break L0;
          } else {
            var7 = (fsa) ((Object) this.field_h);
            var4 = var7.s(25745);
            var5 = var7.e(false);
            var6 = var7.q((byte) -80);
            break L0;
          }
        }
        if (!this.field_r) {
          L1: {
            if (this.field_m == var6) {
              stackIn_8_0 = 0;
              break L1;
            } else {
              stackIn_8_0 = 1;
              break L1;
            }
          }
          L2: {
            var3 = stackIn_8_0;
            if (this.field_s == var4) {
              if (var5 != this.field_v) {
                var2 = 1;
                this.field_o = dfa.a(-this.field_m + var6, 8192, -60);
                if (-4097 <= (this.field_o ^ -1)) {
                  L3: {
                    this.field_m = var6;
                    if (var3 != 0) {
                      stackIn_37_0 = 0;
                      break L3;
                    } else {
                      stackIn_37_0 = 1;
                      break L3;
                    }
                  }
                  L4: {
                    if (stackIn_37_0 == (this.field_t ? 1 : 0)) {
                      L5: {
                        stackIn_41_0 = this;

                        if (var3 == 0) {
                          stackIn_42_0 = this;
                          stackIn_42_1 = 0;
                          break L5;
                        } else {
                          stackIn_42_0 = this;
                          stackIn_42_1 = 1;
                          break L5;
                        }
                      }
                      ((cda) (this)).field_t = stackIn_42_1 != 0;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  L6: {
                    stackIn_45_0 = this.field_q;

                    if (var2 != 0) {
                      stackIn_46_0 = stackIn_45_0;
                      stackIn_46_1 = 0;
                      break L6;
                    } else {
                      stackIn_46_0 = stackIn_45_0;
                      stackIn_46_1 = 1;
                      break L6;
                    }
                  }
                  if ((stackIn_46_0 ? 1 : 0) != stackIn_46_1) {
                    this.field_n = this.field_n + 1;
                    this.field_s = var4;
                    this.field_v = var5;
                    return;
                  } else {
                    L7: {
                      stackIn_49_0 = this;

                      if (var2 == 0) {
                        stackIn_50_0 = this;
                        stackIn_50_1 = 0;
                        break L7;
                      } else {
                        stackIn_50_0 = this;
                        stackIn_50_1 = 1;
                        break L7;
                      }
                    }
                    ((cda) (this)).field_q = stackIn_50_1 != 0;
                    this.field_n = 1;
                    this.field_s = var4;
                    this.field_v = var5;
                    return;
                  }
                } else {
                  L8: {
                    this.field_o = -this.field_o + 8192;
                    this.field_m = var6;
                    if (var3 != 0) {
                      stackIn_16_0 = 0;
                      break L8;
                    } else {
                      stackIn_16_0 = 1;
                      break L8;
                    }
                  }
                  L9: {
                    if (stackIn_16_0 == (this.field_t ? 1 : 0)) {
                      L10: {
                        stackIn_20_0 = this;

                        if (var3 == 0) {
                          stackIn_21_0 = this;
                          stackIn_21_1 = 0;
                          break L10;
                        } else {
                          stackIn_21_0 = this;
                          stackIn_21_1 = 1;
                          break L10;
                        }
                      }
                      ((cda) (this)).field_t = stackIn_21_1 != 0;
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                  L11: {
                    stackIn_24_0 = this.field_q;

                    if (var2 != 0) {
                      stackIn_25_0 = stackIn_24_0;
                      stackIn_25_1 = 0;
                      break L11;
                    } else {
                      stackIn_25_0 = stackIn_24_0;
                      stackIn_25_1 = 1;
                      break L11;
                    }
                  }
                  L12: {
                    if ((stackIn_25_0 ? 1 : 0) != stackIn_25_1) {
                      this.field_n = this.field_n + 1;
                      this.field_s = var4;
                      this.field_v = var5;
                      break L12;
                    } else {
                      L13: {
                        stackIn_28_0 = this;

                        if (var2 == 0) {
                          stackIn_29_0 = this;
                          stackIn_29_1 = 0;
                          break L13;
                        } else {
                          stackIn_29_0 = this;
                          stackIn_29_1 = 1;
                          break L13;
                        }
                      }
                      ((cda) (this)).field_q = stackIn_29_1 != 0;
                      this.field_n = 1;
                      this.field_s = var4;
                      this.field_v = var5;
                      break L12;
                    }
                  }
                  return;
                }
              } else {
                stackIn_55_0 = 0;
                break L2;
              }
            } else {
              stackIn_55_0 = 1;
              break L2;
            }
          }
          var2 = stackIn_55_0;
          this.field_o = dfa.a(-this.field_m + var6, 8192, -60);
          if (-4097 > (this.field_o ^ -1)) {
            L14: {
              this.field_o = -this.field_o + 8192;
              this.field_m = var6;
              if (var3 != 0) {
                stackIn_79_0 = 0;
                break L14;
              } else {
                stackIn_79_0 = 1;
                break L14;
              }
            }
            L15: {
              if (stackIn_79_0 == (this.field_t ? 1 : 0)) {
                L16: {
                  stackIn_83_0 = this;

                  if (var3 == 0) {
                    stackIn_84_0 = this;
                    stackIn_84_1 = 0;
                    break L16;
                  } else {
                    stackIn_84_0 = this;
                    stackIn_84_1 = 1;
                    break L16;
                  }
                }
                ((cda) (this)).field_t = stackIn_84_1 != 0;
                break L15;
              } else {
                break L15;
              }
            }
            L17: {
              stackIn_87_0 = this.field_q;

              if (var2 != 0) {
                stackIn_88_0 = stackIn_87_0;
                stackIn_88_1 = 0;
                break L17;
              } else {
                stackIn_88_0 = stackIn_87_0;
                stackIn_88_1 = 1;
                break L17;
              }
            }
            if ((stackIn_88_0 ? 1 : 0) != stackIn_88_1) {
              this.field_n = this.field_n + 1;
              this.field_s = var4;
              this.field_v = var5;
              return;
            } else {
              L18: {
                stackIn_91_0 = this;

                if (var2 == 0) {
                  stackIn_92_0 = this;
                  stackIn_92_1 = 0;
                  break L18;
                } else {
                  stackIn_92_0 = this;
                  stackIn_92_1 = 1;
                  break L18;
                }
              }
              ((cda) (this)).field_q = stackIn_92_1 != 0;
              this.field_n = 1;
              this.field_s = var4;
              this.field_v = var5;
              return;
            }
          } else {
            L19: {
              this.field_m = var6;
              if (var3 != 0) {
                stackIn_59_0 = 0;
                break L19;
              } else {
                stackIn_59_0 = 1;
                break L19;
              }
            }
            L20: {
              if (stackIn_59_0 == (this.field_t ? 1 : 0)) {
                L21: {
                  stackIn_63_0 = this;

                  if (var3 == 0) {
                    stackIn_64_0 = this;
                    stackIn_64_1 = 0;
                    break L21;
                  } else {
                    stackIn_64_0 = this;
                    stackIn_64_1 = 1;
                    break L21;
                  }
                }
                ((cda) (this)).field_t = stackIn_64_1 != 0;
                break L20;
              } else {
                break L20;
              }
            }
            L22: {
              stackIn_67_0 = this.field_q;

              if (var2 != 0) {
                stackIn_68_0 = stackIn_67_0;
                stackIn_68_1 = 0;
                break L22;
              } else {
                stackIn_68_0 = stackIn_67_0;
                stackIn_68_1 = 1;
                break L22;
              }
            }
            if ((stackIn_68_0 ? 1 : 0) != stackIn_68_1) {
              this.field_n = this.field_n + 1;
              this.field_s = var4;
              this.field_v = var5;
              return;
            } else {
              L23: {
                stackIn_71_0 = this;

                if (var2 == 0) {
                  stackIn_72_0 = this;
                  stackIn_72_1 = 0;
                  break L23;
                } else {
                  stackIn_72_0 = this;
                  stackIn_72_1 = 1;
                  break L23;
                }
              }
              ((cda) (this)).field_q = stackIn_72_1 != 0;
              this.field_n = 1;
              this.field_s = var4;
              this.field_v = var5;
              return;
            }
          }
        } else {
          this.field_t = false;
          this.field_n = 1;
          this.field_r = false;
          this.field_o = 0;
          this.field_q = false;
          L24: {
            this.field_m = var6;
            if (var3 != 0) {
              stackIn_99_0 = 0;
              break L24;
            } else {
              stackIn_99_0 = 1;
              break L24;
            }
          }
          L25: {
            if (stackIn_99_0 == (this.field_t ? 1 : 0)) {
              L26: {
                stackIn_103_0 = this;

                if (var3 == 0) {
                  stackIn_104_0 = this;
                  stackIn_104_1 = 0;
                  break L26;
                } else {
                  stackIn_104_0 = this;
                  stackIn_104_1 = 1;
                  break L26;
                }
              }
              ((cda) (this)).field_t = stackIn_104_1 != 0;
              break L25;
            } else {
              break L25;
            }
          }
          L27: {
            stackIn_107_0 = this.field_q;

            if (var2 != 0) {
              stackIn_108_0 = stackIn_107_0;
              stackIn_108_1 = 0;
              break L27;
            } else {
              stackIn_108_0 = stackIn_107_0;
              stackIn_108_1 = 1;
              break L27;
            }
          }
          if ((stackIn_108_0 ? 1 : 0) != stackIn_108_1) {
            this.field_n = this.field_n + 1;
            this.field_s = var4;
            this.field_v = var5;
            return;
          } else {
            L28: {
              stackIn_111_0 = this;

              if (var2 == 0) {
                stackIn_112_0 = this;
                stackIn_112_1 = 0;
                break L28;
              } else {
                stackIn_112_0 = this;
                stackIn_112_1 = 1;
                break L28;
              }
            }
            ((cda) (this)).field_q = stackIn_112_1 != 0;
            this.field_n = 1;
            this.field_s = var4;
            this.field_v = var5;
            return;
          }
        }
    }

    final static void a(int param0, boolean param1) {
        ira.a(param1, hb.field_t.field_d, (byte) -100);
        if (param0 != 0) {
            cda.a(50, false);
        }
    }

    cda(int param0) {
        super(param0);
        this.field_r = true;
    }

    final int b(boolean param0) {
        if (param0) {
            this.field_r = false;
            return this.field_n;
        }
        return this.field_n;
    }

    static {
        field_p = 0;
        field_u = "Encouraging rule breaking";
    }
}
