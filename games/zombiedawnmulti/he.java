/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class he implements nl {
    static String[] field_b;
    private int field_j;
    static String field_c;
    private int field_h;
    static cj field_i;
    static boolean field_a;
    static th field_k;
    private fm field_g;
    static ul field_f;
    static long field_e;
    static String[][] field_d;

    public final void a(boolean param0, int param1, int param2, int param3, cf param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          var11 = ZombieDawnMulti.field_E ? 1 : 0;
          if (param2 == -15112) {
            break L0;
          } else {
            field_k = null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (param4.field_l) {
              break L2;
            } else {
              if (param4.c(param2 ^ -15226)) {
                break L2;
              } else {
                stackOut_4_0 = 2188450;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = 3249872;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        L3: {
          var6 = stackIn_6_0;
          int discarded$1 = ((he) this).field_g.a("<u=" + Integer.toString(var6, 16) + ">" + param4.field_j + "</u>", param3 - -param4.field_y, param4.field_i + param1, param4.field_n, param4.field_w, var6, -1, ((he) this).field_j, ((he) this).field_h, ((he) this).field_g.field_r + ((he) this).field_g.field_C);
          if (param4.c(127)) {
            L4: {
              var7 = ((he) this).field_g.a(param4.field_j);
              var8 = ((he) this).field_g.field_r + ((he) this).field_g.field_C;
              var9 = param4.field_y + param3;
              if (-3 != (((he) this).field_j ^ -1)) {
                if (1 == ((he) this).field_j) {
                  var9 = var9 + (-var7 + param4.field_n >> -774066207);
                  break L4;
                } else {
                  break L4;
                }
              } else {
                var9 = var9 + (-var7 + param4.field_n);
                break L4;
              }
            }
            L5: {
              var10 = param1 + param4.field_i;
              if ((((he) this).field_h ^ -1) == -3) {
                var10 = var10 + (-var8 + param4.field_w);
                break L5;
              } else {
                if (((he) this).field_h != 1) {
                  break L5;
                } else {
                  var10 = var10 + (param4.field_w - var8 >> 389530145);
                  break L5;
                }
              }
            }
            hl.a(var10 + 2, -2 + var9, (byte) 97, 4 + var7, var8);
            break L3;
          } else {
            break L3;
          }
        }
    }

    final static void a(int param0) {
        int var2 = 0;
        int var3 = 0;
        n var4_ref_n = null;
        int var4 = 0;
        byte[] var5 = null;
        int var6 = 0;
        byte[] var8 = null;
        cr var9 = null;
        ga var10 = null;
        byte[] var11 = null;
        byte[] var12 = null;
        byte[] var13 = null;
        byte[] var14 = null;
        L0: {
          var6 = ZombieDawnMulti.field_E ? 1 : 0;
          if (param0 == -9355) {
            break L0;
          } else {
            he.a(-53);
            break L0;
          }
        }
        L1: {
          var10 = s.field_e;
          var2 = var10.g(31365);
          if (var2 == -1) {
            var9 = (cr) (Object) dc.field_Gb.c(param0 + 9430);
            if (var9 == null) {
              ak.a((byte) -128);
              return;
            } else {
              L2: {
                var4 = var10.g(param0 + 40720);
                if (var4 != 0) {
                  var14 = new byte[var4];
                  var13 = var14;
                  var12 = var13;
                  var11 = var12;
                  var8 = var11;
                  var5 = var8;
                  var10.a(0, -6351, var4, var14);
                  break L2;
                } else {
                  var5 = null;
                  break L2;
                }
              }
              var10.field_j = var10.field_j + 4;
              if (!var10.c(false)) {
                ak.a((byte) -113);
                return;
              } else {
                var9.field_f = var5;
                var9.field_h = true;
                var9.a(true);
                break L1;
              }
            }
          } else {
            if (-2 == var2) {
              var3 = var10.i(-1478490344);
              var4_ref_n = (n) (Object) nq.field_s.c(param0 ^ -9398);
              L3: while (true) {
                L4: {
                  if (var4_ref_n == null) {
                    break L4;
                  } else {
                    if (var4_ref_n.field_h != var3) {
                      var4_ref_n = (n) (Object) nq.field_s.b(param0 + 9361);
                      continue L3;
                    } else {
                      break L4;
                    }
                  }
                }
                if (var4_ref_n == null) {
                  ak.a((byte) -114);
                  return;
                } else {
                  var4_ref_n.a(true);
                  break L1;
                }
              }
            } else {
              bd.a("A1: " + ci.a(0), (Throwable) null, false);
              ak.a((byte) -111);
              break L1;
            }
          }
        }
    }

    public static void a(byte param0) {
        field_b = null;
        if (param0 > -3) {
            he.a((byte) 77);
        }
        field_c = null;
        field_f = null;
        field_i = null;
        field_d = null;
        field_k = null;
    }

    public he() {
        ((he) this).field_g = ke.field_h;
        ((he) this).field_j = 1;
        ((he) this).field_h = 1;
    }

    he(fm param0, int param1, int param2) {
        ((he) this).field_g = param0;
        ((he) this).field_h = param2;
        ((he) this).field_j = param1;
    }

    final static long b(byte param0) {
        if (param0 != -22) {
            field_e = 45L;
        }
        return -mo.field_Gb + bl.a((byte) 56);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new String[]{"Graaah, Mondays!", "At least it's not Monday.", "Yes, master...", "*groan*", "I obey...", "Your will be done.", "Braaaaains...", "Yesss...", "Kill meeee...", "Why...?", "Let us rest...", "Spleen-did idea...", "I'm huuuungry...", "Fright away, master!", "I just started a diet...", "They're close...", "Can't...keep...up...", "Not so fast!", "They taste grrrrreat!", "Tender...juicy...hoomans...", "My feet are killing me.", "jooooiiiNNNNNUUUUUUUssssss...", "Are we there yet?", "I only want a nibble", "I don't feel so good.", "'Til death do us part...", "Why me...?", "Beer...", "*mumble*", "Thrilling.", "Seems right for dead.", "I'm grateful.", "I need a hug.", "I just want a hug!", "Come baaaaaaaack!", "Who wants to die forever?", "Sire commands us...", "At least I'm not playing Arcanists.", "No heal spheres, please.", "They promised us cake...", "Cookieeees...", "ROFD.", "To zombify is painless.", "You smell of cheese.", "Humans are fattening.", "I hate fast food.", "I got worms in my head.", "Brains, milk, bread.", "I'm glad they're out of bullets!", "We're just recycling, really.", "Don't try this at home.", "...", "Work, work."};
        field_c = "Bring the guilt of their past deeds upon them...";
        field_a = false;
        field_d = new String[][]{new String[5], new String[0]};
    }
}
