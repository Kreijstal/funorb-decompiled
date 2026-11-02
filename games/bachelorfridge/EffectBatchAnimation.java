/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class EffectBatchAnimation extends AnimationNode {
    private EffectBatch field_j;
    static String field_m;
    private int field_k;
    private BattleScreen field_l;

    final boolean isFinished(byte param0) {
        EventEffect var2;
        int var3;
        CreatureActor var3_ref_ad;
        MoveDefinition var4;
        int var5;
        var5 = BachelorFridge.field_y;
        int fieldTemp$0 = this.field_k - 1;
        this.field_k = this.field_k - 1;
        if (0 < fieldTemp$0) {
          return false;
        }
        var2 = (EventEffect) (this.field_j.field_m.b((byte) 90));
        while (true) {
          if (var2 == null) {
            var3 = -99 % ((param0 - 71) / 47);
            return true;
          }
          if (null == var2.target) {
            var2 = (EventEffect) (this.field_j.field_m.c(0));
            continue;
          }
          var3_ref_ad = var2.target.a(-27449, this.field_l);
          if (var3_ref_ad != null) {
            var2.apply((BattleCreature) null, this.field_l.field_h, 12);
            if (var2 instanceof mh) {
              this.addChild(27799, new jk(this.field_l, var3_ref_ad, (mh) (var2)));
            }
            if (!(var2 instanceof ks)) {
              if (var2 instanceof kt) {
                var4 = al.a(101, var3_ref_ad.field_s.field_o.field_g.field_b[var3_ref_ad.field_s.field_m[((kt) (var2)).field_l]]);
                if (this.field_l.field_n == var3_ref_ad.field_s.ownerIndex) {
                  var3_ref_ad.a(24831, 97, lga.a(true, new String[]{var4.name}, rh.field_a));
                }
              } else {
                if (var2.field_f >= 0) {
                  if (0 >= var2.field_f) {
                    if (var2 instanceof lia) {
                      if (-1 == ((lia) (var2)).field_k) {
                        var2 = (EventEffect) (this.field_j.field_m.c(0));
                        continue;
                      }
                      var3_ref_ad.a(24831, 17, kna.field_g[((lia) (var2)).field_k]);
                    }
                  } else {
                    this.addChild(27799, new ek(this.field_l, var3_ref_ad, var2.field_f));
                  }
                } else {
                  var3_ref_ad.a(65280, 22, Integer.toString(-var2.field_f));
                }
              }
            } else {
              var3_ref_ad.a(65280, 63, hs.field_c);
            }
          }
          var2 = (EventEffect) (this.field_j.field_m.c(0));
        }
    }

    public static void releaseStatics(int param0) {
        if (param0 != 24831) {
          return;
        }
        field_m = null;
    }

    EffectBatchAnimation(BattleScreen param0, EffectBatch param1) {
        try {
          this.field_l = param0;
          this.field_k = 25;
          this.field_j = param1;
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "jma.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_m = "Resign";
    }
}
