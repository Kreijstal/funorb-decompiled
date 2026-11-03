/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class Puzzle {
    int columns;
    int field_b;
    int field_n;
    int field_e;
    int rows;
    int borderFlags;
    boolean field_i;
    private static long[] field_c;
    int field_h;
    IndexedSprite[] pictures;
    int field_g;
    int pictureIndex;
    int field_j;
    static String field_m;
    static String field_a;
    static String field_f;

    final static wm[] b(byte param0) {
        if (param0 != 62) {
          Puzzle.a('￑', (byte) 81);
        }
        return new wm[]{SectorCacheStore.field_f, ej.field_b, StatefulTextPainter.field_w, NumericDateInputWidget.field_T, lb.field_r, DualLinkNode.field_l, lb.field_C, ArchiveRequest.field_u, MenuInputState.field_f, of.field_e, kn.field_M, u.field_d, GradientOutlineTextPainter.field_s, ThreeSliceButtonPainter.field_u};
    }

    final void shufflePictures(byte param0, Random param1) {
        int var3_int = 0;
        int[] var12 = null;
        int[] var11 = null;
        int[] var4 = null;
        int var9 = 0;
        IndexedSprite[] var5 = null;
        int var10 = 0;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = Pixelate.field_H ? 1 : 0;
        int var5_intLifetime1;
        int var6Lifetime1;
        int var7Lifetime1;
        try {
          var3_int = this.pictures.length;
          var12 = new int[var3_int];
          var11 = var12;
          var4 = var11;
          for (var5_int = 0; var3_int > var5_int; var5_int++) {
            var12[var5_int] = var5_int;
          }
          var9 = 0;
          var5_intLifetime1 = var9;
          while (var9 < var3_int) {
            var6 = var9 + ok.a(param1, -120, var3_int - var9);
            var7 = var12[var9];
            var4[var9] = var12[var6];
            var12[var6] = var7;
            var9++;
          }
          var6Lifetime1 = -119 % ((param0 + 53) / 60);
          var5 = new IndexedSprite[var3_int];
          var10 = 0;
          var7Lifetime1 = var10;
          while (var3_int > var10) {
            var5[var10] = this.pictures[var12[var10]];
            var10++;
          }
          this.pictures = var5;
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "dd.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void b(int param0) {
        field_m = null;
        field_a = null;
        field_c = null;
        int var1 = -83 / ((-64 - param0) / 47);
        field_f = null;
    }

    final boolean advancePicture(byte param0) {
        if (param0 > -113) {
          field_a = (String) null;
        }
        int fieldTemp$0 = this.pictureIndex + 1;
        this.pictureIndex = this.pictureIndex + 1;
        return fieldTemp$0 == this.pictures.length ? true : false;
    }

    final static String[] a(String param0, byte param1, char param2) {
        int var7 = 0;
        int incrementValue$1 = 0;
        int var3_int = 0;
        RuntimeException var3 = null;
        String[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var8 = 0;
        int var9 = 0;
        String var10 = null;
        CharSequence var11 = null;
        String[] stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var9 = Pixelate.field_H ? 1 : 0;
        try {
          var11 = (CharSequence) ((Object) param0);
          var3_int = FallingPieceView.a(0, param2, var11);
          var4 = new String[var3_int + 1];
          var5 = 0;
          var6 = 0;
          for (var7 = 0; var3_int > var7; var7++) {
            for (var8 = var6; param2 != param0.charAt(var8); var8++) {
            }
            incrementValue$1 = var5;
            var5++;
            var4[incrementValue$1] = param0.substring(var6, var8);
            var6 = 1 + var8;
          }
          var4[var3_int] = param0.substring(var6);
          if (param1 > -28) {
            var10 = (String) null;
            Puzzle.a((String) null, (byte) -32, 'k');
          }
          stackIn_10_0 = var4;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("dd.G(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static boolean a(char param0, byte param1) {
        boolean stackIn_13_0 = false;
        if (param1 < 44) {
          Puzzle.a('ﾰ', (byte) -89);
        }
        stackIn_13_0 = ((!(param0 < 48) &&
          !(param0 > 57)) ||
          (!(param0 < 65) &&
          !(param0 > 90)) ||
          (!(param0 < 97) &&
          !(122 < param0)));
        return stackIn_13_0;
    }

    final static String a(int param0) {
        String var1 = "";
        if (nf.field_b != null) {
          var1 = nf.field_b.l(-24832);
        }
        if (param0 == var1.length()) {
          var1 = DiskCacheRequest.b(false);
        }
        if (var1.length() == 0) {
          var1 = cd.field_d;
        }
        return var1;
    }

    Puzzle(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, IndexedSprite[] param8) {
        try {
          this.pictures = param8;
          if ((30 & param2) == 30) {
            this.field_i = true;
          }
          this.field_e = 10 * param7;
          this.field_b = param6;
          this.borderFlags = param2;
          this.field_h = param3;
          this.rows = param1;
          this.field_n = param4;
          this.field_j = param5;
          this.field_g = param1 * param0;
          this.columns = param0;
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "dd.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + (param8 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        int var2 = 0;
        int var3 = 0;
        long var0;
        field_c = new long[256];
        for (var2 = 0; var2 < 256; var2++) {
          var0 = (long)var2;
          for (var3 = 0; var3 < 8; var3++) {
            if ((var0 & 1L) != 1L) {
              var0 = var0 >>> 1;
            } else {
              var0 = var0 >>> 1 ^ -3932672073523589310L;
            }
          }
          field_c[var2] = var0;
        }
        field_m = "All players have left <%0>'s game.";
        field_f = "Type your password again to make sure it's correct";
    }
}
