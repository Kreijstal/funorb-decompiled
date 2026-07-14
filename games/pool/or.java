/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class or {
    byte field_n;
    byte field_g;
    or field_d;
    static int field_b;
    static int field_l;
    boolean field_c;
    or field_f;
    private byte field_e;
    static String field_j;
    or field_i;
    static String field_m;
    static int field_a;
    static int field_h;
    static String[] field_k;

    public static void a(boolean param0) {
        field_m = null;
        if (param0) {
            return;
        }
        field_k = null;
        field_j = null;
    }

    final static byte[] a(Object param0, int param1, boolean param2) {
        byte[] var3 = null;
        mb var4 = null;
        if (param1 == -19261) {
          if (param0 != null) {
            if (!(param0 instanceof byte[])) {
              if (param0 instanceof mb) {
                var4 = (mb) param0;
                return var4.a(33);
              } else {
                throw new IllegalArgumentException();
              }
            } else {
              var3 = (byte[]) param0;
              if (!param2) {
                return var3;
              } else {
                return jj.a(var3, (byte) 91);
              }
            }
          } else {
            return null;
          }
        } else {
          field_j = null;
          if (param0 != null) {
            if (!(param0 instanceof byte[])) {
              if (param0 instanceof mb) {
                var4 = (mb) param0;
                return var4.a(33);
              } else {
                throw new IllegalArgumentException();
              }
            } else {
              var3 = (byte[]) param0;
              if (!param2) {
                return var3;
              } else {
                return jj.a(var3, (byte) 91);
              }
            }
          } else {
            return null;
          }
        }
    }

    final String b(byte param0) {
        int var2 = 0;
        if (param0 >= 108) {
          var2 = ((or) this).field_n;
          if (var2 != 0) {
            if (var2 != 1) {
              if (2 != var2) {
                if (var2 != 3) {
                  if (var2 != 4) {
                    if (var2 == 5) {
                      return "pocket " + ((or) this).field_e;
                    } else {
                      return "invalid";
                    }
                  } else {
                    return "point " + ((or) this).field_e;
                  }
                } else {
                  return "wall " + ((or) this).field_e;
                }
              } else {
                return "ball " + ((or) this).field_e;
              }
            } else {
              return "stop";
            }
          } else {
            return "unresolved";
          }
        } else {
          return null;
        }
    }

    final void a(boolean param0, pq param1) {
        ((or) this).field_n = (byte) 1;
        if (param0) {
            field_m = null;
        }
    }

    final void a(int param0, int param1, pq param2) {
        ((or) this).field_n = (byte) 3;
        ((or) this).field_e = (byte)param0;
        ((or) this).field_i = new or((int) ((or) this).field_g, (or) this);
        if (param1 != -26401) {
          return;
        } else {
          param2.field_q = ((or) this).field_i;
          return;
        }
    }

    final void a(pq[] param0, int param1, int param2) {
        pq var6 = param0[param1];
        pq var4 = var6;
        pq var5 = param0[((or) this).field_g];
        ((or) this).field_i = new or((int) ((or) this).field_g, (or) this);
        if (param2 != -5) {
            return;
        }
        ((or) this).field_d = new or(param1, (or) this);
        ((or) this).field_e = (byte)param1;
        ((or) this).field_n = (byte) 2;
        if (var6.field_q == null) {
            var5.field_q = ((or) this).field_i;
            var4.field_q = ((or) this).field_d;
            return;
        }
        if (-1 != (var6.field_q.field_n ^ -1)) {
            var5.field_q = ((or) this).field_i;
            var4.field_q = ((or) this).field_d;
            return;
        }
        var6.field_q.field_e = ((or) this).field_g;
        var6.field_q.field_n = (byte) 2;
        var6.field_q.field_d = ((or) this).field_i;
        var5.field_q = ((or) this).field_i;
        var4.field_q = ((or) this).field_d;
    }

    final void a(pq param0, int param1, byte param2) {
        ((or) this).field_e = (byte)param1;
        ((or) this).field_n = (byte) 4;
        ((or) this).field_i = new or((int) ((or) this).field_g, (or) this);
        if (param2 != 5) {
          return;
        } else {
          param0.field_q = ((or) this).field_i;
          return;
        }
    }

    final static boolean a(byte param0, String param1) {
        CharSequence var3 = null;
        CharSequence var4 = null;
        if (param0 != 3) {
          field_a = 37;
          var3 = (CharSequence) (Object) param1;
          return oj.field_y.equals((Object) (Object) hq.a(73, var3));
        } else {
          var4 = (CharSequence) (Object) param1;
          return oj.field_y.equals((Object) (Object) hq.a(73, var4));
        }
    }

    final int a(byte param0) {
        int var2 = 0;
        int stackIn_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        L0: {
          if (0 == ((or) this).field_g) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var2 = stackIn_3_0;
          if (((or) this).field_i != null) {
            var2 = var2 + ((or) this).field_i.a((byte) 2);
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          if (((or) this).field_d != null) {
            var2 = var2 + ((or) this).field_d.a((byte) 2);
            break L2;
          } else {
            break L2;
          }
        }
        if (param0 != 2) {
          or.a(true);
          return var2;
        } else {
          return var2;
        }
    }

    final boolean a(int param0, bf[] param1) {
        bf var3 = null;
        int stackIn_6_0 = 0;
        int stackIn_17_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        if (param0 == -5877) {
          if (3 != ((or) this).field_n) {
            if ((((or) this).field_n ^ -1) != -5) {
              return false;
            } else {
              return true;
            }
          } else {
            var3 = param1[((or) this).field_e];
            if (1 != var3.field_b) {
              if (var3.field_d == 1) {
                return true;
              } else {
                return false;
              }
            } else {
              stackOut_15_0 = 1;
              stackIn_17_0 = stackOut_15_0;
              return stackIn_17_0 != 0;
            }
          }
        } else {
          int discarded$6 = ((or) this).a((byte) -36);
          if (3 != ((or) this).field_n) {
            if ((((or) this).field_n ^ -1) != -5) {
              return false;
            } else {
              return true;
            }
          } else {
            var3 = param1[((or) this).field_e];
            if (1 == var3.field_b) {
              return true;
            } else {
              L0: {
                if (var3.field_d != 1) {
                  stackOut_5_0 = 0;
                  stackIn_6_0 = stackOut_5_0;
                  break L0;
                } else {
                  stackOut_4_0 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  break L0;
                }
              }
              return stackIn_6_0 != 0;
            }
          }
        }
    }

    final static void c(byte param0) {
        String var1 = null;
        String var2 = null;
        L0: {
          if (null != nl.field_d) {
            var2 = nl.field_d;
            var1 = var2;
            pn.a((byte) 75, nr.a(new String[1], -1, lf.field_e));
            nl.field_d = null;
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 != 4) {
          field_m = null;
          return;
        } else {
          return;
        }
    }

    final void a(int param0, pq param1, int param2) {
        Object var5 = null;
        if (param0 != 23655) {
          var5 = null;
          ((or) this).a((pq) null, 49, (byte) -122);
          ((or) this).field_n = (byte) 5;
          ((or) this).field_e = (byte)param2;
          return;
        } else {
          ((or) this).field_n = (byte) 5;
          ((or) this).field_e = (byte)param2;
          return;
        }
    }

    or(int param0, or param1) {
        ((or) this).field_d = null;
        ((or) this).field_c = false;
        ((or) this).field_n = (byte) 0;
        ((or) this).field_e = (byte) 0;
        ((or) this).field_i = null;
        ((or) this).field_g = (byte)param0;
        ((or) this).field_f = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = "Accept invitation to <%0>'s game";
        field_j = "Searching for an opponent";
        field_k = new String[]{"<col=ffffff>Cue ball</col>", "<col=ffff99>1 One</col>", "<col=9999ff>2 Two</col>", "<col=ff9999>3 Three</col>", "<col=cc99ff>4 Four</col>", "<col=ffcc99>5 Five</col>", "<col=99ff99>6 Six</col>", "<col=cc9966>7 Seven</col>", "<col=999999>8 Eight</col>", "<col=ffff99>9 Nine!</col>"};
    }
}
