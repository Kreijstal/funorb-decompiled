/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dha {
    int field_a;
    boolean field_b;

    final static boolean a(int param0, int param1, byte param2, int param3) {
        int var4;
        int stackIn_23_0 = 0;
        int stackIn_61_0 = 0;
        int stackIn_97_0 = 0;
        int stackIn_129_0 = 0;
        if (param2 == -107) {
          if (era.field_d == null) {
            if (!ni.field_c) {
              if (vo.field_b) {
                return mj.c(2097152, param0, param3);
              }
              if (fna.field_h == 9) {
                return mj.c(2097152, param0, param3);
              }
              if (fna.field_h == 10) {
                return mj.c(2097152, param0, param3);
              }
              if (fna.field_h == 11) {
                return mj.c(2097152, param0, param3);
              }
              if (fna.field_h != 80) {
                return false;
              }
              if (!ug.q(-1)) {
                return false;
              }
              ni.field_c = true;
              return true;
            }
            if (!ug.q(-1)) {
              return false;
            }
            stackIn_129_0 = (!eqa.a(param1, true, param0)) ? 0 : 1;
            var4 = stackIn_129_0;
          } else {
            if (13 == fna.field_h) {
              era.field_d = null;
              return true;
            }
            if (!ni.field_c) {
              if (vo.field_b) {
                return mj.c(2097152, param0, param3);
              }
              if (fna.field_h == 9) {
                return mj.c(2097152, param0, param3);
              }
              if (fna.field_h == 10) {
                return mj.c(2097152, param0, param3);
              }
              if (fna.field_h == 11) {
                return mj.c(2097152, param0, param3);
              }
              if (fna.field_h != 80) {
                return false;
              }
              if (!ug.q(-1)) {
                return false;
              }
              ni.field_c = true;
              return true;
            }
            if (!ug.q(-1)) {
              return false;
            }
            stackIn_97_0 = (!eqa.a(param1, true, param0)) ? 0 : 1;
            var4 = stackIn_97_0;
          }
        } else {
          dha.a(38, -115, (byte) 27, 44);
          if (era.field_d != null) {
            if (13 == fna.field_h) {
              era.field_d = null;
              return true;
            }
            if (!ni.field_c) {
              if (vo.field_b) {
                return mj.c(2097152, param0, param3);
              }
              if (fna.field_h == 9) {
                return mj.c(2097152, param0, param3);
              }
              if (fna.field_h == 10) {
                return mj.c(2097152, param0, param3);
              }
              if (fna.field_h == 11) {
                return mj.c(2097152, param0, param3);
              }
              if (fna.field_h != 80) {
                return false;
              }
              if (!ug.q(-1)) {
                return false;
              }
              ni.field_c = true;
              return true;
            }
            if (!ug.q(-1)) {
              return false;
            }
            stackIn_61_0 = (!eqa.a(param1, true, param0)) ? 0 : 1;
            var4 = stackIn_61_0;
          } else {
            if (!ni.field_c) {
              if (vo.field_b) {
                return mj.c(2097152, param0, param3);
              }
              if (fna.field_h == 9) {
                return mj.c(2097152, param0, param3);
              }
              if (fna.field_h == 10) {
                return mj.c(2097152, param0, param3);
              }
              if (fna.field_h == 11) {
                return mj.c(2097152, param0, param3);
              }
              if (fna.field_h != 80) {
                return false;
              }
              if (!ug.q(-1)) {
                return false;
              }
              ni.field_c = true;
              return true;
            }
            if (!ug.q(-1)) {
              return false;
            }
            stackIn_23_0 = (!eqa.a(param1, true, param0)) ? 0 : 1;
            var4 = stackIn_23_0;
          }
        }
        if (fna.field_h == 80) {
          var4 = 1;
          ni.field_c = false;
        } else {
          if (fna.field_h == 84) {
            var4 = 1;
            ni.field_c = false;
          }
        }
        if (13 == fna.field_h) {
          ufa.a(true);
          var4 = 1;
          ni.field_c = false;
        }
        return var4 != 0;
    }

    dha(boolean param0, int param1) {
        this.field_b = param0 ? true : false;
        this.field_a = param1;
    }

    static {
    }
}
