/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class aba extends pk implements fca {
    static boolean field_f;
    private lka field_e;

    final jg c(byte param0) {
        if (param0 != 35) {
          field_f = true;
          return ((aba) this).a(((aba) this).field_e.field_w, false);
        } else {
          return ((aba) this).a(((aba) this).field_e.field_w, false);
        }
    }

    public final boolean b(byte param0) {
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        if (param0 == 5) {
          if (null != ((aba) this).field_e.field_w) {
            if (((aba) this).field_e.field_w.length() == 0) {
              return true;
            } else {
              return false;
            }
          } else {
            stackOut_9_0 = 1;
            stackIn_11_0 = stackOut_9_0;
            return stackIn_11_0 != 0;
          }
        } else {
          field_f = true;
          if (null == ((aba) this).field_e.field_w) {
            return true;
          } else {
            L0: {
              if (((aba) this).field_e.field_w.length() != 0) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L0;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L0;
              }
            }
            return stackIn_5_0 != 0;
          }
        }
    }

    final static kv[] a(kv param0, boolean param1) {
        kv[] var2 = null;
        Object var3 = null;
        kv[] var4 = null;
        if (!param1) {
          var3 = null;
          kv[] discarded$2 = aba.a((kv) null, true);
          var4 = new kv[9];
          var2 = var4;
          var4[4] = param0;
          return var2;
        } else {
          var4 = new kv[9];
          var2 = var4;
          var4[4] = param0;
          return var2;
        }
    }

    public final void a(lka param0, byte param1) {
        int var3 = 96 % ((param1 - 0) / 49);
        ((aba) this).a(574);
    }

    final String d(byte param0) {
        if (param0 < 97) {
            return null;
        }
        return ((aba) this).a((byte) 112, ((aba) this).field_e.field_w);
    }

    final static void a(byte param0, int param1) {
        int var2 = 84 % ((param0 - -18) / 34);
        cq discarded$0 = ol.a(jga.field_y[param1], true);
    }

    public final void a(lka param0, int param1) {
        if (param1 != 0) {
            jg discarded$0 = ((aba) this).c((byte) 6);
        }
    }

    final static pp a(lu param0, int param1) {
        if (param1 != 9) {
            Object var3 = null;
            pp discarded$0 = aba.a((lu) null, 85);
            return (pp) (Object) new eba();
        }
        return (pp) (Object) new eba();
    }

    abstract jg a(String param0, boolean param1);

    abstract String a(byte param0, String param1);

    aba(lka param0) {
        ((aba) this).field_e = param0;
    }

    static {
    }
}
