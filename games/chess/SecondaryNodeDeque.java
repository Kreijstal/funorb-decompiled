/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class SecondaryNodeDeque implements Iterable {
    static String field_a;
    DualLinkNode sentinel;
    static ok field_b;
    static String field_e;
    static String field_d;
    static int field_g;
    static int field_f;

    final static void a(byte param0, int param1) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        var6 = Chess.field_G;
        var2 = 0;
        var3 = sl.field_a;
        if (var3 < 5) {
          var2 = 8192 * (var3 * var3) / 1100;
          var4 = 1;
          var5 = 0;
          if (3 == param1) {
            var4 = -1;
          }
          if (param1 == 1) {
            var5 = 1;
          }
          if (param1 == 4) {
            var4 = 1;
            var5 = 1;
          }
          if (param1 == 5) {
            var5 = 1;
            var4 = -1;
          }
          if (param1 == 6) {
            var4 = 1;
            var5 = -1;
          }
          if (param1 == 7) {
            var4 = -1;
            var5 = -1;
          } else {
            if (8 == param1) {
              var4 = -1;
              var5 = -1;
            }
          }
        } else {
          if (var3 < 105) {
            var2 = (-40960 + var3 * 16384) / 220;
            var4 = 1;
            var5 = 0;
            if (3 == param1) {
              var4 = -1;
            }
            if (param1 == 1) {
              var5 = 1;
            }
            if (param1 == 4) {
              var4 = 1;
              var5 = 1;
            }
            if (param1 == 5) {
              var5 = 1;
              var4 = -1;
            }
            if (param1 == 6) {
              var4 = 1;
              var5 = -1;
            }
            if (param1 == 7 ||
              8 == param1) {
              var4 = -1;
              var5 = -1;
            }
          } else {
            if (var3 < 120) {
              var3 = -var3 + 120;
              var2 = -(var3 * var3 * 8192 / 3300) + 8192;
              var4 = 1;
              var5 = 0;
              if (3 == param1) {
                var4 = -1;
              }
              if (param1 == 1) {
                var5 = 1;
              }
              if (param1 == 4) {
                var4 = 1;
                var5 = 1;
              }
              if (param1 == 5) {
                var5 = 1;
                var4 = -1;
              }
              if (param1 == 6) {
                var4 = 1;
                var5 = -1;
              }
              if (param1 == 7 ||
                8 == param1) {
                var4 = -1;
                var5 = -1;
              }
              if (11 == param1) {
                var4 = -1;
              }
              if (12 == param1) {
                var4 = -1;
                var5 = -1;
              }
              if (param1 == 13) {
                var5 = -1;
                var4 = 1;
              }
              if (param0 != 25) {
                SecondaryNodeDeque.clearStaticReferences(114);
              }
              if (param1 == 14) {
                var4 = -1;
                var5 = 1;
              }
              if (param1 == 15) {
                var4 = 1;
                var5 = 1;
              }
              ArchiveProvider.field_b = mm.a(var2 * var4, -1, var5 * var2);
              return;
            }
            var4 = 1;
            var5 = 0;
            if (3 == param1) {
              var4 = -1;
            }
            if (param1 == 1) {
              var5 = 1;
            }
            if (param1 == 4) {
              var4 = 1;
              var5 = 1;
            }
            if (param1 == 5) {
              var5 = 1;
              var4 = -1;
            }
            if (param1 == 6) {
              var4 = 1;
              var5 = -1;
            }
            if (param1 == 7) {
              var4 = -1;
              var5 = -1;
            } else {
              if (8 == param1) {
                var4 = -1;
                var5 = -1;
              }
            }
          }
        }
        if (11 == param1) {
          var4 = -1;
        }
        if (12 == param1) {
          var4 = -1;
          var5 = -1;
        }
        if (param1 == 13) {
          var5 = -1;
          var4 = 1;
        }
        if (param0 != 25) {
          SecondaryNodeDeque.clearStaticReferences(114);
        }
        if (param1 == 14) {
          var4 = -1;
          var5 = 1;
        }
        if (param1 == 15) {
          var4 = 1;
          var5 = 1;
        }
        ArchiveProvider.field_b = mm.a(var2 * var4, -1, var5 * var2);
    }

    public static void clearStaticReferences(int param0) {
        field_d = null;
        field_e = null;
        if (param0 != 7043) {
          return;
        }
        field_a = null;
        field_b = null;
    }

    final static ci a(int param0) {
        if (param0 != 11520) {
          SecondaryNodeDeque.clearStaticReferences(-30);
          return jg.k(110);
        }
        return jg.k(110);
    }

    final static void a(int param0, boolean param1) {
        AccountNameAvailabilityValidator.field_m.a(false, param1);
        jg var2 = AccountRegistrationPanel.field_O;
        if (param0 == 16384) {
          if (var2 != null) {
            var2.drawAllLayers(true, AccountNameAvailabilityValidator.field_m.field_wb, AccountNameAvailabilityValidator.field_m.field_U);
          }
          return;
        }
    }

    final void addLast(DualLinkNode param0, boolean param1) {
        try {
          if (param1) {
            this.iterator();
          }
          if (null != param0.secondaryPrevious) {
            param0.unlinkSecondary(-1);
          }
          param0.secondaryNext = this.sentinel;
          param0.secondaryPrevious = this.sentinel.secondaryPrevious;
          param0.secondaryPrevious.secondaryNext = param0;
          param0.secondaryNext.secondaryPrevious = param0;
        } catch (RuntimeException runtimeException) {
          throw SpriteGeometry.wrapClientException((Throwable) ((Object) runtimeException), "cn.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final DualLinkNode removeFirst(int param0) {
        DualLinkNode var2 = this.sentinel.secondaryNext;
        if (param0 != -14336) {
          field_g = 116;
          if (var2 != this.sentinel) {
            var2.unlinkSecondary(-1);
            return var2;
          }
          return null;
        }
        if (var2 != this.sentinel) {
          var2.unlinkSecondary(-1);
          return var2;
        }
        return null;
    }

    public final Iterator iterator() {
        return (Iterator) ((Object) new SecondaryNodeDequeIterator(this));
    }

    SecondaryNodeDeque() {
        this.sentinel = new DualLinkNode();
        this.sentinel.secondaryPrevious = this.sentinel;
        this.sentinel.secondaryNext = this.sentinel;
    }

    static {
        field_a = "Achievements";
        field_e = "Click or press F10 to open Quick Chat";
        field_d = "More suggestions";
    }
}
