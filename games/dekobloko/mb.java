/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class mb {
    private boolean field_a;
    static String field_e;
    private int[] field_b;
    private int field_g;
    static int field_c;
    static int[] field_d;
    private int field_f;

    final static boolean a(boolean param0, int param1) {
        try {
            long dupTemp$1 = 0L;
            int var2 = 0;
            uf var2_ref_uf = null;
            IOException var2_ref_IOException = null;
            int stackIn_9_0 = 0;
            Throwable decompiledCaughtException = null;
            L0: {
              if (k.field_c != null) {
                break L0;
              } else {
                k.field_c = lf.field_f.a(114, mc.field_e, hc.field_a);
                break L0;
              }
            }
            if (k.field_c.field_c != 0) {
              dupTemp$1 = ik.a(4);
              el.field_J = dupTemp$1;
              p.field_a = dupTemp$1;
              if (-2 == (k.field_c.field_c ^ -1)) {
                try {
                  L1: {
                    L2: {
                      qc.field_s = new qk((java.net.Socket) (k.field_c.field_b), lf.field_f);
                      var2_ref_uf = de.field_V;
                      we.field_b.field_n = 0;
                      ph.field_xb = ba.field_f;
                      if (!param0) {
                        stackIn_9_0 = -1;
                        break L2;
                      } else {
                        stackIn_9_0 = -2;
                        break L2;
                      }
                    }
                    lg.field_U = stackIn_9_0;
                    bb.field_d = stackIn_9_0;
                    kf.field_L = stackIn_9_0;
                    var2_ref_uf.field_n = 0;
                    gi.a(kb.field_g, l.field_c, 17, we.field_b, qk.field_a);
                    wj.c(4792, -1);
                    break L1;
                  }
                } catch (java.io.IOException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var2_ref_IOException = (IOException) (Object) decompiledCaughtException;
                  ph.field_xb = kl.field_B;
                  k.field_c = null;
                  var2 = 79 / ((param1 - 21) / 48);
                  return true;
                }
                k.field_c = null;
                var2 = 79 / ((param1 - 21) / 48);
                return true;
              } else {
                ph.field_xb = kl.field_B;
                k.field_c = null;
                var2 = 79 / ((param1 - 21) / 48);
                return true;
              }
            } else {
              return false;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final int a(int param0) {
        int var2 = 97 % ((param0 - 37) / 50);
        return this.field_g + 1;
    }

    final static String a(int param0, hl param1) {
        String stackIn_33_0 = null;
        Object stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        Object stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_37_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object var2 = null;
        String var3 = null;
        Object var3_ref = null;
        int var4 = 0;
        String var5 = null;
        var4 = client.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              var2 = null;
              if (param1.field_p == null) {
                break L1;
              } else {
                L2: {
                  var5 = param1.field_p;
                  var3 = var5;
                  var3 = var5;
                  var2 = var5;
                  if (param1.field_l == 1) {
                    var2 = "<img=0>" + var5;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                if (-3 == (param1.field_l ^ -1)) {
                  var2 = "<img=1>" + (String) (var2);
                  var3_ref = var2;
                  var3_ref = var2;
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L3: {
              if (param0 > 96) {
                break L3;
              } else {
                field_c = -12;
                break L3;
              }
            }
            L4: {
              var3 = "";
              if (2 == param1.field_m) {
                if (!param1.field_j) {
                  L5: {
                    if (0 != param1.field_i) {
                      break L5;
                    } else {
                      if (param1.field_n != 0) {
                        break L5;
                      } else {
                        var3 = cm.a((byte) 90, oj.field_b, new String[]{(String) (var2)});
                        break L4;
                      }
                    }
                  }
                  var3 = cm.a((byte) 110, im.field_j, new String[]{(String) (var2)});
                  break L4;
                } else {
                  break L4;
                }
              } else {
                L6: {
                  if (0 != param1.field_m) {
                    break L6;
                  } else {
                    if (ii.field_q) {
                      var3 = "[" + uc.field_b + "] ";
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                }
                L7: {
                  if ((param1.field_m ^ -1) != -2) {
                    break L7;
                  } else {
                    var3 = "[" + cm.a((byte) 125, hf.field_a, new String[]{param1.field_g}) + "] ";
                    break L7;
                  }
                }
                L8: {
                  if (4 != param1.field_m) {
                    break L8;
                  } else {
                    if (f.field_q != null) {
                      var3 = "[" + f.field_q + "] ";
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                }
                L9: {
                  if (-4 != (param1.field_m ^ -1)) {
                    break L9;
                  } else {
                    var3 = "[#" + param1.field_g + "] ";
                    break L9;
                  }
                }
                if (!param1.field_j) {
                  var3 = var3 + (String) (var2) + ": ";
                  break L4;
                } else {
                  break L4;
                }
              }
            }
            stackIn_33_0 = (String) (var3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var2 = decompiledCaughtException;
            stackIn_36_0 = var2;

            stackIn_36_1 = new StringBuilder().append("mb.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_37_0 = stackIn_36_0;
              stackIn_37_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackIn_37_2 = "null";
              break L10;
            } else {
              stackIn_37_0 = stackIn_36_0;
              stackIn_37_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackIn_37_2 = "{...}";
              break L10;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_37_0), stackIn_37_2 + ')');
        }
        return stackIn_33_0;
    }

    final int b(int param0, int param1) {
        if (param0 <= this.field_g) {
          if (param1 != 0) {
            this.field_f = -5;
            return this.field_b[param0];
          } else {
            return this.field_b[param0];
          }
        } else {
          throw new ArrayIndexOutOfBoundsException(param0);
        }
    }

    private final void a(int param0, int param1) {
        int[] var3;
        int[] var4;
        var4 = new int[this.a((byte) -63, param0)];
        var3 = var4;
        if (param1 >= -4) {
          this.b(9, -101);
          an.a(this.field_b, 0, var4, 0, this.field_b.length);
          this.field_b = var4;
          return;
        } else {
          an.a(this.field_b, 0, var4, 0, this.field_b.length);
          this.field_b = var4;
          return;
        }
    }

    private final int a(byte param0, int param1) {
        int var3;
        int var4;
        var4 = client.field_A ? 1 : 0;
        if (param0 != -63) {
          this.field_f = -94;
          var3 = this.field_b.length;
          L0: while (true) {
            if (param1 < var3) {
              return var3;
            } else {
              if (!this.field_a) {
                var3 = var3 + this.field_f;
                continue L0;
              } else {
                if (var3 == 0) {
                  var3 = 1;
                  continue L0;
                } else {
                  var3 = var3 * this.field_f;
                  continue L0;
                }
              }
            }
          }
        } else {
          var3 = this.field_b.length;
          L1: while (true) {
            if (param1 < var3) {
              return var3;
            } else {
              if (!this.field_a) {
                var3 = var3 + this.field_f;
                continue L1;
              } else {
                if (var3 == 0) {
                  var3 = 1;
                  continue L1;
                } else {
                  var3 = var3 * this.field_f;
                  continue L1;
                }
              }
            }
          }
        }
    }

    private final void a(byte param0, int param1, int param2) {
        if (this.field_g >= param1) {
          if (param0 >= 38) {
            if (param1 >= this.field_b.length) {
              this.a(param1, -23);
              this.field_b[param1] = param2;
              return;
            } else {
              this.field_b[param1] = param2;
              return;
            }
          } else {
            return;
          }
        } else {
          this.field_g = param1;
          if (param0 >= 38) {
            if (param1 < this.field_b.length) {
              this.field_b[param1] = param2;
              return;
            } else {
              this.a(param1, -23);
              this.field_b[param1] = param2;
              return;
            }
          } else {
            return;
          }
        }
    }

    private mb() throws Throwable {
        throw new Error();
    }

    final static int a(boolean param0, int param1, byte param2, int param3, int param4) {
        int var5;
        L0: {
          var5 = 256 + param1 * (-param4 + param3);
          if (param0) {
            var5 += 64;
            break L0;
          } else {
            break L0;
          }
        }
        if (param2 != -122) {
          field_e = (String) null;
          return var5;
        } else {
          return var5;
        }
    }

    final void a(int param0, boolean param1) {
        if (param1) {
          field_e = (String) null;
          this.a((byte) 114, this.field_g - -1, param0);
          return;
        } else {
          this.a((byte) 114, this.field_g - -1, param0);
          return;
        }
    }

    public static void a(boolean param0) {
        field_e = null;
        field_d = null;
        if (param0) {
            field_e = (String) null;
        }
    }

    final void c(int param0, int param1) {
        if (param1 >= 0) {
          if (this.field_g >= param1) {
            if (param0 > -25) {
              L0: {
                this.field_f = 15;
                if (this.field_g != param1) {
                  an.a(this.field_b, param1 + 1, this.field_b, param1, this.field_g + -param1);
                  break L0;
                } else {
                  break L0;
                }
              }
              this.field_g = this.field_g - 1;
              return;
            } else {
              L1: {
                if (this.field_g != param1) {
                  an.a(this.field_b, param1 + 1, this.field_b, param1, this.field_g + -param1);
                  break L1;
                } else {
                  break L1;
                }
              }
              this.field_g = this.field_g - 1;
              return;
            }
          } else {
            throw new ArrayIndexOutOfBoundsException(param1);
          }
        } else {
          throw new ArrayIndexOutOfBoundsException(param1);
        }
    }

    static {
        field_e = "Special Items";
    }
}
