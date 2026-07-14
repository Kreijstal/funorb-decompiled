/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class mf extends r implements fj {
    static String[] field_g;
    static byte[][] field_j;
    static int[] field_h;
    private og field_i;

    abstract ok a(int param0, String param1);

    public final void a(int param0, og param1) {
        if (param0 > -111) {
            String discarded$0 = ((mf) this).b((byte) -122);
        }
    }

    public final boolean b(int param0) {
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        if (param0 == 7245) {
          if (null != ((mf) this).field_i.field_k) {
            if (((mf) this).field_i.field_k.length() == 0) {
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
          boolean discarded$7 = ((mf) this).b(-4);
          if (null == ((mf) this).field_i.field_k) {
            return true;
          } else {
            L0: {
              if (((mf) this).field_i.field_k.length() != 0) {
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

    abstract String a(String param0, int param1);

    final ok b(boolean param0) {
        if (!param0) {
            return null;
        }
        return ((mf) this).a(-1, ((mf) this).field_i.field_k);
    }

    public static void e(int param0) {
        Object var2 = null;
        field_h = null;
        if (param0 <= 18) {
          var2 = null;
          db discarded$2 = mf.a((String) null, (String) null, (kl) null, (byte) 23);
          field_j = null;
          field_g = null;
          return;
        } else {
          field_j = null;
          field_g = null;
          return;
        }
    }

    final String b(byte param0) {
        Object var3 = null;
        if (param0 >= -12) {
          var3 = null;
          ((mf) this).a(-1, (og) null);
          return ((mf) this).a(((mf) this).field_i.field_k, -1);
        } else {
          return ((mf) this).a(((mf) this).field_i.field_k, -1);
        }
    }

    public final void a(og param0, int param1) {
        if (param1 != 5) {
            ((mf) this).field_i = null;
            ((mf) this).a((byte) -112);
            return;
        }
        ((mf) this).a((byte) -112);
    }

    final static db a(String param0, String param1, kl param2, byte param3) {
        int var5 = 91 / ((-19 - param3) / 54);
        int var4 = param2.b(-1, param0);
        int var6 = param2.a(var4, param1, -11986);
        return of.a(param2, var6, (byte) -128, var4);
    }

    mf(og param0) {
        ((mf) this).field_i = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = new String[]{"Connecting to update server", "Verbinde mit Aktualisierungsserver", "Connexion au serveur de mise à jour", "Conectando ao servidor de atualização", "Met updateserver verbinden", "Connecting to update server (untranslated)"};
        field_h = new int[8192];
    }
}
