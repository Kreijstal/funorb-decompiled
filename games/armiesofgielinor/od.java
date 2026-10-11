/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class od {
    static RgbSprite[] field_a;
    static String field_h;
    static String field_e;
    static RgbSprite[] field_d;
    static String field_f;
    static int field_b;
    static String field_g;
    static boolean[] field_c;

    final synchronized static byte[] a(int param0, int param1) {
        int fieldTemp$0 = 0;
        byte[][] fieldTemp$1 = null;
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        int var2 = 0;
        int dupTemp$4 = 0;
        byte[][] arrayValue$5 = null;
        byte[] var2_ref_byte__;
        byte[] var3;
        byte[] var2_ref_byte__Lifetime1;
        byte[] var2_ref_byte__Lifetime2;
        if (param0 == 100 &&
          af.field_b > 0) {
          fieldTemp$0 = af.field_b - 1;
          af.field_b = af.field_b - 1;
          var2_ref_byte__ = ut.field_W[fieldTemp$0];
          ut.field_W[af.field_b] = null;
          return var2_ref_byte__;
        }
        if (param0 == 5000 &&
          0 < ul.field_d) {
          fieldTemp$1 = oo.field_d;
          fieldTemp$2 = ul.field_d - 1;
          ul.field_d = ul.field_d - 1;
          var2_ref_byte__Lifetime1 = fieldTemp$1[fieldTemp$2];
          oo.field_d[ul.field_d] = null;
          return var2_ref_byte__Lifetime1;
        }
        if (param0 == 30000 &&
          GameEvent.field_v > 0) {
          fieldTemp$3 = GameEvent.field_v - 1;
          GameEvent.field_v = GameEvent.field_v - 1;
          var2_ref_byte__Lifetime2 = dh.field_j[fieldTemp$3];
          dh.field_j[GameEvent.field_v] = null;
          return var2_ref_byte__Lifetime2;
        }
        if (param1 != 50) {
          return (byte[]) null;
        }
        if (PacketBuffer.field_k != null) {
          for (var2 = 0; var2 < NodeDeque.field_b.length; var2++) {
            if (NodeDeque.field_b[var2] == param0 &&
              TileMetadata.field_a[var2] > 0) {
              dupTemp$4 = TileMetadata.field_a[var2] - 1;
              arrayValue$5 = PacketBuffer.field_k[var2];
              TileMetadata.field_a[var2] = dupTemp$4;
              var3 = arrayValue$5[dupTemp$4];
              PacketBuffer.field_k[var2][TileMetadata.field_a[var2]] = null;
              return var3;
            }
          }
        }
        return new byte[param0];
    }

    final static String[] a(int param0, String param1) {
        Object var2 = null;
        String[] var2_array = null;
        RuntimeException var2_ref = null;
        String[] var3 = null;
        Object stackIn_4_0 = null;
        Object stackIn_7_0 = null;
        String[] stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -16399) {
            od.a(36);
          }
          var2 = null;
          if (param1.length() == 1) {
            stackIn_4_0 = null;
            return (String[]) (stackIn_4_0);
          }
          var3 = dj.a(77, ' ', param1);
          var2_array = var3;
          if (var3.length != 1) {
            stackIn_9_0 = var2_array;
            return stackIn_9_0;
          }
          stackIn_7_0 = null;
          return (String[]) (stackIn_7_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_12_0 = var2_ref;
          stackIn_12_1 = new StringBuilder().append("od.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_d = null;
        field_e = null;
        field_f = null;
        field_h = null;
        field_g = null;
        field_c = null;
        field_a = null;
        if (param0 != -1) {
          field_e = (String) null;
        }
    }

    final synchronized static void a(int param0, byte[] param1) {
        int fieldTemp$0 = 0;
        byte[][] fieldTemp$1 = null;
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        int var2_int = 0;
        int dupTemp$4 = 0;
        byte[][] arrayValue$5 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        var3 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (param1.length == 100 &&
            af.field_b < 1000) {
            fieldTemp$0 = af.field_b;
            af.field_b = af.field_b + 1;
            ut.field_W[fieldTemp$0] = param1;
            return;
          }
          if (param1.length == 5000 &&
            ul.field_d < 250) {
            fieldTemp$1 = oo.field_d;
            fieldTemp$2 = ul.field_d;
            ul.field_d = ul.field_d + 1;
            fieldTemp$1[fieldTemp$2] = param1;
            return;
          }
          if (~param1.length == param0 &&
            GameEvent.field_v < 50) {
            fieldTemp$3 = GameEvent.field_v;
            GameEvent.field_v = GameEvent.field_v + 1;
            dh.field_j[fieldTemp$3] = param1;
            return;
          }
          if (PacketBuffer.field_k != null) {
            for (var2_int = 0; NodeDeque.field_b.length > var2_int; var2_int++) {
              if (NodeDeque.field_b[var2_int] == param1.length &&
                PacketBuffer.field_k[var2_int].length > TileMetadata.field_a[var2_int]) {
                dupTemp$4 = TileMetadata.field_a[var2_int];
                arrayValue$5 = PacketBuffer.field_k[var2_int];
                TileMetadata.field_a[var2_int] = dupTemp$4 + 1;
                arrayValue$5[dupTemp$4] = param1;
                return;
              }
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_26_0 = var2;
          stackIn_26_1 = new StringBuilder().append("od.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(')').toString());
        }
    }

    static {
        field_f = "Army Setup";
        field_h = "Names can only contain letters, numbers, spaces and underscores";
        field_c = new boolean[]{false, true, true, false, true, true};
        field_e = "to keep fullscreen or";
        field_g = "Training";
    }
}
