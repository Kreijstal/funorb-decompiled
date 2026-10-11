/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ActionSpell extends Spell {
    static int field_j;
    static String field_i;
    static String field_l;
    private ActionRequest request;
    static String field_k;
    private PreparedAction preparedAction;
    static String field_f;
    static fj field_e;

    public static void a(boolean param0) {
        field_e = null;
        if (param0) {
          return;
        }
        field_i = null;
        field_k = null;
        field_f = null;
        field_l = null;
    }

    final static void a(java.applet.Applet param0, int param1, String param2) {
        try {
          java.net.URL var3 = null;
          Exception var3_ref = null;
          RuntimeException var3_ref2 = null;
          RuntimeException stackIn_8_0 = null;
          StringBuilder stackIn_8_1 = null;
          String stackIn_9_2 = null;
          StringBuilder stackIn_11_1 = null;
          String stackIn_12_2 = null;
          Throwable decompiledCaughtException = null;
          try {
            if (param1 >= -68) {
              return;
            }
            try {
              var3 = new java.net.URL(param0.getCodeBase(), param2);
              var3 = ck.a(-3780, var3, param0);
              SpellCastAction.a(param0, -109, var3.toString(), true);
              return;
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var3_ref = (Exception) (Object) decompiledCaughtException;
              var3_ref.printStackTrace();
              return;
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_8_0 = var3_ref2;
            stackIn_8_1 = new StringBuilder().append("ra.J(");
            if (param0 == null) {
              stackIn_9_2 = "null";
            } else {
              stackIn_9_2 = "{...}";
            }
            stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',');
            if (param2 == null) {
              stackIn_12_2 = "null";
            } else {
              stackIn_12_2 = "{...}";
            }
            throw ig.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0, int param1, om param2, boolean param3, int param4, int param5) {
        CipherPacketBuffer stackIn_32_0 = null;
        int stackIn_32_1 = 0;
        int stackIn_33_2 = 0;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_40_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (DamageEvent.g(117)) {
            return;
          }
          var6_int = param2.field_G.field_r;
          var7 = param2.field_v;
          MoveEvent.field_C.a(var7, (byte) 33, param4);
          if (!(pg.field_d.field_g.a(var6_int, -63, var7) >= param4) ||
            param4 == 1) {
            if (1 < param4) {
              hc.field_b = hc.field_b + 1;
              hc.field_b = hc.field_b + (ko.field_b ^ AiPlanningStrategy.field_d);
              hc.field_b = Math.abs(hc.field_b);
              var8 = hc.field_b % 8;
              var9 = var8;
              if (0 == var9) {
                cg.field_j = cg.field_j + 1;
                kw.field_R = kw.field_R - wr.field_L;
              } else {
                if (1 == var9) {
                  wr.field_L = wr.field_L + 1;
                  ii.field_b = ii.field_b + cg.field_j;
                } else {
                  if (var9 == 2) {
                    ii.field_b = ii.field_b + 1;
                    kw.field_R = kw.field_R + 1;
                  } else {
                    if (var9 != 3) {
                      if (var9 != 4) {
                        if (5 != var9) {
                          if (var9 != 6) {
                            if (7 != var9) {
                              throw new IllegalStateException("");
                            }
                            ii.field_b = ii.field_b - cg.field_j;
                            wr.field_L = wr.field_L - 1;
                          } else {
                            kw.field_R = kw.field_R + wr.field_L;
                            cg.field_j = cg.field_j - 1;
                          }
                        } else {
                          cg.field_j = cg.field_j + 1;
                          kw.field_R = kw.field_R - wr.field_L;
                        }
                      } else {
                        ii.field_b = ii.field_b + cg.field_j;
                        wr.field_L = wr.field_L + 1;
                      }
                    } else {
                      kw.field_R = kw.field_R + iu.field_t;
                      ii.field_b = ii.field_b + iu.field_t;
                    }
                  }
                }
              }
            }
            pg.field_d.field_g.a(65535, var7, param5, var6_int, param1);
            vl.field_n.h(32161, 79);
            vl.field_n.b(param0 - 3, var6_int);
            vl.field_n.b(1, var7);
            vl.field_n.b(true, param4);
            vl.field_n.b(true, param5);
            vl.field_n.b(true, param1);
            stackIn_32_0 = vl.field_n;
            stackIn_32_1 = 1;
            if (!param3) {
              stackIn_33_2 = 0;
            } else {
              stackIn_33_2 = 1;
            }
            ((CipherPacketBuffer) (Object) stackIn_32_0).b(stackIn_32_1, stackIn_33_2);
            vl.field_n.a((byte) -108, km.a(-59));
            vl.field_n.a((byte) -124, oq.a(false));
            vl.field_n.a((byte) -59, jr.a(false));
            vl.field_n.a((byte) -50, RevivalEvent.g(0));
          }
          qh.b((byte) 27);
          if (param0 == 4) {
            return;
          }
          ActionSpell.b(true);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_39_0 = var6;
          stackIn_39_1 = new StringBuilder().append("ra.N(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_40_2 = "null";
          } else {
            stackIn_40_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_39_0), ((StringBuilder) (Object) stackIn_39_1).append(stackIn_40_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2) {
        bn.field_b = param0;
        ce.field_N = param0;
        dt.field_a = param2;
        dm.field_D = param2;
        tq.field_a = true;
        so.field_b = null;
        int[] var4 = (int[]) null;
        SoftwareRaster.a((int[]) null, 0, 0);
        so.field_b = rj.a(param0, param2, 1423111778, (java.awt.Component) ((Object) si.field_b));
        so.field_b.a(param1 - 17900);
        g.a((byte) -85, param0 / 2, param2 / 2);
        if (param1 == 23505) {
          ni.a(-8994, param0, param2);
          om.a(param2, -22696, param0);
          pt.c(param0 / 2, param2 / 2, 9);
          return;
        }
        ActionSpell.a(-106, -34, -122);
        ni.a(-8994, param0, param2);
        om.a(param2, -22696, param0);
        pt.c(param0 / 2, param2 / 2, 9);
    }

    ActionSpell(int spellId, ActionRequest request) {
        super(spellId);
        try {
          this.request = request;
          if (this.spellId == 36) {
            this.request.allowOtherPlayer = true;
          }
          this.request.spellId = spellId;
        } catch (RuntimeException runtimeException) {
          throw ig.a((Throwable) ((Object) runtimeException), "ra.<init>(" + spellId + ',' + (request != null ? "{...}" : "null") + ')');
        }
    }

    final void applyEffect(int castingPlayer, Battlefield battlefield, int obfuscationGuard) {
        try {
          if (obfuscationGuard != 26123) {
            Battlefield var5 = (Battlefield) null;
            this.finishEffect((Battlefield) null, 42);
          }
        } catch (RuntimeException runtimeException) {
          throw ig.a((Throwable) ((Object) runtimeException), "ra.A(" + castingPlayer + ',' + (battlefield != null ? "{...}" : "null") + ',' + obfuscationGuard + ')');
        }
    }

    final int getPayloadSize(int obfuscationGuard) {
        if (obfuscationGuard != 25365) {
          PacketBuffer var3 = (PacketBuffer) null;
          this.writePayload(-112, (PacketBuffer) null);
          return 2;
        }
        return 2;
    }

    final void finishEffect(Battlefield battlefield, int obfuscationGuard) {
        RuntimeException var3 = null;
        om var4 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null != this.preparedAction) {
            this.preparedAction.applyToBattlefield(64, battlefield);
            this.preparedAction = null;
          }
          if (obfuscationGuard == -1700635440) {
            return;
          }
          var4 = (om) null;
          ActionSpell.a(112, -111, (om) null, true, 116, 78);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("ra.G(");
          if (battlefield == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final void prepareEffect(byte obfuscationGuard, Battlefield battlefield) {
        try {
          this.preparedAction = this.request.prepareAction(obfuscationGuard ^ -26, battlefield);
          if (obfuscationGuard != -37) {
            Battlefield var4 = (Battlefield) null;
            this.finishEffect((Battlefield) null, -62);
          }
        } catch (RuntimeException runtimeException) {
          throw ig.a((Throwable) ((Object) runtimeException), "ra.D(" + obfuscationGuard + ',' + (battlefield != null ? "{...}" : "null") + ')');
        }
    }

    final void writePayload(int obfuscationGuard, PacketBuffer packet) {
        try {
          packet.b(true, this.spellId);
          if (obfuscationGuard != -11637) {
            field_i = (String) null;
          }
        } catch (RuntimeException runtimeException) {
          throw ig.a((Throwable) ((Object) runtimeException), "ra.E(" + obfuscationGuard + ',' + (packet != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(long param0, int param1, int param2) {
        CipherPacketBuffer var4 = vl.field_n;
        var4.h(32161, param1);
        var4.position = var4.position + 1;
        int var5 = var4.position;
        var4.b(1, param2);
        var4.a(param0, param2 ^ 38359638);
        var4.e(-var5 + var4.position, 5930);
    }

    final static int b(boolean param0) {
        if (param0) {
          return 1900 + new Date().getYear();
        }
        ActionSpell.b(false);
        return 1900 + new Date().getYear();
    }

    static {
        field_j = 0;
        field_i = "All players have left <%0>'s game.";
        field_k = "You must capture a village before you can use Fortify on it.";
        field_f = "This is your RuneScape clan if you have one.";
        field_l = "You have been removed from <%0>'s game.";
        field_e = null;
    }
}
