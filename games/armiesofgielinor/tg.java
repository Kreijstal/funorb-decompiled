/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tg {
    private long field_f;
    static String field_j;
    private String field_h;
    static je field_n;
    private int[] field_o;
    je field_g;
    String field_m;
    static byte[] field_d;
    static String field_l;
    np field_i;
    static int field_k;
    static int field_a;
    int field_c;
    static IndexedSprite[] field_b;
    private int field_e;

    private final boolean b(int param0, byte param1, int param2) {
        int var5;
        var5 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (param0 != 0) {
          if (param0 != 1) {
            if (param0 == 2) {
              CombatEvent.a(param2, -48, this.field_c);
            } else {
              if (param0 == 3) {
                PointerInputHandler.a(-119, this.field_c, param2);
              } else {
                if (param0 == 10) {
                  ov.a(param2, 3, this.field_c);
                } else {
                  if (param0 == 15) {
                    bw.a(param2, this.field_c, (byte) -116);
                  } else {
                    if (param0 != 16) {
                      return false;
                    }
                    bw.a(param2, 0, (byte) -116);
                  }
                }
              }
            }
          } else {
            te.a(param2, this.field_f, (byte) 108);
          }
        } else {
          ActionSpell.a(this.field_f, param2, 6);
        }
        if (param1 == 101) {
          return true;
        }
        this.field_f = -51L;
        return true;
    }

    private final boolean a(int param0, boolean param1, int param2) {
        Object var4;
        String var4_ref;
        String var5;
        String var6;
        String var7;
        String var8;
        String var9;
        var4 = null;
        if (param1) {
          this.b((byte) 101);
          if (param2 != 4) {
            if (param2 != 5) {
              if (param2 != 6) {
                if (param2 != 7) {
                  return false;
                }
                var5 = fq.a(param0, this.field_h, false, this.field_m);
                if (var5 == null) {
                  return true;
                }
                ta.a((String) null, 2, -18119, this.field_m, var5, 0);
                return true;
              }
              var4_ref = se.a(this.field_m, param0, -127);
            } else {
              var4_ref = DamageEvent.a(this.field_m, (byte) -27, param0);
            }
          } else {
            var4_ref = op.a(20, this.field_m, param0);
          }
          if (var4_ref == null) {
            return true;
          }
          ta.a((String) null, 2, -18119, this.field_m, var4_ref, 0);
          return true;
        }
        if (param2 == 4) {
          var6 = op.a(20, this.field_m, param0);
          if (var6 == null) {
            return true;
          }
          ta.a((String) null, 2, -18119, this.field_m, var6, 0);
          return true;
        }
        if (param2 == 5) {
          var7 = DamageEvent.a(this.field_m, (byte) -27, param0);
          if (var7 == null) {
            return true;
          }
          ta.a((String) null, 2, -18119, this.field_m, var7, 0);
          return true;
        }
        if (param2 == 6) {
          var9 = se.a(this.field_m, param0, -127);
          if (var9 == null) {
            return true;
          }
          ta.a((String) null, 2, -18119, this.field_m, var9, 0);
          return true;
        }
        if (param2 != 7) {
          return false;
        }
        var8 = fq.a(param0, this.field_h, false, this.field_m);
        if (var8 == null) {
          return true;
        }
        ta.a((String) null, 2, -18119, this.field_m, var8, 0);
        return true;
    }

    final boolean a(int param0, byte param1, int param2, int param3, boolean param4) {
        if (param1 <= 60) {
          return true;
        }
        int var6 = this.field_i.a((byte) 116, param4);
        if (var6 == -2) {
          return false;
        }
        boolean discarded$0 = this.b(var6, (byte) 101, param0);
        boolean discarded$1 = this.a(param2, false, var6);
        boolean discarded$2 = this.a(var6, param2, (byte) -81);
        boolean discarded$3 = this.a(var6, (byte) 113, param3);
        return true;
    }

    final void a(mo param0, int param1) {
        if (param0.field_f) {
          return;
        }
        try {
          this.field_e = param0.field_b;
          if (param1 == param0.field_b) {
            if (ol.field_B == 0) {
              this.field_i.a(12, pk.field_S, (byte) -110);
            }
            this.field_i.a(13, ou.field_g, (byte) -116);
          }
          if (param0.field_b == 1) {
            if (QuickChatCategory.field_D == 0) {
              this.field_i.a(12, jj.field_b, (byte) -108);
            }
            this.field_i.a(13, fa.field_c, (byte) -121);
          }
          if (param0.field_b == 2) {
            if (cd.field_c == 0) {
              this.field_i.a(12, SummonRequest.field_C, (byte) -120);
            }
            this.field_i.a(13, ai.field_R, (byte) -119);
          }
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "tg.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(ResourceArchive param0, int param1, boolean param2, ResourceArchive param3) {
        try {
          bk.a(param2, fp.field_Lb, eq.field_h, LeaderEscortCondition.field_f, DualLinkedNode.field_k, -106, ke.field_e, im.field_x, qc.field_e, WeightedLruCache.field_b, PreparedAction.field_o, rd.field_e);
          dh.field_n = fk.a("chatfilter", (byte) -125, param3, "lobby");
          co.field_k[0] = QuickChatPhrase.field_v;
          co.field_k[1] = IterableDualNodeDeque.field_a;
          co.field_k[param1] = cd.field_d;
          mu.a(t.field_a, param1 - 2, param0);
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "tg.N(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(int param0) {
        if (param0 <= -15) {
          field_b = null;
          field_j = null;
          field_n = null;
          field_d = null;
          field_l = null;
          return;
        }
        ResourceArchive var2 = (ResourceArchive) null;
        tg.a((ResourceArchive) null, 28, false, (ResourceArchive) null);
        field_b = null;
        field_j = null;
        field_n = null;
        field_d = null;
        field_l = null;
    }

    final void a(int param0, boolean param1) {
        of var4;
        String var5;
        int var6;
        of var7;
        of var10;
        of var11;
        of var4Lifetime1;
        var6 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (param0 != 23899) {
          this.field_e = 127;
          if (this.field_m == null) {
            return;
          }
          if (this.field_f == oh.field_H) {
            return;
          }
          if (null == vu.field_M) {
            return;
          }
          if (!vu.b(false)) {
            return;
          }
          var11 = DeployEvent.a((byte) 121, this.field_f);
          var4 = UnitModelPreview.a(this.field_f, -86);
          var5 = this.b(param0 - 24004);
          if (var4 != null) {
            if (vu.field_M.field_kc &&
              vu.field_M.field_bc < 0) {
              return;
            }
            this.field_i.a(1, fo.a(4800, wc.field_R, new String[]{var5}), (byte) -103);
            return;
          }
          if (var11 == null) {
            return;
          }
          if (!vu.field_M.field_tc) {
            return;
          }
          if (vu.field_M.field_nc <= vu.field_M.field_Ub) {
            return;
          }
          if (var11.field_Wb) {
            this.field_i.a(1, fo.a(4800, oe.field_zb, new String[]{var5}), (byte) -124);
          } else {
            if (!param1) {
              this.field_i.a(0, fo.a(4800, pk.field_W, new String[]{var5}), (byte) -118);
            } else {
              if (!var11.field_Ub) {
                this.field_i.a(0, fo.a(4800, pk.field_W, new String[]{var5}), (byte) -118);
              } else {
                this.field_i.a(0, fo.a(4800, ac.field_x, new String[]{var5}), (byte) -126);
                this.field_i.a(1, fo.a(param0 - 19099, vq.field_g, new String[]{var5}), (byte) -113);
              }
            }
          }
          return;
        }
        if (this.field_m == null) {
          return;
        }
        if (this.field_f == oh.field_H) {
          return;
        }
        if (null == vu.field_M) {
          return;
        }
        if (!vu.b(false)) {
          return;
        }
        var10 = DeployEvent.a((byte) 121, this.field_f);
        var7 = var10;
        var4Lifetime1 = UnitModelPreview.a(this.field_f, -86);
        var5 = this.b(param0 - 24004);
        if (var4Lifetime1 != null) {
          if (vu.field_M.field_kc &&
            vu.field_M.field_bc < 0) {
            return;
          }
          this.field_i.a(1, fo.a(4800, wc.field_R, new String[]{var5}), (byte) -103);
          return;
        }
        if (var10 == null) {
          return;
        }
        if (!vu.field_M.field_tc) {
          return;
        }
        if (vu.field_M.field_nc <= vu.field_M.field_Ub) {
          return;
        }
        if (var10.field_Wb) {
          this.field_i.a(1, fo.a(4800, oe.field_zb, new String[]{var5}), (byte) -124);
        } else {
          if (!param1) {
            this.field_i.a(0, fo.a(4800, pk.field_W, new String[]{var5}), (byte) -118);
          } else {
            if (!var10.field_Ub) {
              this.field_i.a(0, fo.a(4800, pk.field_W, new String[]{var5}), (byte) -118);
            } else {
              this.field_i.a(0, fo.a(4800, ac.field_x, new String[]{var5}), (byte) -126);
              this.field_i.a(1, fo.a(param0 - 19099, vq.field_g, new String[]{var5}), (byte) -113);
            }
          }
        }
        return;
    }

    final void a(byte param0) {
        boolean discarded$0 = false;
        String var3;
        int var4;
        au var5;
        au var6;
        au var7;
        var4 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (param0 > 46) {
          if (vu.field_M != null) {
            return;
          }
          var6 = ij.b((byte) 74, this.field_c);
          var5 = var6;
          if (var6 == null) {
            return;
          }
          var3 = var6.field_rc;
          if (var6.field_Nb) {
            this.field_i.a(2, fo.a(4800, ByteStorage.field_b, new String[]{var3}), (byte) -108);
            this.field_i.a(3, fo.a(4800, or.field_a, new String[]{var3}), (byte) -120);
            return;
          }
          if (var6.field_Sb) {
            this.field_i.a(2, fo.a(4800, ev.field_e, new String[]{var3}), (byte) -114);
            if (var6.field_gc) {
              this.field_i.a(3, fo.a(4800, eq.field_j, new String[]{var3}), (byte) -119);
            }
            return;
          }
          if (!var6.field_gc &&
            var6.field_tc) {
            if (!var6.field_kc) {
              this.field_i.a(2, fo.a(4800, CampaignResult.field_d, new String[]{var3}), (byte) -123);
              if (var6.field_gc) {
                this.field_i.a(3, fo.a(4800, eq.field_j, new String[]{var3}), (byte) -119);
              }
              return;
            }
            if (!var6.field_Sb) {
              if (var6.field_gc) {
                this.field_i.a(3, fo.a(4800, eq.field_j, new String[]{var3}), (byte) -119);
              }
              return;
            }
            this.field_i.a(2, fo.a(4800, CampaignResult.field_d, new String[]{var3}), (byte) -123);
          }
          if (!var6.field_gc) {
            return;
          }
          this.field_i.a(3, fo.a(4800, eq.field_j, new String[]{var3}), (byte) -119);
          return;
        }
        discarded$0 = this.a(107, -75, (byte) 100);
        if (vu.field_M != null) {
          return;
        }
        var7 = ij.b((byte) 74, this.field_c);
        if (var7 == null) {
          return;
        }
        var3 = var7.field_rc;
        if (var7.field_Nb) {
          this.field_i.a(2, fo.a(4800, ByteStorage.field_b, new String[]{var3}), (byte) -108);
          this.field_i.a(3, fo.a(4800, or.field_a, new String[]{var3}), (byte) -120);
          return;
        }
        if (var7.field_Sb) {
          this.field_i.a(2, fo.a(4800, ev.field_e, new String[]{var3}), (byte) -114);
        } else {
          if (!var7.field_gc &&
            var7.field_tc) {
            if (!var7.field_kc) {
              this.field_i.a(2, fo.a(4800, CampaignResult.field_d, new String[]{var3}), (byte) -123);
            } else {
              if (var7.field_Sb) {
                this.field_i.a(2, fo.a(4800, CampaignResult.field_d, new String[]{var3}), (byte) -123);
              }
            }
          }
        }
        if (!var7.field_gc) {
          return;
        }
        this.field_i.a(3, fo.a(4800, eq.field_j, new String[]{var3}), (byte) -119);
        return;
    }

    private final boolean a(int param0, int param1, byte param2) {
        int var4 = 0;
        int var5 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime3;
        int var4Lifetime4;
        int var4Lifetime5;
        int var4Lifetime6;
        int var4Lifetime7;
        if (param0 == 8) {
          gk.a(-23503, this.field_m, this.field_f);
          var4 = 84 % ((param2 - 30) / 54);
          return true;
        }
        if (18 == param0) {
          og.a(this.field_f, 1, this.field_m);
          var4Lifetime1 = 84 % ((param2 - 30) / 54);
          return true;
        }
        if (param0 == 11) {
          ud.b(0, false, this.field_e, param1);
          var4Lifetime2 = 84 % ((param2 - 30) / 54);
          return true;
        }
        if (param0 == 12) {
          ud.b(1, false, this.field_e, param1);
          var4Lifetime3 = 84 % ((param2 - 30) / 54);
          return true;
        }
        if (13 == param0) {
          ud.b(2, false, this.field_e, param1);
          var4Lifetime4 = 84 % ((param2 - 30) / 54);
          return true;
        }
        if (14 == param0) {
          la.b(-26887);
          var4Lifetime5 = 84 % ((param2 - 30) / 54);
          return true;
        }
        if (param0 == 20) {
          np.k(110);
          var4Lifetime6 = 84 % ((param2 - 30) / 54);
          return true;
        }
        if (param0 == 19) {
          QuickChatCommandDefinition.a(81, this.field_m, this.field_o, this.field_f, this.field_e);
          var4Lifetime7 = 84 % ((param2 - 30) / 54);
          return true;
        }
        return false;
    }

    private final String b(int param0) {
        String var2 = null;
        if (this.field_h == null) {
          var2 = this.field_m;
        } else {
          var2 = this.field_h;
        }
        int var3 = -2 / ((param0 + 19) / 43);
        return var2;
    }

    private final boolean a(int param0, byte param1, int param2) {
        if (param1 <= 38) {
          tg.a(-18);
          if (param0 == 17) {
            Spell.field_b = new i(this.field_g.field_V, this.field_g.field_D, this.field_g.field_gb, this.field_g.field_ob, param2, ArchiveIndex.field_b, UnitModelPreview.field_m, uc.field_b, eq.field_h, hs.field_H, DualLinkedNode.field_k, this.field_m, this.field_f);
            return true;
          }
          return false;
        }
        if (param0 == 17) {
          Spell.field_b = new i(this.field_g.field_V, this.field_g.field_D, this.field_g.field_gb, this.field_g.field_ob, param2, ArchiveIndex.field_b, UnitModelPreview.field_m, uc.field_b, eq.field_h, hs.field_H, DualLinkedNode.field_k, this.field_m, this.field_f);
          return true;
        }
        return false;
    }

    final void a(byte param0, boolean param1) {
        if (param0 != -108) {
          tg.a(-128);
          this.field_i.b(param1, 20);
          return;
        }
        this.field_i.b(param1, 20);
    }

    final boolean c(byte param0) {
        if (param0 >= -107) {
          field_b = (IndexedSprite[]) null;
          if (null == this.field_i) {
            return false;
          }
          if (this.field_i.d((byte) 86)) {
            return true;
          }
          return false;
        }
        if (null == this.field_i) {
          return false;
        }
        if (this.field_i.d((byte) 86)) {
          return true;
        }
        return false;
    }

    final void a(int[] param0, int param1, int param2) {
        String discarded$0 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        String var4 = null;
        RuntimeException var4_ref = null;
        hl var5 = null;
        int var6 = 0;
        String var7 = null;
        try {
          if (null != this.field_m && (this.field_f != oh.field_H ||
            2 == param2) && 2 == th.field_a) {
            var7 = this.b(-97);
            var4 = var7;
            var5 = lg.a(this.field_m, (byte) -34);
            var6 = IndexedSpriteBase.a(this.field_m, -3404) ? 1 : 0;
            if (var5 == null &&
              var6 == 0) {
              this.field_i.a(4, fo.a(4800, vf.field_l, new String[]{var7}), (byte) -125);
              this.field_i.a(6, fo.a(4800, sq.field_o, new String[]{var7}), (byte) -100);
              if (param0 != null &&
                param2 != 2 &&
                !NodeIterator.field_a) {
                this.field_o = param0;
                this.field_i.a(19, fo.a(4800, kt.field_m, new String[]{var7}), (byte) -115);
              }
            }
            if (var5 != null) {
              if (!fs.a((byte) 111, this.field_m) &&
                !NodeIterator.field_a) {
                if (!vi.field_d) {
                  this.field_i.a(8, fo.a(4800, mi.field_k, new String[]{var7}), (byte) -114);
                }
                this.field_i.a(18, fo.a(param1 ^ 4807, DeployRequest.field_w, new String[]{var7}), (byte) -111);
                if (param0 != null) {
                  this.field_o = param0;
                  this.field_i.a(19, fo.a(4800, kt.field_m, new String[]{var7}), (byte) -115);
                }
              }
              this.field_i.a(5, fo.a(4800, na.field_K, new String[]{var7}), (byte) -111);
            }
            if (var6 != 0) {
              this.field_i.a(7, fo.a(4800, oa.field_E, new String[]{var7}), (byte) -102);
            }
          }
          if (param1 != 7) {
            discarded$0 = this.b(-101);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_30_0 = var4_ref;
          stackIn_30_1 = new StringBuilder().append("tg.D(");
          if (param0 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final void b(byte param0) {
        String var3 = null;
        if (null != this.field_m &&
          ~this.field_f != ~oh.field_H) {
          var3 = this.b(96);
          String var2 = var3;
          this.field_i.a(17, fo.a(4800, IterableDualNodeDeque.field_e, new String[]{var3}), (byte) -127);
        }
        if (param0 >= 42) {
          return;
        }
        field_l = (String) null;
    }

    tg(je param0, long param1, String param2, String param3, int param4, int param5, int[] param6) {
        try {
          this.field_i = new np(AnimationSequence.field_h);
          this.field_o = param6;
          this.field_c = param4;
          this.field_f = param1;
          this.field_h = param3;
          this.field_g = param0;
          this.field_m = param2;
          this.field_e = param5;
          param0.field_rb = true;
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "tg.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_j = "Members";
        field_l = "Most buildings";
        field_k = 1;
    }
}
