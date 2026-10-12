/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class po {
    static String field_b;
    static String field_a;

    final static void a(byte param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int var9 = -78 % ((-51 - param0) / 33);
        int var8 = CampaignMenuEntry.field_u[param6];
        if (9 != var8) {
          return;
        }
        oo.a(param4, param2, param5, param7, param3, param1, (byte) -103);
        ac.field_k[ls.a(CombatViewTransition.a(1 + param7, param1 - 1, 2, (byte) -108), 1, CombatViewTransition.a(param7, -1 + param1, 2, (byte) -109), CombatViewTransition.a(param7 + 1, param1, 2, (byte) -94), -57) + 180].b(param3, param2, param4, param5);
        ac.field_k[ls.a(CombatViewTransition.a(-1 + param7, param1 - 1, 2, (byte) -113), 1, CombatViewTransition.a(param7, param1 - 1, 2, (byte) -116), CombatViewTransition.a(param7 - 1, param1, 2, (byte) -126), -63) + 181].b(param3, param2, param4, param5);
        ac.field_k[182 + ls.a(CombatViewTransition.a(param7 + 1, 1 + param1, 2, (byte) -124), 1, CombatViewTransition.a(param7, param1 + 1, 2, (byte) -127), CombatViewTransition.a(param7 + 1, param1, 2, (byte) -122), -94)].b(param3, param2, param4, param5);
        ac.field_k[183 + ls.a(CombatViewTransition.a(param7 - 1, param1 + 1, 2, (byte) -122), 1, CombatViewTransition.a(param7, param1 + 1, 2, (byte) -116), CombatViewTransition.a(-1 + param7, param1, 2, (byte) -114), -118)].b(param3, param2, param4, param5);
    }

    final static TaggedMapData readLengthPrefixedMap(CipherPacketBuffer packet, int obfuscationGuard) {
        int var2_int = 0;
        RuntimeException var2 = null;
        TaggedMapData var3 = null;
        TaggedMapData stackIn_2_0 = null;
        TaggedMapData stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard != -23920) {
            stackIn_2_0 = (TaggedMapData) null;
            return stackIn_2_0;
          }
          var2_int = packet.readInt(1);
          packet.beginBitReading(45);
          var3 = ut.readTaggedMap(packet, (byte) -85, var2_int);
          packet.endBitReading(-2);
          stackIn_4_0 = var3;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("po.C(");
          if (packet == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final static boolean a(int param0, int param1, int param2) {
        int stackIn_3_0 = 0;
        int var3;
        String var4;
        String var4Lifetime1;
        String var4Lifetime2;
        String var4Lifetime3;
        String var4Lifetime4;
        String var4Lifetime1Lifetime1;
        stackIn_3_0 = (null == no.field_K) ? 0 : 1;
        var3 = stackIn_3_0;
        if (rs.field_q != 9) {
          if (param1 != 6150) {
            field_a = (String) null;
            if (10 == rs.field_q) {
              if (var3 != 0) {
                return false;
              }
              np.k(param1 ^ 6217);
              return true;
            }
            if (11 != rs.field_q) {
              return false;
            }
            if (!lq.field_d) {
              return false;
            }
            if (vt.field_l == 2 &&
              !FixedQuaternion.a(RevivalEvent.field_z, wn.field_db, (byte) 78)) {
              return false;
            }
            if (vt.field_l != 2 &&
              var3 != 0) {
              return false;
            }
          } else {
            if (10 == rs.field_q) {
              if (var3 != 0) {
                return false;
              }
              np.k(param1 ^ 6217);
              return true;
            }
            if (11 != rs.field_q) {
              return false;
            }
            if (!lq.field_d) {
              return false;
            }
            if (vt.field_l != 2) {
              if (vt.field_l == 2) {
                if (!BestScoreStrategy.a(true)) {
                  return true;
                }
                var4 = (String) null;
                it.a(vi.field_e, -82, vt.field_l, wn.field_db, param0, (String) null);
                return true;
              }
              if (var3 != 0) {
                return false;
              }
            } else {
              if (!FixedQuaternion.a(RevivalEvent.field_z, wn.field_db, (byte) 78)) {
                return false;
              }
              if (vt.field_l != 2 &&
                var3 != 0) {
                return false;
              }
            }
          }
          if (BestScoreStrategy.a(true)) {
            var4Lifetime4 = (String) null;
            it.a(vi.field_e, -82, vt.field_l, wn.field_db, param0, (String) null);
          }
          return true;
        }
        if (rb.a(ma.field_ab, WeightedScoreStrategy.field_h, -17231, no.field_S, rv.field_b)) {
          if (2 == no.field_S) {
            return me.a(param1 ^ 6251, WeightedScoreStrategy.field_h, rv.field_b, ma.field_ab, no.field_S);
          }
          if (var3 != 0) {
            return false;
          }
          return me.a(param1 ^ 6251, WeightedScoreStrategy.field_h, rv.field_b, ma.field_ab, no.field_S);
        }
        if (param1 != 6150) {
          field_a = (String) null;
          if (10 == rs.field_q) {
            if (var3 != 0) {
              return false;
            }
            np.k(param1 ^ 6217);
            return true;
          }
          if (11 != rs.field_q) {
            return false;
          }
          if (!lq.field_d) {
            return false;
          }
          if (vt.field_l != 2) {
            if (vt.field_l == 2) {
              if (!BestScoreStrategy.a(true)) {
                return true;
              }
              var4Lifetime1 = (String) null;
              it.a(vi.field_e, -82, vt.field_l, wn.field_db, param0, (String) null);
              return true;
            }
            if (var3 != 0) {
              return false;
            }
          } else {
            if (!FixedQuaternion.a(RevivalEvent.field_z, wn.field_db, (byte) 78)) {
              return false;
            }
            if (vt.field_l != 2 &&
              var3 != 0) {
              return false;
            }
          }
          if (BestScoreStrategy.a(true)) {
            var4Lifetime1Lifetime1 = (String) null;
            it.a(vi.field_e, -82, vt.field_l, wn.field_db, param0, (String) null);
          }
          return true;
        }
        if (10 == rs.field_q) {
          if (var3 != 0) {
            return false;
          }
          np.k(param1 ^ 6217);
          return true;
        }
        if (11 != rs.field_q) {
          return false;
        }
        if (!lq.field_d) {
          return false;
        }
        if (vt.field_l != 2) {
          if (vt.field_l == 2) {
            if (!BestScoreStrategy.a(true)) {
              return true;
            }
            var4Lifetime2 = (String) null;
            it.a(vi.field_e, -82, vt.field_l, wn.field_db, param0, (String) null);
            return true;
          }
          if (var3 != 0) {
            return false;
          }
        } else {
          if (!FixedQuaternion.a(RevivalEvent.field_z, wn.field_db, (byte) 78)) {
            return false;
          }
          if (vt.field_l != 2 &&
            var3 != 0) {
            return false;
          }
        }
        if (!BestScoreStrategy.a(true)) {
          return true;
        }
        var4Lifetime3 = (String) null;
        it.a(vi.field_e, -82, vt.field_l, wn.field_db, param0, (String) null);
        return true;
    }

    public static void a(boolean param0) {
        field_a = null;
        field_b = null;
        if (!param0) {
          field_b = (String) null;
        }
    }

    static {
        field_b = "Yes";
        field_a = "This unit has already used a trinket this turn.";
    }
}
