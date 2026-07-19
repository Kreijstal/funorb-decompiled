/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fl extends at {
    static sna field_m;
    static int field_q;
    static int[] field_j;
    static int[] field_p;
    private int field_k;
    static String[] field_o;
    private ad field_n;
    static String field_l;

    public static void b(boolean param0) {
        field_m = null;
        if (param0) {
          fl.b(true);
          field_o = null;
          field_l = null;
          field_p = null;
          field_j = null;
          return;
        } else {
          field_o = null;
          field_l = null;
          field_p = null;
          field_j = null;
          return;
        }
    }

    private final void d(byte param0) {
        if (param0 != -82) {
          L0: {
            field_p = (int[]) null;
            if (this.field_n.field_s.field_y == 31) {
              this.field_n.a(24831, 101, kna.field_g[31]);
              wf.a(34, (byte) 126);
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L1: {
            if (this.field_n.field_s.field_y == 31) {
              this.field_n.a(24831, 101, kna.field_g[31]);
              wf.a(34, (byte) 126);
              break L1;
            } else {
              break L1;
            }
          }
          return;
        }
    }

    final boolean c(byte param0) {
        int var2 = 0;
        L0: {
          if (this.field_k == 10) {
            aba.a((byte) -67, 19);
            break L0;
          } else {
            break L0;
          }
        }
        int fieldTemp$2 = this.field_k - 1;
        this.field_k = this.field_k - 1;
        if (-1 <= (fieldTemp$2 ^ -1)) {
          if ((this.field_n.field_j ^ -1) < -1) {
            return false;
          } else {
            this.d((byte) -82);
            var2 = 2 % ((param0 - 71) / 47);
            return true;
          }
        } else {
          return false;
        }
    }

    fl(gj param0, ad param1) {
        try {
            this.field_n = param1;
            this.field_n.field_f.a((byte) 18, this.field_n.field_s.field_o.field_b, 5);
            this.field_k = 25;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "fl.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_o = new String[]{"Sausage/", "Bacon/", "Chinese Takeaway/", "Indian Takeaway/", "Eggs/", "Brussel Sprouts/", "Milk/", "Cheddar/", "Strawberry Moose/", "Southern Fried Chicken/", "Mystery Meat/", "Butter/", "Baked Beans/", "Pet Food/", "Pizza/", "Sushi/", "Cake/", "Tuna/", "Espresso/", "Cola/", "Open Beer/", "Trainer/", "Banana/", "Tofu/", "Jam/", "Cereal/", "Gingerbread Man/", "Pickled Onions/", "Burger/", "Fruit Juice/", "Kebab/", "Glow Sticks/", "Caviar/", "Passion fruit/", "Roast Beef/", "Yorkshire Pudding/", "Turkey/", "Pork Pie/", "Tea/", "Scone/", "Carrot/", "Haggis/", "Hot Cross Buns/", "Kippers/", "Shellfish/", "Energy Drink/", "Cucumber/", "Mince Pie/", "Stilton cheese/", "Doughnut/"};
        field_l = "No";
    }
}
