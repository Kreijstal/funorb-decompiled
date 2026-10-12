/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class QuickChatCategoryRepository {
    static String field_a;
    private WeightedLruCache categories;
    static NodeDeque field_h;
    static boolean field_f;
    private ResourceArchive globalArchive;
    private ResourceArchive localArchive;
    static String field_g;
    static boolean field_b;

    final static void a(boolean param0, int param1) {
        tq.a(param0, true, param1 ^ -81);
        if (param1 != -5) {
          field_g = (String) null;
        }
    }

    final static String b(int param0) {
        if (param0 != 2) {
          field_f = false;
        }
        if (BoundedFile.field_b) {
          return null;
        }
        if (ev.field_a < NodeIterator.field_c) {
          return null;
        }
        if (!(ps.field_E + NodeIterator.field_c <= ev.field_a)) {
          return ts.field_a;
        }
        return null;
    }

    final static void a(java.applet.Applet param0, boolean param1) {
        dj.a(param0, 0, "");
        if (!param1) {
          return;
        }
        try {
          t.a((byte) -118, param0);
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "bl.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void a(int param0) {
        field_g = null;
        int var1 = 69 / ((-73 - param0) / 51);
        field_a = null;
        field_h = null;
    }

    final static void a(byte param0) {
        int stackIn_10_0 = 0;
        of stackIn_16_0 = null;
        boolean stackIn_17_1 = false;
        of stackIn_80_0 = null;
        boolean stackIn_81_1 = false;
        RuntimeException decompiledCaughtException = null;
        CipherPacketBuffer var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        long var3_long = 0L;
        of var3_ref_of = null;
        int var4 = 0;
        au var4_ref_au = null;
        int var5 = 0;
        au var6 = null;
        of var7 = null;
        int var8 = 0;
        of var8_ref_of = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        au var12 = null;
        of var13 = null;
        of var14 = null;
        au var15 = null;
        Object var16 = null;
        Object var17 = null;
        au var17_ref = null;
        Object var18 = null;
        String var19 = null;
        of var20 = null;
        String var21 = null;
        String var22 = null;
        of var23 = null;
        Object var24 = null;
        of var25 = null;
        of var26 = null;
        String var27 = null;
        String var28 = null;
        of var29 = null;
        au var30 = null;
        of var31 = null;
        au var32 = null;
        au var33 = null;
        var16 = null;
        var24 = null;
        var17 = null;
        var18 = null;
        var11 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          regionExit1: {
            var1 = ByteStorage.incomingPacket;
            var2 = ((PacketBuffer) ((Object) var1)).readUnsignedByte(0);
            if (var2 != 0 &&
              var2 != 1 &&
              var2 != 2 &&
              var2 != 3 &&
              var2 != 4) {
              if (var2 == 5) {
                var3_long = ((PacketBuffer) ((Object) var1)).j((byte) -2);
                var22 = ((PacketBuffer) ((Object) var1)).readNullTerminatedString(1);
                var19 = ((PacketBuffer) ((Object) var1)).readNullTerminatedString(1);
                var21 = ((PacketBuffer) ((Object) var1)).readNullTerminatedString(1);
                var20 = DeployEvent.a((byte) 121, var3_long);
                var8_ref_of = var20;
                stackIn_10_0 = (var19.equals("")) ? 0 : 1;
                var9 = stackIn_10_0;
                if (var20 == null) {
                  var8_ref_of = new of(var22, var21, var3_long);
                  oi.field_d.a(-1, var3_long, var8_ref_of);
                } else {
                  if (var9 != 0) {
                    var20.a((byte) 53, var21, var22);
                  }
                }
                var8_ref_of.field_Vb = vi.monotonicMillis(82) - (long)((PacketBuffer) ((Object) var1)).readInt(1);
                var8_ref_of.field_Sb = ((PacketBuffer) ((Object) var1)).readUnsignedShort((byte) -104);
                var10 = ((PacketBuffer) ((Object) var1)).h(-27);
                stackIn_16_0 = var8_ref_of;
                stackIn_17_1 = ((1 & var10) != 0);
                stackIn_16_0.field_Zb = stackIn_17_1;
                var8_ref_of.field_Xb = var10 >> 1;
                var8_ref_of.field_Qb = ((PacketBuffer) ((Object) var1)).readUnsignedByte(0);
                var8_ref_of.field_Ob = ((PacketBuffer) ((Object) var1)).readUnsignedByte(0);
                sf.a((byte) -115, var8_ref_of);
                break regionExit1;
              }
              if (var2 == 6) {
                var3_long = ((PacketBuffer) ((Object) var1)).j((byte) -2);
                var5 = ((PacketBuffer) ((Object) var1)).readUnsignedByte(0);
                var23 = DeployEvent.a((byte) 121, var3_long);
                if ((var23 != null)) {
                  if (var23.field_Ub) {
                    AnimationPlayer.field_a = AnimationPlayer.field_a - 1;
                    var23.field_Ub = false;
                  }
                  if (var5 == 0) {
                    var23.unlink(126);
                  } else {
                    var23.field_Rb = qd.field_K;
                    var23.field_Kb = var5;
                  }
                  var23.unlinkSecondary((byte) -76);
                }
              } else {
                if (var2 == 7) {
                  var31 = (of) (SummonAction.field_u.first((byte) 106));
                  while (var31 != null) {
                    var31.unlink(122);
                    var31.unlinkSecondary((byte) -76);
                    var31 = (of) (SummonAction.field_u.next((byte) 123));
                  }
                  AnimationPlayer.field_a = 0;
                } else {
                  if (8 == var2) {
                    var3 = ((PacketBuffer) ((Object) var1)).readUnsignedShort((byte) -104);
                    var4_ref_au = (au) (qm.field_J.a((byte) -27, (long)var3));
                    if (var4_ref_au == null) {
                      var4_ref_au = new au(tq.field_b);
                      qm.field_J.a(-1, (long)var3, var4_ref_au);
                    }
                    TrianglePulse.a(var4_ref_au, true, var1, 78);
                    QuickChatPhraseRepository.a(-107, var4_ref_au);
                  } else {
                    if (var2 == 9) {
                      var3 = ((PacketBuffer) ((Object) var1)).readUnsignedShort((byte) -104);
                      var4 = ((PacketBuffer) ((Object) var1)).readUnsignedByte(0);
                      var32 = (au) (qm.field_J.a((byte) -27, (long)var3));
                      if ((var32 != null)) {
                        if (var4 != 0) {
                          var32.field_Lb = qd.field_K;
                          var32.field_mc = var4;
                        } else {
                          var32.unlink(118);
                        }
                        var32.unlinkSecondary((byte) -76);
                      }
                    } else {
                      if (var2 == 10) {
                        var33 = (au) (qc.field_g.first((byte) 105));
                        while (var33 != null) {
                          var33.unlink(-112);
                          var33.unlinkSecondary((byte) -76);
                          var33 = (au) (qc.field_g.next((byte) 123));
                        }
                      } else {
                        if (var2 != 11 &&
                          var2 != 12) {
                          if (var2 == 13) {
                            var3 = ((PacketBuffer) ((Object) var1)).readUnsignedShort((byte) -104);
                            var4 = ((PacketBuffer) ((Object) var1)).readUnsignedByte(0);
                            var17_ref = (au) (qm.field_J.a((byte) -27, (long)var3));
                            if ((var17_ref != null)) {
                              var17_ref.field_gc = false;
                              var12 = var17_ref;
                              var6 = var12;
                              var12.field_Nb = false;
                              if (var4 != 0) {
                                var17_ref.field_mc = var4;
                                var17_ref.field_Lb = qd.field_K;
                              }
                              QuickChatPhraseRepository.a(-127, var17_ref);
                            }
                          } else {
                            if (14 != var2 &&
                              var2 != 16) {
                              if (var2 != 15 &&
                                var2 != 17) {
                                switch (var2) {
                                  case 18:
                                    var3_long = ((PacketBuffer) ((Object) var1)).j((byte) -2);
                                    var27 = ((PacketBuffer) ((Object) var1)).readNullTerminatedString(1);
                                    var28 = ((PacketBuffer) ((Object) var1)).readNullTerminatedString(1);
                                    var7 = UnitModelPreview.a(var3_long, -79);
                                    if (var7 == null) {
                                      var7 = new of(var27, var28, var3_long);
                                      UnitCycler.field_e.a(-1, var3_long, var7);
                                      vu.field_M.field_Ub = vu.field_M.field_Ub + 1;
                                    }
                                    var7.field_Sb = ((PacketBuffer) ((Object) var1)).readUnsignedShort((byte) -104);
                                    var8 = ((PacketBuffer) ((Object) var1)).h(120);
                                    var7.field_Xb = var8 >> 1;
                                    stackIn_80_0 = var7;
                                    stackIn_81_1 = ((var8 & 1) != 0);
                                    stackIn_80_0.field_Zb = stackIn_81_1;
                                    var7.field_Qb = ((PacketBuffer) ((Object) var1)).readUnsignedByte(0);
                                    var7.field_Ob = ((PacketBuffer) ((Object) var1)).readUnsignedByte(0);
                                    wl.field_F.addLast((byte) -119, (IntrusiveNode) (var7));
                                    break regionExit1;
                                  case 19:
                                    var3_long = ((PacketBuffer) ((Object) var1)).j((byte) -2);
                                    var5 = ((PacketBuffer) ((Object) var1)).readUnsignedByte(0);
                                    var14 = UnitModelPreview.a(var3_long, -111);
                                    var29 = var14;
                                    if (var14 == null) {
                                      break regionExit1;
                                    }
                                    if (0 == var5) {
                                      var29.unlink(68);
                                    } else {
                                      var14.field_Rb = qd.field_K;
                                      var14.field_Kb = var5;
                                    }
                                    var29.unlinkSecondary((byte) -76);
                                    vu.field_M.field_Ub = vu.field_M.field_Ub - 1;
                                    break regionExit1;
                                  case 20:
                                    TrianglePulse.a(vu.field_M, false, var1, 83);
                                    break regionExit1;
                                  case 21:
                                    var3 = ((PacketBuffer) ((Object) var1)).readUnsignedShort((byte) -104);
                                    if (var3 == 0) {
                                      ph.field_d = 0L;
                                      break regionExit1;
                                    }
                                    ph.field_d = vi.monotonicMillis(-59) + (long)var3;
                                    break regionExit1;
                                  case 22:
                                    GlobalSpell.field_g = ((PacketBuffer) ((Object) var1)).readUnsignedShort((byte) -104);
                                    SummonAction.field_s = ((PacketBuffer) ((Object) var1)).h(95);
                                    break regionExit1;
                                  case 23:
                                    oh.field_H = ((PacketBuffer) ((Object) var1)).j((byte) -2);
                                    break regionExit1;
                                  default:
                                    af.a((Throwable) null, 118, "L1: " + CampaignProgress.b(false));
                                    dj.a((byte) -124);
                                    break regionExit1;
                                }
                              }
                              var3_long = ((PacketBuffer) ((Object) var1)).j((byte) -2);
                              var5 = ((PacketBuffer) ((Object) var1)).readUnsignedByte(0);
                              var13 = DeployEvent.a((byte) 121, var3_long);
                              var26 = var13;
                              if ((var13 != null)) {
                                if (var5 != 0) {
                                  var13.field_Rb = qd.field_K;
                                  var13.field_Kb = var5;
                                }
                                if (var2 != 15) {
                                  if (var26.field_Ub) {
                                    var26.field_Ub = false;
                                    AnimationPlayer.field_a = AnimationPlayer.field_a - 1;
                                  }
                                } else {
                                  var13.field_Wb = false;
                                }
                                sf.a((byte) 107, var26);
                              }
                            } else {
                              var3_long = ((PacketBuffer) ((Object) var1)).j((byte) -2);
                              var25 = DeployEvent.a((byte) 121, var3_long);
                              if ((var25 != null)) {
                                if (var2 == 14) {
                                  var25.field_Wb = true;
                                } else {
                                  if (!var25.field_Ub) {
                                    var25.field_Ub = true;
                                    AnimationPlayer.field_a = AnimationPlayer.field_a + 1;
                                  }
                                }
                                sf.a((byte) 66, var25);
                              }
                            }
                          }
                        } else {
                          var3 = ((PacketBuffer) ((Object) var1)).readUnsignedShort((byte) -104);
                          var15 = (au) (qm.field_J.a((byte) -27, (long)var3));
                          var30 = var15;
                          if ((var15 != null)) {
                            if (var2 != 11) {
                              var30.field_gc = true;
                            } else {
                              var15.field_Nb = true;
                            }
                            QuickChatPhraseRepository.a(-121, var30);
                          }
                        }
                      }
                    }
                  }
                }
              }
              break regionExit1;
            }
            var3_ref_of = (of) (wl.field_F.first((byte) 93));
            while (var3_ref_of != null) {
              var3_ref_of.unlink(99);
              var3_ref_of.unlinkSecondary((byte) -76);
              var3_ref_of = (of) (wl.field_F.next((byte) 123));
            }
            var3_ref_of = (of) (oi.field_d.a((byte) 66));
            while (var3_ref_of != null) {
              if (var3_ref_of.field_Wb ||
                var3_ref_of.field_Ub) {
                if (var3_ref_of.field_Ub) {
                  AnimationPlayer.field_a = AnimationPlayer.field_a - 1;
                  var3_ref_of.field_Ub = false;
                }
                var3_ref_of.field_Wb = false;
                sf.a((byte) 122, var3_ref_of);
              }
              var3_ref_of = (of) (oi.field_d.c(1));
            }
            if (1 == var2 &&
              vu.field_M != null) {
              PopupPresentation.field_e = vu.field_M.field_rc;
            }
            if (4 == var2) {
              var3 = ((PacketBuffer) ((Object) var1)).readUnsignedShort((byte) -104);
              vu.field_M = new au(tq.field_b);
              vu.field_M.setSecondaryKey(true, (long)var3);
              TrianglePulse.a(vu.field_M, false, var1, 97);
              ph.field_d = 0L;
            } else {
              vu.field_M = null;
            }
            if (2 != var2 &&
              var2 != 3) {
              no.field_K = null;
            } else {
              if (null == no.field_K) {
                no.field_K = new au(tq.field_b);
              }
            }
            if (3 != var2) {
              SpellCastAction.field_s = false;
            } else {
              SpellCastAction.field_s = true;
              for (var3 = 0; var3 < CoatOfArms.field_d.length; var3++) {
                CoatOfArms.field_d[var3] = ((PacketBuffer) ((Object) var1)).readByte((byte) -1);
              }
              DiskCacheRequest.field_E = ((PacketBuffer) ((Object) var1)).readUnsignedByte(0);
              AiPlanningStrategy.field_b = ((PacketBuffer) ((Object) var1)).readUnsignedByte(0);
              for (var3 = 0; tg.field_d.length > var3; var3++) {
                tg.field_d[var3] = ((PacketBuffer) ((Object) var1)).readByte((byte) -106);
              }
            }
          }
          if (param0 >= -36) {
            QuickChatCategoryRepository.b(122);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var1_ref), "bl.C(" + param0 + ')');
        }
    }

    final QuickChatCategory getCategory(int categoryId, boolean obfuscationGuard) {
        byte[] encodedCategory = null;
        if (!obfuscationGuard) {
          field_g = (String) null;
        }
        QuickChatCategory category = (QuickChatCategory) (this.categories.get((long)categoryId, (byte) 122));
        if (category != null) {
          return category;
        }
        if (categoryId >= 32768) {
          encodedCategory = this.globalArchive.getFile((byte) 94, 32767 & categoryId, 0);
        } else {
          encodedCategory = this.localArchive.getFile((byte) 98, categoryId, 0);
        }
        category = new QuickChatCategory();
        if (encodedCategory != null) {
          category.decode((byte) -91, new PacketBuffer(encodedCategory));
        }
        if (categoryId >= 32768) {
          category.applyGlobalIds(30);
        }
        this.categories.put(category, 100, (long)categoryId);
        return category;
    }

    final static void a(int param0, ResourceArchive param1) {
        ModelMeshBase[] array$0 = null;
        MeshData stackIn_23_0 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_37_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        MeshData var5 = null;
        int var6 = 0;
        int var7 = 0;
        String var8 = null;
        String var9 = null;
        MeshData var10 = null;
        String var11 = null;
        MeshData var12 = null;
        MeshData var5Lifetime1;
        int var6Lifetime1;
        int var3Lifetime1;
        int var6Lifetime2;
        var7 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          SummonEvent.field_B = param1;
          var9 = "";
          DiskCacheRequest.unitProjectionVariants = new boolean[ActionRequest.field_m.length];
          for (var3 = param0; ActionRequest.field_m.length > var3; var3++) {
            array$0 = new ModelMeshBase[ActionRequest.field_m[var3].length];
            ActionRequest.unitModels[var3] = array$0;
            DiskCacheRequest.unitProjectionVariants[var3] = false;
            var8 = ActionRequest.field_m[var3][0];
            var10 = hs.a(var8, 235, var9);
            var5 = var10;
            if (var10 != null) {
              if (76 == var3) {
                pd.field_d = var10;
              }
              if (th.a(var10, -17900)) {
                DiskCacheRequest.unitProjectionVariants[var3] = true;
              }
              if (null != var10.faceRenderTypes) {
                for (var6 = 0; var6 < var10.faceCount; var6++) {
                  if (var10.faceRenderTypes[var6] == 2) {
                    var10.faceVertexA[var6] = 0;
                    var10.faceVertexB[var6] = 0;
                    var10.faceVertexC[var6] = 0;
                  }
                }
              }
              ActionRequest.unitModels[var3][0] = var10.createModel(SummonAction.field_x, fm.field_a, ol.field_A, BattleCharacter.field_t, MeshObject.field_a);
              for (var6Lifetime2 = 1; var6Lifetime2 < ActionRequest.field_m[var3].length; var6Lifetime2++) {
                ActionRequest.unitModels[var3][var6Lifetime2] = null;
              }
            }
          }
          for (var3Lifetime1 = 0; var3Lifetime1 < cs.field_W.length; var3Lifetime1++) {
            var11 = cs.field_W[var3Lifetime1];
            var12 = hs.a(var11, 235, var9);
            var5Lifetime1 = var12;
            stackIn_23_0 = var12;
            if (stackIn_23_0.faceRenderTypes != null) {
              for (var6Lifetime1 = 0; var6Lifetime1 < var5Lifetime1.faceCount; var6Lifetime1++) {
                if (var5Lifetime1.faceRenderTypes[var6Lifetime1] == 2) {
                  var5Lifetime1.faceVertexA[var6Lifetime1] = 0;
                  var5Lifetime1.faceVertexB[var6Lifetime1] = 0;
                  var5Lifetime1.faceVertexC[var6Lifetime1] = 0;
                }
              }
            }
            cs.field_db[var3Lifetime1] = var5Lifetime1.createModel(SummonAction.field_x, fm.field_a, ol.field_A, BattleCharacter.field_t, MeshObject.field_a);
            if (((ModelMesh) (cs.field_db[var3Lifetime1])).vertexCount == 0) {
              cs.field_db[var3Lifetime1] = null;
            }
          }
          fn.a(false, 76, -32596);
          TriangleRasterizer.b(0.75f);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_36_0 = var2;
          stackIn_36_1 = new StringBuilder().append("bl.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_37_2 = "null";
          } else {
            stackIn_37_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_36_0), ((StringBuilder) (Object) stackIn_36_1).append(stackIn_37_2).append(')').toString());
        }
    }

    QuickChatCategoryRepository(int unusedParameter, ResourceArchive localArchive, ResourceArchive globalArchive) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        this.categories = new WeightedLruCache(64);
        try {
          this.globalArchive = globalArchive;
          this.localArchive = localArchive;
          if (this.localArchive != null) {
            this.localArchive.getFileCapacity(0, -2);
          }
          if (null != this.globalArchive) {
            this.globalArchive.getFileCapacity(0, -2);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_8_0 = var4;
          stackIn_8_1 = new StringBuilder().append("bl.<init>(").append(unusedParameter).append(',');
          if (localArchive == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
          if (globalArchive == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    static {
        field_a = "Talons and hooks with which to swipe from above, improving aerial attacks.";
        field_h = new NodeDeque();
        field_g = "Not yet achieved";
        field_b = true;
    }
}
