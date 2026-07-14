/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class faa implements fo {
    static String field_g;
    int field_e;
    int field_b;
    vsa field_c;
    int field_d;
    bua field_f;
    int field_a;

    public final void f(int param0) {
        if (param0 != -4366) {
            ((faa) this).field_a = 43;
        }
    }

    final static boolean a(String param0, int param1, String param2) {
        String var3 = null;
        String var4 = null;
        CharSequence var5 = null;
        CharSequence var6 = null;
        CharSequence var7 = null;
        CharSequence var8 = null;
        if (param1 > 67) {
          var7 = (CharSequence) (Object) param0;
          var3 = jd.a(1, var7);
          var8 = (CharSequence) (Object) param2;
          var4 = jd.a(1, var8);
          if (var3 != null) {
            if (var3 != null) {
              if (var4 == null) {
                return false;
              } else {
                return var3.equals((Object) (Object) var4);
              }
            } else {
              return false;
            }
          } else {
            if (var4 != null) {
              if (var3 != null) {
                if (var4 == null) {
                  return false;
                } else {
                  return var3.equals((Object) (Object) var4);
                }
              } else {
                return false;
              }
            } else {
              return true;
            }
          }
        } else {
          faa.a(true);
          var5 = (CharSequence) (Object) param0;
          var3 = jd.a(1, var5);
          var6 = (CharSequence) (Object) param2;
          var4 = jd.a(1, var6);
          if (var3 == null) {
            if (var4 == null) {
              return true;
            } else {
              if (var3 != null) {
                if (var4 == null) {
                  return false;
                } else {
                  return var3.equals((Object) (Object) var4);
                }
              } else {
                return false;
              }
            }
          } else {
            if (var3 != null) {
              if (var4 == null) {
                return false;
              } else {
                return var3.equals((Object) (Object) var4);
              }
            } else {
              return false;
            }
          }
        }
    }

    public final int b(byte param0) {
        int var3 = 0;
        int var2 = 3 % ((param0 - -23) / 53);
        if (((faa) this).field_b == 0) {
            var3 = 0;
        } else {
            var3 = ((faa) this).field_c.o((byte) 122);
        }
        return var3 + (((faa) this).field_c.b((byte) -86) - -((faa) this).field_d);
    }

    public static void a(boolean param0) {
        if (param0) {
            Object var2 = null;
            boolean discarded$0 = faa.a((String) null, -123, (String) null);
            field_g = null;
            return;
        }
        field_g = null;
    }

    public final int c(byte param0) {
        int var2 = 0;
        L0: {
          if (((faa) this).field_b != 0) {
            var2 = ((faa) this).field_c.p((byte) 68);
            break L0;
          } else {
            var2 = 0;
            break L0;
          }
        }
        if (param0 < 91) {
          return 78;
        } else {
          return ((faa) this).field_c.c((byte) 124) - -((faa) this).field_a - -var2;
        }
    }

    public final boolean d(byte param0) {
        if (param0 != 48) {
            field_g = null;
            return ((faa) this).field_c.d((byte) 48);
        }
        return ((faa) this).field_c.d((byte) 48);
    }

    public final int e(byte param0) {
        if (param0 <= -86) {
          if (-1 == ((faa) this).field_b) {
            return 0;
          } else {
            return ((faa) this).field_c.e((byte) -104);
          }
        } else {
          faa.a(true);
          if (-1 == ((faa) this).field_b) {
            return 0;
          } else {
            return ((faa) this).field_c.e((byte) -104);
          }
        }
    }

    public final void a(int param0, iq param1) {
        gr var4 = null;
        gr var5 = null;
        if (param0 > 103) {
          var5 = ((faa) this).field_c.c(-98);
          if (var5 != null) {
            if (var5.a(-127)) {
              if (null == ((faa) this).field_f) {
                return;
              } else {
                gqa.a(((faa) this).field_e, -83584144, ((faa) this).c((byte) 105), ((faa) this).b((byte) -102), ((faa) this).field_f.b((byte) 74), ((faa) this).e((byte) -98));
                return;
              }
            } else {
              return;
            }
          } else {
            if (null == ((faa) this).field_f) {
              return;
            } else {
              gqa.a(((faa) this).field_e, -83584144, ((faa) this).c((byte) 105), ((faa) this).b((byte) -102), ((faa) this).field_f.b((byte) 74), ((faa) this).e((byte) -98));
              return;
            }
          }
        } else {
          ((faa) this).field_f = null;
          var4 = ((faa) this).field_c.c(-98);
          if (var4 != null) {
            if (var4.a(-127)) {
              if (null == ((faa) this).field_f) {
                return;
              } else {
                gqa.a(((faa) this).field_e, -83584144, ((faa) this).c((byte) 105), ((faa) this).b((byte) -102), ((faa) this).field_f.b((byte) 74), ((faa) this).e((byte) -98));
                return;
              }
            } else {
              return;
            }
          } else {
            if (null == ((faa) this).field_f) {
              return;
            } else {
              gqa.a(((faa) this).field_e, -83584144, ((faa) this).c((byte) 105), ((faa) this).b((byte) -102), ((faa) this).field_f.b((byte) 74), ((faa) this).e((byte) -98));
              return;
            }
          }
        }
    }

    static {
    }
}
