/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ul {
    static String field_b;
    static String field_a;
    static String field_d;
    static char[] field_c;

    final static void a(la param0, int param1) {
        int dupTemp$3 = 0;
        int dupTemp$0 = 0;
        int var3 = 0;
        int incrementValue$2 = 0;
        int fieldTemp$1 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var4 = 0;
        int var5 = 0;
        int var2_intLifetime1;
        int var2_intLifetime2;
        var5 = DungeonAssault.field_K;
        try {
          var2_int = 0;
          if (param1 != -440) {
            return;
          }
          while (var2_int < 3) {
            nn.field_j[var2_int] = 0;
            var2_int++;
          }
          for (var2_intLifetime1 = 0; var2_intLifetime1 < ud.field_x; var2_intLifetime1++) {
            if (param0.field_n == nb.field_a[var2_intLifetime1].field_n) {
              dupTemp$3 = nb.field_a[var2_intLifetime1].b((byte) 115);
              nn.field_j[dupTemp$3] = nn.field_j[dupTemp$3] + 1;
            }
          }
          dupTemp$0 = param0.b((byte) 107);
          nn.field_j[dupTemp$0] = nn.field_j[dupTemp$0] + 1;
          var2_intLifetime2 = 0;
          for (var3 = 0; var3 < ud.field_x; var3++) {
            boolean decompiledFrameRemainder0 = true;
            if (nb.field_a[var3].field_n == param0.field_n) {
              var4 = nb.field_a[var3].b((byte) 104);
              if (nn.field_j[var4] > co.field_H) {
                nn.field_j[var4] = nn.field_j[var4] - 1;
                decompiledFrameRemainder0 = false;
              }
            }
            if (decompiledFrameRemainder0) {
              incrementValue$2 = var2_intLifetime2;
              var2_intLifetime2++;
              nb.field_a[incrementValue$2] = nb.field_a[var3];
            }
          }
          ud.field_x = var2_intLifetime2;
          fieldTemp$1 = ud.field_x;
          ud.field_x = ud.field_x + 1;
          nb.field_a[fieldTemp$1] = param0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_23_0 = var2;
          stackIn_23_1 = new StringBuilder().append("ul.A(");
          if (param0 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void a(boolean param0) {
        field_a = null;
        field_b = null;
        if (!param0) {
          return;
        }
        field_d = null;
        field_c = null;
    }

    static {
        field_b = "Data server full or too many connections from your address. Please try again in a few minutes.";
        field_a = "A room full of large, maggot-like creatures; their bile can burn through raiders' armour in seconds, inflicting permanent injury.<br><br>Defeated raiders permanently lose 1 <%attack>.";
        field_c = new char[]{(char)91, (char)93, (char)35};
    }
}
