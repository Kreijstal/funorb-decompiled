/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tl {
    static ng field_h;
    int field_b;
    static float field_g;
    int field_f;
    int field_a;
    private int field_d;
    private int field_e;
    int field_c;

    final static void a(boolean param0, ng param1) {
        kd var2 = null;
        RuntimeException var2_ref = null;
        kd var3 = null;
        int var4 = 0;
        ng var5 = null;
        kd stackIn_3_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            var2 = param1.field_b;
            L1: while (true) {
              var3 = var2.field_f;
              var2.field_c = var3;
              var2 = var3;
              stackIn_3_0 = (kd) (var2);
              L2: while (true) {
                if (stackIn_3_0 != param1.field_b) {
                  continue L1;
                } else {
                  stackIn_3_0 = param1.field_b;

                  if (var4 != 0) {
                    continue L2;
                  } else {
                    var2 = stackIn_3_0;
                    L3: while (true) {
                      var3 = var2.field_c;
                      var3.field_f = var2;
                      var2 = var3;
                      L4: while (true) {
                        if (param1.field_b != var2) {
                          continue L3;
                        } else {
                          if (var4 != 0) {
                            continue L4;
                          } else {
                            if (!param0) {
                              break L0;
                            } else {
                              var5 = (ng) null;
                              tl.a(true, (ng) null);
                              return;
                            }
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
          L5: {
            var2_ref = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var2_ref);

            stackIn_14_1 = new StringBuilder().append("tl.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L5;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L5;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
    }

    public static void a(int param0) {
        field_h = null;
        if (param0 != 3) {
            ng var2 = (ng) null;
            tl.a(false, (ng) null);
        }
    }

    final int a(byte param0, int param1) {
        int stackIn_6_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_36_0 = 0;
        int var3;
        int var4;
        var4 = Lexicominos.field_L ? 1 : 0;
        if (this.field_e != rf.a(param1, 47)) {
          L0: {
            this.field_e = rf.a(param1, 47);
            this.field_d = 1;
            if (20 < this.field_d) {
              stackIn_6_0 = 3;
              break L0;
            } else {
              stackIn_6_0 = 1;
              break L0;
            }
          }
          L1: {
            L2: {
              var3 = stackIn_6_0 * param1;
              if (var3 > this.field_f / tg.field_j) {
                break L2;
              } else {
                if (var3 < -this.field_f / tg.field_j) {
                  var3 = -this.field_f / tg.field_j;
                  if (var4 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                } else {
                  if (param0 > 100) {
                    return var3;
                  } else {
                    this.field_e = -94;
                    return var3;
                  }
                }
              }
            }
            var3 = this.field_f / tg.field_j;
            break L1;
          }
          if (param0 <= 100) {
            this.field_e = -94;
            return var3;
          } else {
            return var3;
          }
        } else {
          this.field_d = this.field_d + 1;
          if (var4 == 0) {
            L3: {
              if (20 < this.field_d) {
                stackIn_36_0 = 3;
                break L3;
              } else {
                stackIn_36_0 = 1;
                break L3;
              }
            }
            L4: {
              L5: {
                var3 = stackIn_36_0 * param1;
                if (var3 > this.field_f / tg.field_j) {
                  break L5;
                } else {
                  if (var3 < -this.field_f / tg.field_j) {
                    var3 = -this.field_f / tg.field_j;
                    if (var4 == 0) {
                      break L4;
                    } else {
                      break L5;
                    }
                  } else {
                    if (param0 <= 100) {
                      this.field_e = -94;
                      return var3;
                    } else {
                      return var3;
                    }
                  }
                }
              }
              var3 = this.field_f / tg.field_j;
              break L4;
            }
            if (param0 <= 100) {
              this.field_e = -94;
              return var3;
            } else {
              return var3;
            }
          } else {
            L6: {
              this.field_e = rf.a(param1, 47);
              this.field_d = 1;
              if (20 < this.field_d) {
                stackIn_21_0 = 3;
                break L6;
              } else {
                stackIn_21_0 = 1;
                break L6;
              }
            }
            L7: {
              L8: {
                var3 = stackIn_21_0 * param1;
                if (var3 > this.field_f / tg.field_j) {
                  break L8;
                } else {
                  if (var3 < -this.field_f / tg.field_j) {
                    var3 = -this.field_f / tg.field_j;
                    if (var4 == 0) {
                      break L7;
                    } else {
                      break L8;
                    }
                  } else {
                    if (param0 <= 100) {
                      this.field_e = -94;
                      return var3;
                    } else {
                      return var3;
                    }
                  }
                }
              }
              var3 = this.field_f / tg.field_j;
              break L7;
            }
            if (param0 <= 100) {
              this.field_e = -94;
              return var3;
            } else {
              return var3;
            }
          }
        }
    }

    final int a(byte param0) {
        if (param0 != -123) {
            return -123;
        }
        return this.field_c * this.field_b / this.field_f;
    }

    tl(int param0, int param1) {
        this.field_f = param0;
        this.field_b = param1;
    }

    static {
        field_h = new ng();
    }
}
