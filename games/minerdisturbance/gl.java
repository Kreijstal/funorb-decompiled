/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gl extends pi {
    static rc[] field_u;
    int[] field_s;
    int field_n;
    int[] field_p;
    ia[] field_r;
    int field_y;
    int[] field_w;
    static boolean field_o;
    static String field_t;
    byte[][][] field_v;
    ia[] field_q;
    static String[] field_x;

    final static void a(int param0, int param1) {
        if (ke.field_V) {
          if (sc.field_b) {
            ke.field_X[param0] = true;
            if (param1 != 25) {
              gl.a(-79);
              return;
            } else {
              return;
            }
          } else {
            if (param1 != 25) {
              gl.a(-79);
              return;
            } else {
              return;
            }
          }
        } else {
          if (param1 != 25) {
            gl.a(-79);
            return;
          } else {
            return;
          }
        }
    }

    public static void a(int param0) {
        field_u = null;
        field_x = null;
        if (param0 != -2869) {
            gl.a(30, 98);
            field_t = null;
            return;
        }
        field_t = null;
    }

    gl() {
    }

    static {
        field_u = new rc[25];
        field_t = "More suggestions";
        field_x = new String[]{"This more than doubles the time you can spend underwater, and volcanoes are full of water. Where do you think all the mineral water comes from?", "This more than doubles the time you can spend underwater, and the Super Volcano has plenty of ice, which is made of water. Might be some water about, don't ya think?"};
    }
}
