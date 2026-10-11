/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rl {
    static String field_a;
    static String[] field_b;
    static String field_c;

    final static boolean b(int param0) {
        rf.field_r = true;
        if (param0 == 0) {
          ah.field_z = 15000L + ll.a(param0 + 1000);
          return q.field_Jb == 11 ? true : false;
        }
        rl.a(-78);
        ah.field_z = 15000L + ll.a(param0 + 1000);
        return q.field_Jb == 11 ? true : false;
    }

    public static void a(int param0) {
        field_b = null;
        field_a = null;
        if (param0 != -19959) {
          return;
        }
        field_c = null;
    }

    final static int a(int param0, int param1, boolean param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_12_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Terraphoenix.field_V;
        try {
          if (param2) {
            field_b = (String[]) null;
          }
          var3_int = 1;
          while (param1 > 1) {
            if (0 != (1 & param1)) {
              var3_int = var3_int * param0;
            }
            param0 = param0 * param0;
            param1 = param1 >> 1;
          }
          if (1 != param1) {
            stackIn_14_0 = var3_int;
            return stackIn_14_0;
          }
          stackIn_12_0 = param0 * var3_int;
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw qk.a((Throwable) ((Object) var3), "rl.B(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_a = ", high explosive";
        field_c = "Left click to center on this location";
        field_b = new String[]{"Aleisha", "Alison", "Amanda", "Amellia", "Anna", "Anne", "Bianco", "Boudica", "Candice", "Carol", "Catherine", "Chardonnay", "Charity", "Chelsea", "Danella", "Elaine", "Eleanor", "Ella", "Ellen", "Emma", "Francine", "Gemma", "Hazel", "Heidi", "Ivy", "Jackie", "Joan", "Jody", "Jude", "Judy", "Julia", "Julie", "Kate", "Kirstie", "Laura", "Lilly", "Linda", "Louise", "Lucy", "Mandy", "Michelle", "Monica", "Morgan", "Nadia", "Naomi", "Olivia", "Rachel", "Rebecca", "Regatta", "Rhiannon", "Rose", "Rowena", "Sajina", "Sasha", "Sarah", "Sharon", "Siobhan", "Stacy", "Stephanie", "Susan", "Tina", "Tracey", "Vanessa", "Veronica", "Wendy", "Yi", "Yvonne", "Zaza", "Brittany", "Holly", "Helen", "Jenny", "Karen", "Megan"};
    }
}
