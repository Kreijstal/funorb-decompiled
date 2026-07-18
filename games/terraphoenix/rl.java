/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rl {
    static String field_a;
    static String[] field_b;
    static String field_c;

    final static boolean b(int param0) {
        rf.field_r = true;
        ah.field_z = 15000L + ll.a(1000);
        return q.field_Jb == 11 ? true : false;
    }

    public static void a(int param0) {
        field_b = null;
        field_a = null;
        field_c = null;
    }

    final static int a(int param0, int param1, boolean param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_8_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_7_0 = 0;
        var4 = Terraphoenix.field_V;
        try {
          L0: {
            var3_int = 1;
            L1: while (true) {
              if (param1 <= 1) {
                if (1 != param1) {
                  stackOut_9_0 = var3_int;
                  stackIn_10_0 = stackOut_9_0;
                  break L0;
                } else {
                  stackOut_7_0 = param0 * var3_int;
                  stackIn_8_0 = stackOut_7_0;
                  return stackIn_8_0;
                }
              } else {
                L2: {
                  if (0 == (1 & param1)) {
                    break L2;
                  } else {
                    var3_int = var3_int * param0;
                    break L2;
                  }
                }
                param0 = param0 * param0;
                param1 = param1 >> 1;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw qk.a((Throwable) (Object) var3, "rl.B(" + param0 + ',' + param1 + ',' + false + ')');
        }
        return stackIn_10_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = ", high explosive";
        field_c = "Left click to center on this location";
        field_b = new String[]{"Aleisha", "Alison", "Amanda", "Amellia", "Anna", "Anne", "Bianco", "Boudica", "Candice", "Carol", "Catherine", "Chardonnay", "Charity", "Chelsea", "Danella", "Elaine", "Eleanor", "Ella", "Ellen", "Emma", "Francine", "Gemma", "Hazel", "Heidi", "Ivy", "Jackie", "Joan", "Jody", "Jude", "Judy", "Julia", "Julie", "Kate", "Kirstie", "Laura", "Lilly", "Linda", "Louise", "Lucy", "Mandy", "Michelle", "Monica", "Morgan", "Nadia", "Naomi", "Olivia", "Rachel", "Rebecca", "Regatta", "Rhiannon", "Rose", "Rowena", "Sajina", "Sasha", "Sarah", "Sharon", "Siobhan", "Stacy", "Stephanie", "Susan", "Tina", "Tracey", "Vanessa", "Veronica", "Wendy", "Yi", "Yvonne", "Zaza", "Brittany", "Holly", "Helen", "Jenny", "Karen", "Megan"};
    }
}
