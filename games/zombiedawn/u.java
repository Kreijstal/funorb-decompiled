/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class u {
    private int field_m;
    static int[] field_d;
    boolean field_k;
    private vn[] field_i;
    int field_l;
    private int field_n;
    private int field_g;
    int field_b;
    static sn field_e;
    private boolean field_c;
    int field_a;
    int field_h;
    private int field_j;
    static String field_f;

    private final void a(byte param0) {
        int var3;
        var3 = ZombieDawn.field_J;
        this.field_h = 4;
        if (param0 > 71) {
          if (-3 != (this.field_b ^ -1)) {
            if (this.field_b != 1) {
              if (this.field_b == 0) {
                this.field_a = pb.a(so.field_a, 20, 1) + 87 << -1579156284;
                return;
              } else {
                return;
              }
            } else {
              this.field_a = pb.a(so.field_a, 50, 1) + 90 << 1791320196;
              return;
            }
          } else {
            this.field_a = 130 - -pb.a(so.field_a, 77, 1) << -712500412;
            return;
          }
        } else {
          this.field_m = -75;
          if (-3 != (this.field_b ^ -1)) {
            if (this.field_b != 1) {
              if (this.field_b != 0) {
                return;
              } else {
                this.field_a = pb.a(so.field_a, 20, 1) + 87 << -1579156284;
                return;
              }
            } else {
              this.field_a = pb.a(so.field_a, 50, 1) + 90 << 1791320196;
              return;
            }
          } else {
            this.field_a = 130 - -pb.a(so.field_a, 77, 1) << -712500412;
            return;
          }
        }
    }

    final void d(int param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        int fieldTemp$4 = 0;
        int fieldTemp$5 = 0;
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        Object stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        int stackIn_11_2 = 0;
        Object stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        Object stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        int stackIn_19_2 = 0;
        Object stackIn_27_0 = null;
        int stackIn_27_1 = 0;
        Object stackIn_28_0 = null;
        int stackIn_28_1 = 0;
        int stackIn_28_2 = 0;
        Object stackIn_37_0 = null;
        int stackIn_37_1 = 0;
        Object stackIn_38_0 = null;
        int stackIn_38_1 = 0;
        int stackIn_38_2 = 0;
        Object stackIn_46_0 = null;
        int stackIn_46_1 = 0;
        Object stackIn_47_0 = null;
        int stackIn_47_1 = 0;
        int stackIn_47_2 = 0;
        Object stackIn_54_0 = null;
        int stackIn_54_1 = 0;
        Object stackIn_55_0 = null;
        int stackIn_55_1 = 0;
        int stackIn_55_2 = 0;
        Object stackIn_62_0 = null;
        int stackIn_62_1 = 0;
        Object stackIn_63_0 = null;
        int stackIn_63_1 = 0;
        int stackIn_63_2 = 0;
        int var3;
        L0: {
          var3 = ZombieDawn.field_J;
          fieldTemp$0 = this.field_g;
          this.field_g = this.field_g + 1;
          if (30 > fieldTemp$0) {
            break L0;
          } else {
            this.field_g = 0;
            fieldTemp$1 = this.field_n + 1;
            this.field_n = this.field_n + 1;
            if (-4 > (fieldTemp$1 ^ -1)) {
              this.field_n = 0;
              break L0;
            } else {
              if (param0 == this.field_b) {
                this.field_n = 0;
                if (this.field_k) {
                  fieldTemp$2 = this.field_m;
                  this.field_m = this.field_m - 1;
                  if (0 < fieldTemp$2) {
                    if (!this.a(param0 + -93)) {
                      L1: {
                        stackIn_27_0 = this;

                        stackIn_27_1 = this.field_l;

                        if (this.field_l < this.field_a) {
                          stackIn_28_0 = this;
                          stackIn_28_1 = stackIn_27_1;
                          stackIn_28_2 = this.field_h;
                          break L1;
                        } else {
                          stackIn_28_0 = this;
                          stackIn_28_1 = stackIn_27_1;
                          stackIn_28_2 = -this.field_h;
                          break L1;
                        }
                      }
                      ((u) (this)).field_l = stackIn_28_1 + stackIn_28_2;
                      return;
                    } else {
                      this.field_k = true;
                      this.field_m = pb.a(so.field_a, 20, 1);
                      return;
                    }
                  } else {
                    this.field_k = false;
                    this.a((byte) 126);
                    return;
                  }
                } else {
                  if (!this.a(param0 + -93)) {
                    L2: {
                      stackIn_18_0 = this;

                      stackIn_18_1 = this.field_l;

                      if (this.field_l < this.field_a) {
                        stackIn_19_0 = this;
                        stackIn_19_1 = stackIn_18_1;
                        stackIn_19_2 = this.field_h;
                        break L2;
                      } else {
                        stackIn_19_0 = this;
                        stackIn_19_1 = stackIn_18_1;
                        stackIn_19_2 = -this.field_h;
                        break L2;
                      }
                    }
                    ((u) (this)).field_l = stackIn_19_1 + stackIn_19_2;
                    return;
                  } else {
                    this.field_k = true;
                    this.field_m = pb.a(so.field_a, 20, 1);
                    return;
                  }
                }
              } else {
                L3: {
                  if (!this.field_k) {
                    break L3;
                  } else {
                    fieldTemp$3 = this.field_m;
                    this.field_m = this.field_m - 1;
                    if (0 < fieldTemp$3) {
                      break L3;
                    } else {
                      this.field_k = false;
                      this.a((byte) 126);
                      return;
                    }
                  }
                }
                if (!this.a(param0 + -93)) {
                  L4: {
                    stackIn_10_0 = this;

                    stackIn_10_1 = this.field_l;

                    if (this.field_l < this.field_a) {
                      stackIn_11_0 = this;
                      stackIn_11_1 = stackIn_10_1;
                      stackIn_11_2 = this.field_h;
                      break L4;
                    } else {
                      stackIn_11_0 = this;
                      stackIn_11_1 = stackIn_10_1;
                      stackIn_11_2 = -this.field_h;
                      break L4;
                    }
                  }
                  ((u) (this)).field_l = stackIn_11_1 + stackIn_11_2;
                  return;
                } else {
                  this.field_k = true;
                  this.field_m = pb.a(so.field_a, 20, 1);
                  return;
                }
              }
            }
          }
        }
        if (param0 != this.field_b) {
          if (this.field_k) {
            fieldTemp$4 = this.field_m;
            this.field_m = this.field_m - 1;
            if (0 < fieldTemp$4) {
              if (this.a(param0 + -93)) {
                this.field_k = true;
                this.field_m = pb.a(so.field_a, 20, 1);
                return;
              } else {
                L5: {
                  stackIn_62_0 = this;

                  stackIn_62_1 = this.field_l;

                  if (this.field_l < this.field_a) {
                    stackIn_63_0 = this;
                    stackIn_63_1 = stackIn_62_1;
                    stackIn_63_2 = this.field_h;
                    break L5;
                  } else {
                    stackIn_63_0 = this;
                    stackIn_63_1 = stackIn_62_1;
                    stackIn_63_2 = -this.field_h;
                    break L5;
                  }
                }
                ((u) (this)).field_l = stackIn_63_1 + stackIn_63_2;
                return;
              }
            } else {
              this.field_k = false;
              this.a((byte) 126);
              return;
            }
          } else {
            if (!this.a(param0 + -93)) {
              L6: {
                stackIn_54_0 = this;

                stackIn_54_1 = this.field_l;

                if (this.field_l < this.field_a) {
                  stackIn_55_0 = this;
                  stackIn_55_1 = stackIn_54_1;
                  stackIn_55_2 = this.field_h;
                  break L6;
                } else {
                  stackIn_55_0 = this;
                  stackIn_55_1 = stackIn_54_1;
                  stackIn_55_2 = -this.field_h;
                  break L6;
                }
              }
              ((u) (this)).field_l = stackIn_55_1 + stackIn_55_2;
              return;
            } else {
              this.field_k = true;
              this.field_m = pb.a(so.field_a, 20, 1);
              return;
            }
          }
        } else {
          this.field_n = 0;
          if (this.field_k) {
            fieldTemp$5 = this.field_m;
            this.field_m = this.field_m - 1;
            if (0 < fieldTemp$5) {
              if (!this.a(param0 + -93)) {
                L7: {
                  stackIn_46_0 = this;

                  stackIn_46_1 = this.field_l;

                  if (this.field_l < this.field_a) {
                    stackIn_47_0 = this;
                    stackIn_47_1 = stackIn_46_1;
                    stackIn_47_2 = this.field_h;
                    break L7;
                  } else {
                    stackIn_47_0 = this;
                    stackIn_47_1 = stackIn_46_1;
                    stackIn_47_2 = -this.field_h;
                    break L7;
                  }
                }
                ((u) (this)).field_l = stackIn_47_1 + stackIn_47_2;
                return;
              } else {
                this.field_k = true;
                this.field_m = pb.a(so.field_a, 20, 1);
                return;
              }
            } else {
              this.field_k = false;
              this.a((byte) 126);
              return;
            }
          } else {
            if (!this.a(param0 + -93)) {
              L8: {
                stackIn_37_0 = this;

                stackIn_37_1 = this.field_l;

                if (this.field_l < this.field_a) {
                  stackIn_38_0 = this;
                  stackIn_38_1 = stackIn_37_1;
                  stackIn_38_2 = this.field_h;
                  break L8;
                } else {
                  stackIn_38_0 = this;
                  stackIn_38_1 = stackIn_37_1;
                  stackIn_38_2 = -this.field_h;
                  break L8;
                }
              }
              ((u) (this)).field_l = stackIn_38_1 + stackIn_38_2;
              return;
            } else {
              this.field_k = true;
              this.field_m = pb.a(so.field_a, 20, 1);
              return;
            }
          }
        }
    }

    private final boolean a(int param0) {
        int var2 = 60 % ((0 - param0) / 41);
        return Math.abs((this.field_l >> -878556156) - (this.field_a >> -229064828)) <= this.field_h ? true : false;
    }

    final void c(int param0) {
        int var2;
        int var3;
        int var4;
        var4 = ZombieDawn.field_J;
        var2 = -126 / ((param0 - 56) / 57);
        var3 = this.field_j * bd.field_e / 640;
        if (this.field_b != 1) {
          if (0 == this.field_b) {
            this.field_i[this.field_n].c(this.field_j, nh.field_P + -(this.field_l >> -1459910236));
            if (640 < bd.field_e) {
              this.field_i[this.field_n].b(640 + this.field_j, -(this.field_l >> 109164260) + nh.field_P);
              return;
            } else {
              return;
            }
          } else {
            if (this.field_c) {
              this.field_i[this.field_n].c(var3, -(this.field_l >> -1219560508) + nh.field_P);
              return;
            } else {
              this.field_i[this.field_n].b(var3, nh.field_P - (this.field_l >> 501103780));
              return;
            }
          }
        } else {
          this.field_i[this.field_n].b(var3, nh.field_P - (this.field_l >> -124261756), 150, 13056);
          return;
        }
    }

    public static void b(int param0) {
        if (param0 >= -2) {
          field_d = (int[]) null;
          field_f = null;
          field_d = null;
          field_e = null;
          return;
        } else {
          field_f = null;
          field_d = null;
          field_e = null;
          return;
        }
    }

    u(vn[] param0, int param1, int param2) {
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        this.field_k = false;
        try {
          L0: {
            L1: {
              this.field_j = param2;
              this.field_h = 4;
              this.field_b = param1;
              this.field_i = param0;
              stackIn_3_0 = this;

              if (0 == pb.a(so.field_a, 2, 1)) {
                stackIn_4_0 = this;
                stackIn_4_1 = 1;
                break L1;
              } else {
                stackIn_4_0 = this;
                stackIn_4_1 = 0;
                break L1;
              }
            }
            L2: {
              ((u) (this)).field_c = stackIn_4_1 != 0;
              this.field_n = pb.a(so.field_a, 3, 1);
              if (-1 != (this.field_b ^ -1)) {
                break L2;
              } else {
                this.field_n = 0;
                this.field_c = false;
                break L2;
              }
            }
            L3: {
              L4: {
                this.field_g = pb.a(so.field_a, 30, 1);
                if (-3 != (this.field_b ^ -1)) {
                  if ((this.field_b ^ -1) == -2) {
                    this.field_l = 90 - -pb.a(so.field_a, 50, 1) << 2098122564;
                    break L4;
                  } else {
                    if (this.field_b == 0) {
                      this.field_l = pb.a(so.field_a, 20, 1) + 87 << 1212405604;
                      break L4;
                    } else {
                      this.a((byte) 95);
                      break L3;
                    }
                  }
                } else {
                  this.field_l = pb.a(so.field_a, 77, 1) + 130 << -1042802492;
                  break L4;
                }
              }
              this.a((byte) 95);
              break L3;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var4);

            stackIn_17_1 = new StringBuilder().append("u.<init>(");

            if (param0 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L5;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L5;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_d = new int[]{170, 150, 140, 160};
        field_e = new sn("");
        field_f = "Waiting for music";
    }
}
