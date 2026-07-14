/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mk extends ag {
    private pd field_T;
    static String field_M;
    static String field_I;
    private int field_H;
    static oc field_J;
    static String field_K;
    static gk field_O;
    static String field_R;
    static String field_N;
    static String[] field_P;
    static int field_S;
    static int field_Q;
    static String field_L;

    public static void g(byte param0) {
        field_K = null;
        field_O = null;
        field_N = null;
        if (param0 >= -89) {
          field_O = null;
          field_L = null;
          field_R = null;
          field_J = null;
          field_M = null;
          field_I = null;
          field_P = null;
          return;
        } else {
          field_L = null;
          field_R = null;
          field_J = null;
          field_M = null;
          field_I = null;
          field_P = null;
          return;
        }
    }

    final String b(boolean param0) {
        if (!(!((mk) this).field_w)) {
            return ((mk) this).field_T.c(26146);
        }
        if (!param0) {
            return null;
        }
        field_N = null;
        return null;
    }

    final void a(qm param0, int param1, int param2, int param3) {
        ((mk) this).field_H = ((mk) this).field_H + 1;
        this.a(param0, param1, param2, param3);
    }

    final void a(byte param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        eh var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        qb var13 = null;
        qb var14 = null;
        qb var15 = null;
        qb var16 = null;
        var11 = ArcanistsMulti.field_G ? 1 : 0;
        this.a((byte) -58, param1, param2, param3);
        if (param0 < -52) {
          if (-1 != (param2 ^ -1)) {
            return;
          } else {
            var5 = param1 + (((mk) this).field_n - -(((mk) this).field_v >> 1146269633));
            var6 = ((mk) this).field_j + param3 - -(((mk) this).field_k >> 475725313);
            var8 = ((mk) this).field_T.a(-116);
            if (da.field_f == var8) {
              var16 = qk.field_lb[0];
              var9 = var16.field_n << 473192737;
              var10 = var16.field_w << 1824118977;
              if (jk.field_o != null) {
                if (jk.field_o.field_q >= var9) {
                  if (var10 <= jk.field_o.field_y) {
                    fk.a(jk.field_o, -23095);
                    de.b();
                    var16.b(112, 144, var16.field_n << -134715804, var16.field_w << 1010939556, -((mk) this).field_H << 793288330, 4096);
                    oo.c(-15405);
                    jk.field_o.b(var5 - var16.field_n, var6 - var16.field_w, 256);
                    return;
                  } else {
                    jk.field_o = new qb(var9, var10);
                    fk.a(jk.field_o, -23095);
                    var16.b(112, 144, var16.field_n << -134715804, var16.field_w << 1010939556, -((mk) this).field_H << 793288330, 4096);
                    oo.c(-15405);
                    jk.field_o.b(var5 - var16.field_n, var6 - var16.field_w, 256);
                    return;
                  }
                } else {
                  jk.field_o = new qb(var9, var10);
                  fk.a(jk.field_o, -23095);
                  var16.b(112, 144, var16.field_n << -134715804, var16.field_w << 1010939556, -((mk) this).field_H << 793288330, 4096);
                  oo.c(-15405);
                  jk.field_o.b(var5 - var16.field_n, var6 - var16.field_w, 256);
                  return;
                }
              } else {
                jk.field_o = new qb(var9, var10);
                fk.a(jk.field_o, -23095);
                var16.b(112, 144, var16.field_n << -134715804, var16.field_w << 1010939556, -((mk) this).field_H << 793288330, 4096);
                oo.c(-15405);
                jk.field_o.b(var5 - var16.field_n, var6 - var16.field_w, 256);
                return;
              }
            } else {
              if (var8 != ug.field_c) {
                if (ra.field_k != var8) {
                  if (nn.field_s != var8) {
                    return;
                  } else {
                    var13 = qk.field_lb[1];
                    var13.b(-(var13.field_q >> 99219553) + var5, -(var13.field_y >> 958765089) + var6, 256);
                    return;
                  }
                } else {
                  var14 = qk.field_lb[2];
                  var14.b(-(var14.field_q >> -266678463) + var5, -(var14.field_y >> 2106987041) + var6, 256);
                  return;
                }
              } else {
                var15 = qk.field_lb[0];
                var9 = var15.field_n << 473192737;
                var10 = var15.field_w << 1824118977;
                if (jk.field_o != null) {
                  if (jk.field_o.field_q >= var9) {
                    if (var10 <= jk.field_o.field_y) {
                      fk.a(jk.field_o, -23095);
                      de.b();
                      var15.b(112, 144, var15.field_n << -134715804, var15.field_w << 1010939556, -((mk) this).field_H << 793288330, 4096);
                      oo.c(-15405);
                      jk.field_o.b(var5 - var15.field_n, var6 - var15.field_w, 256);
                      return;
                    } else {
                      jk.field_o = new qb(var9, var10);
                      fk.a(jk.field_o, -23095);
                      var15.b(112, 144, var15.field_n << -134715804, var15.field_w << 1010939556, -((mk) this).field_H << 793288330, 4096);
                      oo.c(-15405);
                      jk.field_o.b(var5 - var15.field_n, var6 - var15.field_w, 256);
                      return;
                    }
                  } else {
                    jk.field_o = new qb(var9, var10);
                    fk.a(jk.field_o, -23095);
                    var15.b(112, 144, var15.field_n << -134715804, var15.field_w << 1010939556, -((mk) this).field_H << 793288330, 4096);
                    oo.c(-15405);
                    jk.field_o.b(var5 - var15.field_n, var6 - var15.field_w, 256);
                    return;
                  }
                } else {
                  jk.field_o = new qb(var9, var10);
                  fk.a(jk.field_o, -23095);
                  var15.b(112, 144, var15.field_n << -134715804, var15.field_w << 1010939556, -((mk) this).field_H << 793288330, 4096);
                  oo.c(-15405);
                  jk.field_o.b(var5 - var15.field_n, var6 - var15.field_w, 256);
                  return;
                }
              }
            }
          }
        } else {
          return;
        }
    }

    final boolean a(int param0, qm param1) {
        if (param0 != 0) {
            return false;
        }
        return false;
    }

    mk(pd param0) {
        ((mk) this).field_T = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_I = "Decline invitation to <%0>'s game";
        field_K = "You are offering an unrated rematch.";
        field_M = "Minions can only be summoned when the summoning circle is green; you cannot summon over terrain or too far away from yourself.<br>Click to summon your Imps!";
        field_J = new oc();
        field_R = "This spell explodes five seconds after being cast, allowing you to bounce it off the terrain to hit those hard to reach targets. Try destroying one of the three targets in the arena.";
        field_N = "Select the Arcane Arrow spell below.";
        field_P = new String[]{"By rating", "By win percentage"};
        field_Q = 10;
        field_L = "Toggle mouseover help";
    }
}
