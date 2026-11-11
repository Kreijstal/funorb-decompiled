/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ColourRowCache {
    private dq[] field_k;
    static it field_d;
    private int field_g;
    private int field_c;
    private int field_e;
    static int field_b;
    private IntrusiveDeque field_h;
    private int[][][] field_a;
    static String field_j;
    private int field_i;
    boolean field_f;

    final int[][][] getAllRows(byte param0) {
        int var3 = 0;
        int var4 = TombRacer.field_G ? 1 : 0;
        int var2 = -59 % ((param0 - 3) / 52);
        if (this.field_c != this.field_e) {
          throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (var3 = 0; var3 < this.field_e; var3++) {
          this.field_k[var3] = LegacySwitchModel.field_n;
        }
        return this.field_a;
    }

    final int[][] getRow(int param0, byte param1) {
        boolean stackIn_4_1 = false;
        boolean stackIn_9_1 = false;
        int var3;
        dq var4;
        dq var5;
        int var6;
        dq var5Lifetime1;
        dq var5Lifetime2;
        var6 = TombRacer.field_G ? 1 : 0;
        var3 = 89 / ((param1 - 61) / 38);
        if (this.field_c == this.field_e) {
          stackIn_4_1 = (this.field_k[param0] == null);
          this.field_f = stackIn_4_1;
          this.field_k[param0] = LegacySwitchModel.field_n;
          return this.field_a[param0];
        }
        if (this.field_e == 1) {
          stackIn_9_1 = (this.field_i != param0);
          this.field_f = stackIn_9_1;
          this.field_i = param0;
          return this.field_a[0];
        }
        var4 = this.field_k[param0];
        var5 = var4;
        var5Lifetime1 = var4;
        if (var4 == null) {
          this.field_f = true;
          if (this.field_g < this.field_e) {
            var4 = new dq(param0, this.field_g);
            this.field_g = this.field_g + 1;
          } else {
            var5Lifetime2 = (dq) (this.field_h.last(3));
            var4 = new dq(param0, var5Lifetime2.field_g);
            this.field_k[var5Lifetime2.field_i] = null;
            var5Lifetime2.unlink(63);
          }
          this.field_k[param0] = var4;
        } else {
          this.field_f = false;
        }
        this.field_h.addFirst((byte) 116, (IntrusiveNode) (var4));
        return this.field_a[var4.field_g];
    }

    final static int a(int param0, byte param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_9_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = TombRacer.field_G ? 1 : 0;
        try {
          var3_int = 0;
          if (param1 != -113) {
            field_j = (String) null;
          }
          var4 = wp.field_b;
          while (cna.field_b.length > var3_int) {
            var5 = ComponentTargetList.field_c[var3_int];
            if (var5 >= 0) {
              var6 = apa.$cfr$intArgs$a$62abead39cee(-50, true, cna.field_b[var3_int]);
              var7 = Transform3D.field_a - (var6 >> 1);
              var4 = var4 + aqa.field_a;
              if (CrusherBehaviour.rectContainsPoint(param2, var6 + (S2CCharacterChoicePacket.field_a << 1), var7 - S2CCharacterChoicePacket.field_a, param0, FurnitureModel.field_n + (RenderLayer.field_d << 1), false, var4)) {
                stackIn_9_0 = var5;
                return stackIn_9_0;
              }
              var4 = var4 + ((RenderLayer.field_d << 1) + (aqa.field_a + FurnitureModel.field_n));
            } else {
              var4 = var4 + CharacterSelectPhase.field_x;
            }
            var3_int++;
          }
          stackIn_13_0 = -1;
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw tba.wrapException((Throwable) ((Object) var3), "fk.C(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void release(int param0) {
        int var3 = TombRacer.field_G ? 1 : 0;
        int var2 = 0;
        if (param0 != 2) {
          this.getAllRows((byte) 23);
        }
        while (var2 < this.field_e) {
          this.field_a[var2][0] = null;
          this.field_a[var2][1] = null;
          this.field_a[var2][2] = null;
          this.field_a[var2] = (int[][]) null;
          var2++;
        }
        this.field_a = (int[][][]) null;
        this.field_k = null;
        this.field_h.clear(8);
        this.field_h = null;
    }

    public static void releaseStatics(int param0) {
        field_j = null;
        if (param0 >= -101) {
          return;
        }
        field_d = null;
    }

    ColourRowCache(int param0, int param1, int param2) {
        this.field_g = 0;
        this.field_i = -1;
        this.field_h = new IntrusiveDeque();
        this.field_f = false;
        this.field_c = param1;
        this.field_e = param0;
        this.field_a = new int[this.field_e][3][param2];
        this.field_k = new dq[this.field_c];
    }

    static {
        field_j = "The temple door creaks open... <br>Use <img=4><img=7><img=6><img=5> or <img=0><img=1><img=2><img=3> to reach the chamber exit to the north.";
        field_d = new it();
    }
}
