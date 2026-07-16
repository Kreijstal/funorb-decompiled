/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class fi extends l {
    cd field_o;
    int field_k;
    int field_g;
    int field_q;
    int field_l;
    ol field_w;
    static int[] field_j;
    static java.awt.Canvas field_v;
    int field_m;
    static de field_t;
    int field_u;
    String field_h;
    String field_n;
    ie field_r;
    boolean field_p;
    static int field_s;
    int field_i;

    final static Boolean e(boolean param0) {
        if (!param0) {
            return null;
        }
        Boolean var1 = ia.field_b;
        ia.field_b = null;
        return var1;
    }

    void a(int param0, int param1, int param2, fi param3, int param4, int param5) {
        if (param5 <= 73) {
            StringBuilder discarded$0 = ((fi) this).a((Hashtable) null, (byte) -23, 50, (StringBuilder) null);
        }
        ((fi) this).field_i = 0;
    }

    final boolean a(int param0, int param1, int param2, byte param3, int param4) {
        int stackIn_8_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_7_0 = 0;
        L0: {
          if (param3 >= 7) {
            break L0;
          } else {
            ((fi) this).field_o = null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (param4 + ((fi) this).field_l > param1) {
              break L2;
            } else {
              if (param2 < param0 + ((fi) this).field_u) {
                break L2;
              } else {
                if (param4 + (((fi) this).field_l + ((fi) this).field_g) <= param1) {
                  break L2;
                } else {
                  if (((fi) this).field_m + ((fi) this).field_u + param0 <= param2) {
                    break L2;
                  } else {
                    stackOut_6_0 = 1;
                    stackIn_8_0 = stackOut_6_0;
                    break L1;
                  }
                }
              }
            }
          }
          stackOut_7_0 = 0;
          stackIn_8_0 = stackOut_7_0;
          break L1;
        }
        return stackIn_8_0 != 0;
    }

    final boolean a(int param0, char param1, int param2) {
        if (((fi) this).f(true)) {
            if (!(!((fi) this).a((fi) this, param1, param0, 21))) {
                return true;
            }
        }
        if (param2 > -65) {
            boolean discarded$0 = ((fi) this).a(19, 14, (byte) 51, true);
        }
        int var4 = param0;
        if (-81 != (var4 ^ -1)) {
            return false;
        }
        return ((fi) this).a((fi) this, -8515);
    }

    StringBuilder a(Hashtable param0, byte param1, int param2, StringBuilder param3) {
        if (param1 <= 118) {
            boolean discarded$0 = ((fi) this).a(-22, '﾿', 96);
        }
        if (!(!((fi) this).a(param0, param2, 34, param3))) {
            ((fi) this).a(param2, param0, (byte) 127, param3);
        }
        return param3;
    }

    boolean a(fi param0, int param1) {
        if (param1 != -8515) {
            boolean discarded$0 = ((fi) this).a((fi) null, 9, true, -68, -47, 99, 20);
            return false;
        }
        return false;
    }

    final boolean a(Hashtable param0, int param1, int param2, StringBuilder param3) {
        if (param2 != 34) {
            boolean discarded$0 = ((fi) this).a((fi) null, -111, true, 107, -55, -73, 65);
        }
        if (!param0.containsKey(this)) {
            Object discarded$1 = param0.put(this, this);
            return true;
        }
        StringBuilder discarded$2 = param3.append("<circular [0x").append(Integer.toHexString(this.hashCode())).append("]>");
        return false;
    }

    void a(int param0, boolean param1, int param2, int param3, int param4) {
        ((fi) this).field_m = param0;
        ((fi) this).field_g = param4;
        if (!param1) {
            ((fi) this).field_k = 87;
        }
        ((fi) this).field_l = param3;
        ((fi) this).field_u = param2;
    }

    void c(int param0) {
        if (param0 != -1) {
            String discarded$0 = ((fi) this).d(33);
        }
    }

    final void d(boolean param0) {
        ((fi) this).a(((fi) this).field_m, true, ((fi) this).field_u, ((fi) this).field_l, ((fi) this).field_g);
        if (param0) {
            ((fi) this).a(-67, 127, 95);
        }
    }

    boolean a(int param0, fi param1, int param2, int param3, int param4, int param5, int param6) {
        if (param5 != 0) {
            ((fi) this).field_g = -122;
            return false;
        }
        return false;
    }

    final boolean a(int param0, int param1, byte param2, boolean param3) {
        int var5 = 0;
        ce var6 = null;
        int var7 = 0;
        L0: {
          L1: {
            var7 = Virogrid.field_F ? 1 : 0;
            ((fi) this).a(param1, 116, (fi) this, param0);
            var5 = ((fi) this).f(true) ? 1 : 0;
            if (param3) {
              break L1;
            } else {
              if (var5 == 0) {
                break L0;
              } else {
                if (-1 == (oi.field_g ^ -1)) {
                  break L0;
                } else {
                  ((fi) this).c(-1);
                  if (var7 == 0) {
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
            }
          }
          L2: {
            if (0 == og.field_b) {
              break L2;
            } else {
              if (var5 != 0) {
                boolean discarded$2 = ((fi) this).a(param1, (fi) this, og.field_b, param0, nl.field_u, 0, hk.field_Jb);
                break L2;
              } else {
                break L2;
              }
            }
          }
          L3: {
            if (0 == oi.field_g) {
              break L3;
            } else {
              L4: {
                if (((fi) this).a((fi) this, oi.field_g, false, param1, a.field_y, param0, ii.field_b)) {
                  break L4;
                } else {
                  ((fi) this).c(-1);
                  break L4;
                }
              }
              param3 = false;
              break L3;
            }
          }
          if (0 != j.field_e) {
            break L0;
          } else {
            if (-1 == (en.field_Jb ^ -1)) {
              break L0;
            } else {
              ((fi) this).a(hk.field_Jb, nl.field_u, param1, (fi) this, param0, 111);
              var6 = ra.field_b;
              if (var6 != null) {
                L5: {
                  if (var6.field_o instanceof ik) {
                    ((ik) (Object) var6.field_o).a(82, (vg) null, var6);
                    break L5;
                  } else {
                    break L5;
                  }
                }
                ra.field_b = null;
                break L0;
              } else {
                break L0;
              }
            }
          }
        }
        en.field_Jb = j.field_e;
        em.a(true, ((fi) this).d(59));
        if (param2 < -126) {
          return param3;
        } else {
          return false;
        }
    }

    final void a(int param0, Hashtable param1, byte param2, StringBuilder param3) {
        int var6 = 0;
        L0: {
          var6 = Virogrid.field_F ? 1 : 0;
          StringBuilder discarded$58 = param3.append(this.getClass().getName()).append("[0x").append(Integer.toHexString(this.hashCode())).append("] @").append(((fi) this).field_l).append(",").append(((fi) this).field_u).append(" ").append(((fi) this).field_g).append("x").append(((fi) this).field_m);
          if (((fi) this).field_n == null) {
            break L0;
          } else {
            StringBuilder discarded$59 = param3.append(" text=\"").append(((fi) this).field_n).append(34);
            break L0;
          }
        }
        L1: {
          if (((fi) this).field_p) {
            StringBuilder discarded$60 = param3.append(" mouseover");
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          if (!((fi) this).f(true)) {
            break L2;
          } else {
            StringBuilder discarded$61 = param3.append(" focused");
            break L2;
          }
        }
        L3: {
          if (((fi) this).field_w == null) {
            break L3;
          } else {
            L4: {
              StringBuilder discarded$62 = param3.append(" renderer=");
              if (((fi) this).field_w instanceof fi) {
                break L4;
              } else {
                StringBuilder discarded$63 = param3.append(((fi) this).field_w);
                if (var6 == 0) {
                  break L3;
                } else {
                  break L4;
                }
              }
            }
            param3 = ((fi) this).a(param1, (byte) 119, param0 - -1, param3);
            break L3;
          }
        }
        if (param2 > 125) {
          L5: {
            if (null != ((fi) this).field_o) {
              L6: {
                StringBuilder discarded$64 = param3.append(" listener=");
                if (((fi) this).field_o instanceof fi) {
                  break L6;
                } else {
                  StringBuilder discarded$65 = param3.append(((fi) this).field_o);
                  if (var6 == 0) {
                    break L5;
                  } else {
                    break L6;
                  }
                }
              }
              param3 = ((fi) this).a(param1, (byte) 126, 1 + param0, param3);
              break L5;
            } else {
              break L5;
            }
          }
          return;
        } else {
          return;
        }
    }

    int b(byte param0) {
        if (param0 != -39) {
            String discarded$0 = ((fi) this).toString();
            return 0;
        }
        return 0;
    }

    public final String toString() {
        return ((fi) this).a(new Hashtable(), (byte) 123, 0, new StringBuilder()).toString();
    }

    boolean a(fi param0, char param1, int param2, int param3) {
        int var5 = 81 % ((-75 - param3) / 36);
        return false;
    }

    fi(String param0, cd param1) {
        this(param0, vi.field_g.field_j, param1);
    }

    String d(int param0) {
        if (param0 < 35) {
            return null;
        }
        if (!((fi) this).field_p) {
            return null;
        }
        return ((fi) this).field_h;
    }

    void a(int param0, int param1, fi param2, int param3) {
        int var5 = ((fi) this).a(param3, nl.field_u, hk.field_Jb, (byte) 22, param0) ? 1 : 0;
        if (!((var5 == 0 ? 1 : 0) == (!((fi) this).field_p ? 1 : 0))) {
            ((fi) this).field_p = var5 != 0 ? true : false;
            if (((fi) this).field_o != null) {
                if (((fi) this).field_o instanceof ni) {
                    ((ni) (Object) ((fi) this).field_o).a((byte) 109, var5 != 0, (fi) this);
                }
            }
        }
        if (param1 < 113) {
            ((fi) this).a(92, (Hashtable) null, (byte) 86, (StringBuilder) null);
        }
    }

    public static void c(boolean param0) {
        field_t = null;
        if (param0) {
            fi.c(false);
        }
        field_j = null;
        field_v = null;
    }

    void a(byte param0, int param1, int param2, int param3) {
        if (param0 != 37) {
            ((fi) this).a(15, (Hashtable) null, (byte) 35, (StringBuilder) null);
        }
        if (0 == param3) {
            if (!(((fi) this).field_w == null)) {
                ((fi) this).field_w.a(param1, (fi) this, true, param2, -23294);
            }
        }
    }

    boolean a(fi param0, int param1, boolean param2, int param3, int param4, int param5, int param6) {
        if (param2) {
            return true;
        }
        if (!((fi) this).a(param5, param6, param4, (byte) 27, param3)) {
            return false;
        }
        ((fi) this).field_i = param1;
        return false;
    }

    final void a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5_int = 0;
        String var5 = null;
        int var6 = 0;
        var6 = Virogrid.field_F ? 1 : 0;
        var4 = ((fi) this).b((byte) -39);
        var5_int = param0;
        L0: while (true) {
          L1: {
            if (var5_int > var4) {
              break L1;
            } else {
              ((fi) this).a((byte) 37, param2, param1, var5_int);
              var5_int++;
              if (var6 == 0) {
                continue L0;
              } else {
                break L1;
              }
            }
          }
          L2: {
            var5 = ph.c(-15025);
            if (var5 == null) {
              break L2;
            } else {
              vi.field_g.a(mc.field_a, 5, ge.field_b, var5);
              break L2;
            }
          }
          return;
        }
    }

    boolean f(boolean param0) {
        if (!param0) {
            ((fi) this).field_p = true;
            return false;
        }
        return false;
    }

    protected fi() {
        ((fi) this).field_q = 0;
        ((fi) this).field_k = 0;
    }

    fi(String param0, ol param1, cd param2) {
        gm var4 = null;
        ((fi) this).field_q = 0;
        ((fi) this).field_k = 0;
        ((fi) this).field_w = param1;
        ((fi) this).field_o = param2;
        ((fi) this).field_n = param0;
        if (((fi) this).field_w instanceof gm) {
            var4 = (gm) (Object) ((fi) this).field_w;
            ((fi) this).field_g = var4.a((fi) this, false);
            ((fi) this).field_m = var4.a((fi) this, 80);
        }
    }

    fi(int param0, int param1, int param2, int param3, ol param4, cd param5) {
        ((fi) this).field_q = 0;
        ((fi) this).field_k = 0;
        ((fi) this).field_g = param2;
        ((fi) this).field_u = param1;
        ((fi) this).field_l = param0;
        ((fi) this).field_m = param3;
        ((fi) this).field_o = param5;
        ((fi) this).field_w = param4;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var1 = 0;
        int var0 = 0;
        int var2 = 0;
        field_j = new int[256];
        for (var1 = 0; var1 < 256; var1++) {
            var0 = var1;
            for (var2 = 0; -9 < (var2 ^ -1); var2++) {
                if (-2 == (var0 & 1 ^ -1)) {
                    var0 = -306674912 ^ var0 >>> 1092241025;
                } else {
                    var0 = var0 >>> 1;
                }
            }
            field_j[var1] = var0;
        }
        field_s = 0;
    }
}
