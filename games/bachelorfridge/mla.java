/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mla {
    int field_d;
    int field_c;
    static kv[] field_b;
    int[] field_a;

    final int a(int param0, int param1) {
        int var3;
        int var4;
        L0: {
          var4 = BachelorFridge.field_y;
          if (this.field_a == null) {
            break L0;
          } else {
            if (this.field_a.length == 0) {
              break L0;
            } else {
              var3 = 1;
              L1: while (true) {
                if (var3 >= this.field_a.length) {
                  L2: {
                    if (param1 == 0) {
                      break L2;
                    } else {
                      mla.a((byte) 105);
                      break L2;
                    }
                  }
                  return -1 + this.field_a.length;
                } else {
                  if ((this.field_a[var3 + -1] + this.field_a[var3] >> -2108971231 ^ -1) >= (param0 ^ -1)) {
                    var3++;
                    continue L1;
                  } else {
                    return -1 + var3;
                  }
                }
              }
            }
          }
        }
        return 0;
    }

    final int a(int param0) {
        int stackIn_6_0 = 0;
        if (param0 == 0) {
          L0: {
            L1: {
              if (null == this.field_a) {
                break L1;
              } else {
                if (0 == this.field_a.length) {
                  break L1;
                } else {
                  stackIn_6_0 = this.field_a[this.field_a.length - 1];
                  break L0;
                }
              }
            }
            stackIn_6_0 = 0;
            break L0;
          }
          return stackIn_6_0;
        } else {
          return 72;
        }
    }

    final static void b(byte param0) {
        RuntimeException decompiledCaughtException = null;
        ema var1 = null;
        uha var1_ref = null;
        RuntimeException var1_ref2 = null;
        int var2 = 0;
        int var3 = 0;
        var3 = BachelorFridge.field_y;
        try {
          L0: {
            var1 = (ema) ((Object) aa.field_l.b((byte) 90));
            L1: while (true) {
              if (var1 == null) {
                var1_ref = (uha) ((Object) uma.field_M.b((byte) 90));
                L2: while (true) {
                  if (var1_ref == null) {
                    var1 = (ema) ((Object) bia.field_g.b((byte) 90));
                    L3: while (true) {
                      if (var1 == null) {
                        var2 = -100 % ((param0 - -66) / 37);
                        break L0;
                      } else {
                        if ((var1.field_Mb ^ -1) < -1) {
                          L4: {
                            var1.field_Mb = var1.field_Mb - 1;
                            if (0 != var1.field_Mb) {
                              break L4;
                            } else {
                              var1.field_yb = 0;
                              if (var1.f((byte) 21)) {
                                var1.a(false);
                                break L4;
                              } else {
                                break L4;
                              }
                            }
                          }
                          var1 = (ema) ((Object) bia.field_g.c(0));
                          continue L3;
                        } else {
                          var1 = (ema) ((Object) bia.field_g.c(0));
                          continue L3;
                        }
                      }
                    }
                  } else {
                    L5: {
                      if (-1 > (var1_ref.field_Mb ^ -1)) {
                        var1_ref.field_Mb = var1_ref.field_Mb - 1;
                        if (-1 == (var1_ref.field_Mb ^ -1)) {
                          var1_ref.field_ec = 0;
                          if (var1_ref.f(26)) {
                            var1_ref.a(false);
                            break L5;
                          } else {
                            break L5;
                          }
                        } else {
                          break L5;
                        }
                      } else {
                        break L5;
                      }
                    }
                    var1_ref = (uha) ((Object) uma.field_M.c(0));
                    continue L2;
                  }
                }
              } else {
                L6: {
                  if (0 < var1.field_Mb) {
                    var1.field_Mb = var1.field_Mb - 1;
                    if (var1.field_Mb != 0) {
                      break L6;
                    } else {
                      var1.field_yb = 0;
                      if (!var1.f((byte) 21)) {
                        break L6;
                      } else {
                        var1.a(false);
                        break L6;
                      }
                    }
                  } else {
                    break L6;
                  }
                }
                var1 = (ema) ((Object) aa.field_l.c(0));
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref2 = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var1_ref2), "mla.D(" + param0 + ')');
        }
    }

    public static void a(byte param0) {
        field_b = null;
        if (param0 < 52) {
            mla.a((byte) -89);
        }
    }

    mla(int param0, int param1, int param2) {
        this.field_d = param1;
        this.field_c = param0;
        this.field_a = new int[1 + param2];
    }

    static {
    }
}
