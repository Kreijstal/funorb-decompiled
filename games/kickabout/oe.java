/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oe extends mo {
    static String field_j;
    static String field_m;
    private int field_o;
    private gt[] field_h;
    static String field_l;
    private int field_i;
    static String field_n;
    static int field_f;
    int[] field_k;
    static ut[] field_p;
    static String field_g;

    final boolean a(int param0, int param1) {
        int stackIn_7_0 = 0;
        L0: {
          if (param0 == 8658) {
            break L0;
          } else {
            this.field_o = -4;
            break L0;
          }
        }
        L1: {
          L2: {
            if (!this.field_h[param1].d(param0 ^ 11365)) {
              break L2;
            } else {
              if (-1 == (this.field_o & 1 << param1 ^ -1)) {
                stackIn_7_0 = 0;
                break L1;
              } else {
                break L2;
              }
            }
          }
          stackIn_7_0 = 1;
          break L1;
        }
        return stackIn_7_0 != 0;
    }

    final boolean a(byte param0, int param1) {
        int var3;
        int var4;
        int var5;
        int stackIn_11_0 = 0;
        L0: {
          var3 = this.e(-102);
          if (param0 >= 39) {
            break L0;
          } else {
            this.a(-33, -45, -53);
            break L0;
          }
        }
        L1: {
          L2: {
            var4 = this.d(0);
            var5 = this.field_i - (var3 - -var4);
            if ((this.field_k[param1] ^ -1) == -2) {
              break L2;
            } else {
              L3: {
                if (this.field_k[param1] != -1) {
                  break L3;
                } else {
                  L4: {
                    if ((var4 ^ -1) < -1) {
                      break L4;
                    } else {
                      if (1 >= var5) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  if ((var3 ^ -1) <= -5) {
                    break L3;
                  } else {
                    break L2;
                  }
                }
              }
              stackIn_11_0 = 0;
              break L1;
            }
          }
          stackIn_11_0 = 1;
          break L1;
        }
        return stackIn_11_0 != 0;
    }

    final void a(byte param0, mo param1) {
        oe var6 = null;
        oe var3 = null;
        int var4 = 0;
        int var5 = Kickabout.field_G;
        try {
            var6 = (oe) ((Object) param1);
            var3 = var6;
            for (var4 = 0; this.field_i > var4; var4++) {
                this.field_k[var4] = var6.field_k[var4];
            }
            if (param0 > -52) {
                this.field_h = (gt[]) null;
            }
            this.field_o = var3.field_o;
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) ((Object) runtimeException), "oe.R(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(boolean param0, int param1) {
        int dupTemp$0 = 0;
        int[] var3;
        int var4;
        int var5;
        int var6;
        int[] var7;
        int[] var8;
        L0: {
          var5 = Kickabout.field_G;
          this.field_k[param1] = -1;
          this.field_o = this.field_o | 1 << param1;
          var8 = new int[2];
          var7 = var8;
          var3 = var7;
          if (!param0) {
            break L0;
          } else {
            this.a((byte) 59, -19);
            break L0;
          }
        }
        var4 = 0;
        L1: while (true) {
          if (var4 >= this.field_i) {
            L2: {
              L3: {
                if (0 == var8[0]) {
                  break L3;
                } else {
                  if (-1 != (var8[1] ^ -1)) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              var6 = 0;
              var4 = var6;
              L4: while (true) {
                if (var6 >= this.field_i) {
                  break L2;
                } else {
                  if (this.field_h[var6].d(3511)) {
                    this.field_o = this.field_o & (1 << var6 ^ -1);
                    this.field_k[var6] = -1;
                    var6++;
                    continue L4;
                  } else {
                    var6++;
                    continue L4;
                  }
                }
              }
            }
            return;
          } else {
            if (this.field_h[var4].d(3511)) {
              if ((this.field_k[var4] ^ -1) == 0) {
                var3[0] = var3[0] + 1;
                var3[1] = var3[1] + 1;
                var4++;
                continue L1;
              } else {
                dupTemp$0 = this.field_k[var4];
                var3[dupTemp$0] = var3[dupTemp$0] + 1;
                var4++;
                continue L1;
              }
            } else {
              var4++;
              continue L1;
            }
          }
        }
    }

    private final int e(int param0) {
        int var2;
        int[] var3;
        int var4;
        int var5;
        int var6;
        var6 = Kickabout.field_G;
        var2 = 0;
        var3 = this.field_k;
        var4 = 0;
        L0: while (true) {
          if (var3.length <= var4) {
            L1: {
              if (param0 < -96) {
                break L1;
              } else {
                this.a(false, -110);
                break L1;
              }
            }
            return var2;
          } else {
            var5 = var3[var4];
            if ((var5 ^ -1) != -1) {
              var4++;
              continue L0;
            } else {
              var2++;
              var4++;
              continue L0;
            }
          }
        }
    }

    final static void c(int param0) {
        if (param0 != 30929) {
            field_m = (String) null;
        }
    }

    final boolean b(byte param0, int param1) {
        int var3;
        int var4;
        int var5;
        int stackIn_11_0 = 0;
        L0: {
          if (param0 >= 28) {
            break L0;
          } else {
            field_j = (String) null;
            break L0;
          }
        }
        L1: {
          L2: {
            var3 = this.e(-104);
            var4 = this.d(0);
            var5 = -var3 + (this.field_i + -var4);
            if (0 == this.field_k[param1]) {
              break L2;
            } else {
              L3: {
                if (0 != (this.field_k[param1] ^ -1)) {
                  break L3;
                } else {
                  L4: {
                    if (-1 > (var3 ^ -1)) {
                      break L4;
                    } else {
                      if (-2 <= (var5 ^ -1)) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  if (var4 >= 4) {
                    break L3;
                  } else {
                    break L2;
                  }
                }
              }
              stackIn_11_0 = 0;
              break L1;
            }
          }
          stackIn_11_0 = 1;
          break L1;
        }
        return stackIn_11_0 != 0;
    }

    final static void a(byte param0, tc param1) {
        try {
            param1.field_p = new char[]{(char)63};
            param1.field_n = new int[]{-1};
            int var2_int = -66 % ((35 - param0) / 47);
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) ((Object) runtimeException), "oe.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, int param1, int param2) {
        int var5;
        L0: {
          var5 = Kickabout.field_G;
          if (0 != param2) {
            if (-2 != (param2 ^ -1)) {
              if (2 == param2) {
                this.field_o = this.field_o ^ 1 << param0;
                break L0;
              } else {
                break L0;
              }
            } else {
              if (0 != this.field_k[param0]) {
                if (this.b((byte) 125, param0)) {
                  this.field_k[param0] = 1;
                  this.field_o = this.field_o & (1 << param0 ^ -1);
                  break L0;
                } else {
                  break L0;
                }
              } else {
                this.field_k[param0] = -1;
                this.field_o = this.field_o & (1 << param0 ^ -1);
                break L0;
              }
            }
          } else {
            if (-2 == (this.field_k[param0] ^ -1)) {
              this.field_k[param0] = -1;
              this.field_o = this.field_o & (1 << param0 ^ -1);
              break L0;
            } else {
              if (!this.a((byte) 61, param0)) {
                break L0;
              } else {
                this.field_k[param0] = 0;
                this.field_o = this.field_o & (1 << param0 ^ -1);
                break L0;
              }
            }
          }
        }
        L1: {
          if (param1 == 11678) {
            break L1;
          } else {
            this.a(15, -11, -81);
            break L1;
          }
        }
    }

    public static void a(byte param0) {
        field_n = null;
        field_l = null;
        field_m = null;
        int var1 = -76 / ((param0 - -31) / 55);
        field_p = null;
        field_j = null;
        field_g = null;
    }

    final void a(int param0, ml param1) {
        int var3_int = 0;
        int var5 = Kickabout.field_G;
        try {
            var3_int = 0;
            int var4 = 14 / ((param0 - -25) / 44);
            while (this.field_i > var3_int) {
                this.field_k[var3_int] = -1 + param1.l(2, 59);
                var3_int++;
            }
            this.field_o = param1.l(8, 59);
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) ((Object) runtimeException), "oe.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final String toString() {
        StringBuilder discarded$75 = null;
        StringBuilder discarded$76 = null;
        StringBuilder discarded$77 = null;
        StringBuilder discarded$78 = null;
        StringBuilder discarded$79 = null;
        StringBuilder var1;
        int var2;
        int var3;
        StringBuilder var4;
        StringBuilder stackIn_6_0 = null;
        StringBuilder stackIn_7_0 = null;
        String stackIn_7_1 = null;
        var3 = Kickabout.field_G;
        var4 = new StringBuilder("AgentTeamSelection\t ready=");
        var1 = var4;
        gn.a(this.field_o, -28745, this.field_i, var1);
        StringBuilder discarded$74 = var1.append("\tselection=[");
        var2 = 0;
        L0: while (true) {
          if (var2 >= this.field_k.length) {
            discarded$75 = var1.append("]");
            return var1.toString();
          } else {
            L1: {
              if ((this.field_k[var2] ^ -1) > -1) {
                break L1;
              } else {
                discarded$76 = var1.append(" ");
                break L1;
              }
            }
            L2: {
              stackIn_6_0 = (StringBuilder) (var1);

              if (this.a(8658, var2)) {
                var4 = var1;
                stackIn_7_0 = (StringBuilder) ((Object) stackIn_6_0);
                stackIn_7_1 = " ";
                break L2;
              } else {
                stackIn_7_0 = (StringBuilder) ((Object) stackIn_6_0);
                stackIn_7_1 = ".";
                break L2;
              }
            }
            var4 = var1;
            discarded$77 = ((StringBuilder) (Object) stackIn_7_0).append(stackIn_7_1);
            discarded$78 = var4.append(this.field_k[var2]);
            if (var2 < -1 + this.field_k.length) {
              discarded$79 = var1.append(",");
              var2++;
              continue L0;
            } else {
              var2++;
              continue L0;
            }
          }
        }
    }

    private final int d(int param0) {
        int var2;
        int[] var3;
        int var4;
        int var5;
        int var6;
        var6 = Kickabout.field_G;
        var2 = param0;
        var3 = this.field_k;
        var4 = 0;
        L0: while (true) {
          if (var4 >= var3.length) {
            return var2;
          } else {
            var5 = var3[var4];
            if (-2 == (var5 ^ -1)) {
              var2++;
              var4++;
              continue L0;
            } else {
              var4++;
              continue L0;
            }
          }
        }
    }

    oe(gt[] param0) {
        int var2_int = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            this.field_h = param0;
            this.field_i = this.field_h.length;
            this.field_k = new int[this.field_i];
            var2_int = 0;
            L1: while (true) {
              if (this.field_i <= var2_int) {
                break L0;
              } else {
                this.field_k[var2_int] = -1;
                var2_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var2);

            stackIn_7_1 = new StringBuilder().append("oe.<init>(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
    }

    static {
        field_j = "goals and posession";
        field_m = "You have played <%0> recently. Rewards are reduced.";
        field_n = "This game option is only available to members.";
        field_l = "Waiting for extra data";
        field_f = 15;
        field_g = "Open";
    }
}
