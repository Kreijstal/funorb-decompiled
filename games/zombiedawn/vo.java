/*
 * Decompiled by CFR-JS 0.4.0.
 */
class vo {
    static vn[] field_a;
    le field_b;
    static dj field_d;
    private le field_c;

    final le b(byte param0) {
        le var2 = null;
        var2 = ((vo) this).field_b.field_b;
        if (((vo) this).field_b != var2) {
          if (param0 != 26) {
            ((vo) this).field_c = null;
            ((vo) this).field_c = var2.field_b;
            return var2;
          } else {
            ((vo) this).field_c = var2.field_b;
            return var2;
          }
        } else {
          ((vo) this).field_c = null;
          return null;
        }
    }

    final void a(le param0, int param1) {
        int var3 = 0;
        if (param0.field_d != null) {
          param0.b(-27598);
          param0.field_b = ((vo) this).field_b.field_b;
          param0.field_d = ((vo) this).field_b;
          var3 = -120 / ((-52 - param1) / 59);
          param0.field_d.field_b = param0;
          param0.field_b.field_d = param0;
          return;
        } else {
          param0.field_b = ((vo) this).field_b.field_b;
          param0.field_d = ((vo) this).field_b;
          var3 = -120 / ((-52 - param1) / 59);
          param0.field_d.field_b = param0;
          param0.field_b.field_d = param0;
          return;
        }
    }

    final le a(boolean param0) {
        le var2 = null;
        if (!param0) {
          var2 = ((vo) this).field_c;
          if (var2 == ((vo) this).field_b) {
            ((vo) this).field_c = null;
            return null;
          } else {
            ((vo) this).field_c = var2.field_b;
            return var2;
          }
        } else {
          ((vo) this).field_b = null;
          var2 = ((vo) this).field_c;
          if (var2 == ((vo) this).field_b) {
            ((vo) this).field_c = null;
            return null;
          } else {
            ((vo) this).field_c = var2.field_b;
            return var2;
          }
        }
    }

    final le c(int param0) {
        le var2 = null;
        var2 = ((vo) this).field_c;
        if (((vo) this).field_b == var2) {
          ((vo) this).field_c = null;
          return null;
        } else {
          if (param0 != 26853) {
            le discarded$2 = ((vo) this).b((byte) -101);
            ((vo) this).field_c = var2.field_d;
            return var2;
          } else {
            ((vo) this).field_c = var2.field_d;
            return var2;
          }
        }
    }

    final le f(int param0) {
        le var2 = null;
        if (param0 > 9) {
          var2 = ((vo) this).field_b.field_b;
          if (((vo) this).field_b == var2) {
            return null;
          } else {
            var2.b(-27598);
            return var2;
          }
        } else {
          le discarded$2 = ((vo) this).a(-117);
          var2 = ((vo) this).field_b.field_b;
          if (((vo) this).field_b == var2) {
            return null;
          } else {
            var2.b(-27598);
            return var2;
          }
        }
    }

    final int d(int param0) {
        int var2 = 0;
        le var3 = null;
        int var4 = 0;
        var4 = ZombieDawn.field_J;
        var2 = 0;
        var3 = ((vo) this).field_b.field_b;
        if (param0 <= -43) {
          L0: while (true) {
            if (((vo) this).field_b == var3) {
              return var2;
            } else {
              var2++;
              var3 = var3.field_b;
              continue L0;
            }
          }
        } else {
          return -38;
        }
    }

    final void a(int param0, le param1) {
        if (param1.field_d == null) {
          param1.field_b = ((vo) this).field_b;
          if (param0 != 0) {
            field_d = null;
            param1.field_d = ((vo) this).field_b.field_d;
            param1.field_d.field_b = param1;
            param1.field_b.field_d = param1;
            return;
          } else {
            param1.field_d = ((vo) this).field_b.field_d;
            param1.field_d.field_b = param1;
            param1.field_b.field_d = param1;
            return;
          }
        } else {
          param1.b(-27598);
          param1.field_b = ((vo) this).field_b;
          if (param0 == 0) {
            param1.field_d = ((vo) this).field_b.field_d;
            param1.field_d.field_b = param1;
            param1.field_b.field_d = param1;
            return;
          } else {
            field_d = null;
            param1.field_d = ((vo) this).field_b.field_d;
            param1.field_d.field_b = param1;
            param1.field_b.field_d = param1;
            return;
          }
        }
    }

    final boolean a(byte param0) {
        if (param0 >= -116) {
            return true;
        }
        return ((vo) this).field_b.field_b == ((vo) this).field_b ? true : false;
    }

    final void b(int param0) {
        le var3 = null;
        int var4 = ZombieDawn.field_J;
        int var2 = -96 % ((param0 - 13) / 40);
        while (true) {
            var3 = ((vo) this).field_b.field_b;
            if (var3 == ((vo) this).field_b) {
                break;
            }
            var3.b(-27598);
        }
        ((vo) this).field_c = null;
    }

    final le a(int param0) {
        le var2 = null;
        if (param0 == 0) {
          var2 = ((vo) this).field_b.field_d;
          if (var2 == ((vo) this).field_b) {
            return null;
          } else {
            var2.b(-27598);
            return var2;
          }
        } else {
          boolean discarded$2 = ((vo) this).a((byte) 96);
          var2 = ((vo) this).field_b.field_d;
          if (var2 == ((vo) this).field_b) {
            return null;
          } else {
            var2.b(-27598);
            return var2;
          }
        }
    }

    public static void c(byte param0) {
        field_a = null;
        if (param0 > -20) {
            return;
        }
        field_d = null;
    }

    public vo() {
        ((vo) this).field_b = new le();
        ((vo) this).field_b.field_b = ((vo) this).field_b;
        ((vo) this).field_b.field_d = ((vo) this).field_b;
    }

    final le e(int param0) {
        le var2 = null;
        var2 = ((vo) this).field_b.field_d;
        if (var2 != ((vo) this).field_b) {
          ((vo) this).field_c = var2.field_d;
          if (param0 != 0) {
            le discarded$2 = ((vo) this).a(false);
            return var2;
          } else {
            return var2;
          }
        } else {
          ((vo) this).field_c = null;
          return null;
        }
    }

    static {
    }
}
