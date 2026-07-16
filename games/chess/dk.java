/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dk {
    static String field_e;
    static java.math.BigInteger field_k;
    private l field_i;
    static ci field_h;
    private int field_m;
    private l field_c;
    private l[] field_b;
    private int field_d;
    static boolean field_g;
    static tk field_f;
    static String field_a;
    private long field_j;
    static String field_l;

    final l b(boolean param0) {
        l var2 = null;
        l var3 = null;
        int var4 = 0;
        var4 = Chess.field_G;
        if (param0) {
          if (((dk) this).field_i != null) {
            var2 = ((dk) this).field_b[(int)(((dk) this).field_j & (long)(-1 + ((dk) this).field_m))];
            L0: while (true) {
              if (((dk) this).field_i != var2) {
                if ((((dk) this).field_i.field_l ^ -1L) != (((dk) this).field_j ^ -1L)) {
                  ((dk) this).field_i = ((dk) this).field_i.field_p;
                  continue L0;
                } else {
                  var3 = ((dk) this).field_i;
                  ((dk) this).field_i = ((dk) this).field_i.field_p;
                  return var3;
                }
              } else {
                ((dk) this).field_i = null;
                return null;
              }
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    final l a(boolean param0) {
        if (param0) {
          boolean discarded$2 = dk.c(false);
          ((dk) this).field_d = 0;
          return ((dk) this).a(0);
        } else {
          ((dk) this).field_d = 0;
          return ((dk) this).a(0);
        }
    }

    final l a(long param0, int param1) {
        l var4 = null;
        l var5 = null;
        int var6 = 0;
        l var7 = null;
        l var8 = null;
        var6 = Chess.field_G;
        ((dk) this).field_j = param0;
        if (param1 == 3000) {
          var7 = ((dk) this).field_b[(int)((long)(-1 + ((dk) this).field_m) & param0)];
          var4 = var7;
          ((dk) this).field_i = var7.field_p;
          L0: while (true) {
            if (var4 != ((dk) this).field_i) {
              if ((((dk) this).field_i.field_l ^ -1L) != (param0 ^ -1L)) {
                ((dk) this).field_i = ((dk) this).field_i.field_p;
                continue L0;
              } else {
                var5 = ((dk) this).field_i;
                ((dk) this).field_i = ((dk) this).field_i.field_p;
                return var5;
              }
            } else {
              ((dk) this).field_i = null;
              return null;
            }
          }
        } else {
          ((dk) this).field_j = 72L;
          var8 = ((dk) this).field_b[(int)((long)(-1 + ((dk) this).field_m) & param0)];
          var4 = var8;
          ((dk) this).field_i = var8.field_p;
          L1: while (true) {
            if (var4 != ((dk) this).field_i) {
              if ((((dk) this).field_i.field_l ^ -1L) != (param0 ^ -1L)) {
                ((dk) this).field_i = ((dk) this).field_i.field_p;
                continue L1;
              } else {
                var5 = ((dk) this).field_i;
                ((dk) this).field_i = ((dk) this).field_i.field_p;
                return var5;
              }
            } else {
              ((dk) this).field_i = null;
              return null;
            }
          }
        }
    }

    final void a(boolean param0, l param1, long param2) {
        l var5 = null;
        l var6 = null;
        l var7 = null;
        l var8 = null;
        l var9 = null;
        if (param0) {
          if (null != param1.field_m) {
            param1.d(-1);
            var8 = ((dk) this).field_b[(int)(param2 & (long)(((dk) this).field_m - 1))];
            var5 = var8;
            param1.field_m = var8.field_m;
            param1.field_p = var5;
            param1.field_m.field_p = param1;
            param1.field_l = param2;
            param1.field_p.field_m = param1;
            return;
          } else {
            var9 = ((dk) this).field_b[(int)(param2 & (long)(((dk) this).field_m - 1))];
            var5 = var9;
            param1.field_m = var9.field_m;
            param1.field_p = var5;
            param1.field_m.field_p = param1;
            param1.field_l = param2;
            param1.field_p.field_m = param1;
            return;
          }
        } else {
          ((dk) this).a(false, (l) null, -111L);
          if (null == param1.field_m) {
            var6 = ((dk) this).field_b[(int)(param2 & (long)(((dk) this).field_m - 1))];
            var5 = var6;
            param1.field_m = var6.field_m;
            param1.field_p = var5;
            param1.field_m.field_p = param1;
            param1.field_l = param2;
            param1.field_p.field_m = param1;
            return;
          } else {
            param1.d(-1);
            var7 = ((dk) this).field_b[(int)(param2 & (long)(((dk) this).field_m - 1))];
            var5 = var7;
            param1.field_m = var7.field_m;
            param1.field_p = var5;
            param1.field_m.field_p = param1;
            param1.field_l = param2;
            param1.field_p.field_m = param1;
            return;
          }
        }
    }

    final l a(int param0) {
        int var3 = 0;
        l var4 = null;
        l var5 = null;
        l var9 = null;
        l var12 = null;
        var3 = Chess.field_G;
        if (-1 > (((dk) this).field_d ^ -1)) {
          if (((dk) this).field_c == ((dk) this).field_b[((dk) this).field_d + -1]) {
            L0: while (true) {
              if (((dk) this).field_m <= ((dk) this).field_d) {
                if (param0 == 0) {
                  return null;
                } else {
                  dk.b(40);
                  return null;
                }
              } else {
                int fieldTemp$2 = ((dk) this).field_d;
                ((dk) this).field_d = ((dk) this).field_d + 1;
                var4 = ((dk) this).field_b[fieldTemp$2].field_p;
                var9 = var4;
                if (var4 != ((dk) this).field_b[-1 + ((dk) this).field_d]) {
                  ((dk) this).field_c = var9.field_p;
                  return var9;
                } else {
                  continue L0;
                }
              }
            }
          } else {
            var12 = ((dk) this).field_c;
            ((dk) this).field_c = var12.field_p;
            return var12;
          }
        } else {
          L1: while (true) {
            if (((dk) this).field_m <= ((dk) this).field_d) {
              if (param0 == 0) {
                return null;
              } else {
                dk.b(40);
                return null;
              }
            } else {
              int fieldTemp$3 = ((dk) this).field_d;
              ((dk) this).field_d = ((dk) this).field_d + 1;
              var4 = ((dk) this).field_b[fieldTemp$3].field_p;
              var5 = var4;
              if (var4 != ((dk) this).field_b[-1 + ((dk) this).field_d]) {
                ((dk) this).field_c = var5.field_p;
                return var5;
              } else {
                continue L1;
              }
            }
          }
        }
    }

    final static boolean c(boolean param0) {
        long var1 = 0L;
        long var3 = 0L;
        int var5 = 0;
        int var6 = 0;
        L0: {
          var6 = Chess.field_G;
          if (!param0) {
            break L0;
          } else {
            boolean discarded$1 = dk.c(false);
            break L0;
          }
        }
        var1 = ud.a(2);
        var3 = -cf.field_Jb + var1;
        if (-30001L <= (var3 ^ -1L)) {
          var5 = 3000;
          if (7 <= s.field_K) {
            var5 = 12000;
            if (var3 > (long)var5) {
              cf.field_Jb = var1;
              s.field_K = s.field_K + 1;
              return true;
            } else {
              return false;
            }
          } else {
            if ((s.field_K ^ -1) <= -6) {
              var5 = 9000;
              if (var3 > (long)var5) {
                cf.field_Jb = var1;
                s.field_K = s.field_K + 1;
                return true;
              } else {
                return false;
              }
            } else {
              if (s.field_K >= 3) {
                var5 = 6000;
                if (var3 > (long)var5) {
                  cf.field_Jb = var1;
                  s.field_K = s.field_K + 1;
                  return true;
                } else {
                  return false;
                }
              } else {
                if (var3 <= (long)var5) {
                  return false;
                } else {
                  cf.field_Jb = var1;
                  s.field_K = s.field_K + 1;
                  return true;
                }
              }
            }
          }
        } else {
          cf.field_Jb = var1;
          s.field_K = 0;
          return true;
        }
    }

    public static void b(int param0) {
        if (param0 != 12000) {
          field_l = null;
          field_l = null;
          field_e = null;
          field_f = null;
          field_k = null;
          field_h = null;
          field_a = null;
          return;
        } else {
          field_l = null;
          field_e = null;
          field_f = null;
          field_k = null;
          field_h = null;
          field_a = null;
          return;
        }
    }

    dk(int param0) {
        int var2 = 0;
        l var3 = null;
        ((dk) this).field_d = 0;
        ((dk) this).field_b = new l[param0];
        ((dk) this).field_m = param0;
        var2 = 0;
        L0: while (true) {
          if (param0 > var2) {
            l dupTemp$2 = new l();
            var3 = dupTemp$2;
            ((dk) this).field_b[var2] = dupTemp$2;
            var3.field_m = var3;
            var3.field_p = var3;
            var2++;
            continue L0;
          } else {
            return;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Chat view has been scrolled up. Scroll down to chat.";
        field_k = new java.math.BigInteger("6757747274818513864204534133465045479284128469717186816691454417744823753827902036844748836683348383638677747113757906301249837209713747402067689777172847");
        field_f = new tk();
        field_a = "Players: <%0>/<%1>";
        field_l = "You can join this game";
    }
}
