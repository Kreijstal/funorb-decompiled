/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class SpriteCheckboxPainter implements WidgetPainter {
    static IntrusiveDeque field_b;
    static String field_d;
    static String field_c;
    static Sprite[] field_a;

    public final void drawWidget(int param0, boolean param1, int param2, UiWidget param3, int param4) {
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        Sprite var8 = null;
        try {
          if (param0 != 16777215) {
            return;
          }
          var6_int = param3.field_k + param4;
          var7 = param2 + param3.field_j;
          GooPuddleCell.drawInsetFieldBorder(var6_int, param3.field_n, var7, 48, param3.field_i);
          var8 = Js5Archive.field_k[1];
          if (param3 instanceof TextButton &&
            ((TextButton) (param3)).field_x) {
            var8.drawAdditive(var6_int - (-1 - (-var8.field_r + param3.field_i >> 1)), 1 + var7 + (param3.field_n - var8.field_q >> 1), 256);
          }
          if (param3.isFocused(-17741)) {
            TileMap.drawDottedRectangle(param3.field_i - 4, -4 + param3.field_n, var6_int + 2, param0 - 16777157, 2 + var7);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_10_0 = var6;
          stackIn_10_1 = new StringBuilder().append("jb.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param4).append(')').toString());
        }
    }

    final static void ensureRankingArrayCapacity(int param0, boolean param1, int param2) {
        if (null == ArchiveLoadStep.field_b ||
          !(param0 <= ArchiveLoadStep.field_b.length)) {
          ArchiveLoadStep.field_b = new int[param0 * 2];
        }
        if (null == Js5Archive.field_g) {
          Js5Archive.field_g = new int[2 * param0];
          if (StatefulWidgetRenderer.field_r == null ||
            !(StatefulWidgetRenderer.field_r.length >= param0)) {
            StatefulWidgetRenderer.field_r = new int[2 * param0];
          }
          if (null == ProgressMessageDialog.field_kb) {
            ProgressMessageDialog.field_kb = new int[param0 * 2];
            if (null == MeshDepthBuckets.field_d ||
              !(MeshDepthBuckets.field_d.length >= param0)) {
              MeshDepthBuckets.field_d = new int[2 * param0];
            }
            if (PowerupNames.field_b == null ||
              !(param0 <= PowerupNames.field_b.length)) {
              PowerupNames.field_b = new int[param0 * 2];
            }
            if (null == CutsceneStateHelpers.field_c ||
              !(CutsceneStateHelpers.field_c.length >= param0 + param2)) {
              CutsceneStateHelpers.field_c = new int[(param0 + param2) * 2];
            }
            if (MusicPatchPcmStream.field_q == null ||
              !(param0 <= MusicPatchPcmStream.field_q.length)) {
              MusicPatchPcmStream.field_q = new boolean[2 * param0];
            }
          } else {
            if (param0 > ProgressMessageDialog.field_kb.length) {
              ProgressMessageDialog.field_kb = new int[param0 * 2];
              if (null == MeshDepthBuckets.field_d ||
                !(MeshDepthBuckets.field_d.length >= param0)) {
                MeshDepthBuckets.field_d = new int[2 * param0];
              }
              if (PowerupNames.field_b == null ||
                !(param0 <= PowerupNames.field_b.length)) {
                PowerupNames.field_b = new int[param0 * 2];
              }
              if (null == CutsceneStateHelpers.field_c ||
                !(CutsceneStateHelpers.field_c.length >= param0 + param2)) {
                CutsceneStateHelpers.field_c = new int[(param0 + param2) * 2];
              }
              if (MusicPatchPcmStream.field_q == null ||
                !(param0 <= MusicPatchPcmStream.field_q.length)) {
                MusicPatchPcmStream.field_q = new boolean[2 * param0];
              }
            } else {
              if (null == MeshDepthBuckets.field_d) {
                MeshDepthBuckets.field_d = new int[2 * param0];
                if (PowerupNames.field_b == null ||
                  !(param0 <= PowerupNames.field_b.length)) {
                  PowerupNames.field_b = new int[param0 * 2];
                }
                if (null == CutsceneStateHelpers.field_c ||
                  !(CutsceneStateHelpers.field_c.length >= param0 + param2)) {
                  CutsceneStateHelpers.field_c = new int[(param0 + param2) * 2];
                }
                if (MusicPatchPcmStream.field_q == null ||
                  !(param0 <= MusicPatchPcmStream.field_q.length)) {
                  MusicPatchPcmStream.field_q = new boolean[2 * param0];
                }
              } else {
                if (MeshDepthBuckets.field_d.length < param0) {
                  MeshDepthBuckets.field_d = new int[2 * param0];
                  if (PowerupNames.field_b == null ||
                    !(param0 <= PowerupNames.field_b.length)) {
                    PowerupNames.field_b = new int[param0 * 2];
                  }
                  if (null == CutsceneStateHelpers.field_c ||
                    !(CutsceneStateHelpers.field_c.length >= param0 + param2)) {
                    CutsceneStateHelpers.field_c = new int[(param0 + param2) * 2];
                  }
                  if (MusicPatchPcmStream.field_q == null ||
                    !(param0 <= MusicPatchPcmStream.field_q.length)) {
                    MusicPatchPcmStream.field_q = new boolean[2 * param0];
                  }
                } else {
                  if (PowerupNames.field_b == null ||
                    !(param0 <= PowerupNames.field_b.length)) {
                    PowerupNames.field_b = new int[param0 * 2];
                  }
                  if (null == CutsceneStateHelpers.field_c ||
                    !(CutsceneStateHelpers.field_c.length >= param0 + param2)) {
                    CutsceneStateHelpers.field_c = new int[(param0 + param2) * 2];
                  }
                  if (MusicPatchPcmStream.field_q == null) {
                    MusicPatchPcmStream.field_q = new boolean[2 * param0];
                  } else {
                    if (param0 > MusicPatchPcmStream.field_q.length) {
                      MusicPatchPcmStream.field_q = new boolean[2 * param0];
                    }
                  }
                }
              }
            }
          }
        } else {
          if (param0 > Js5Archive.field_g.length) {
            Js5Archive.field_g = new int[2 * param0];
            if (StatefulWidgetRenderer.field_r == null ||
              !(StatefulWidgetRenderer.field_r.length >= param0)) {
              StatefulWidgetRenderer.field_r = new int[2 * param0];
            }
            if (null == ProgressMessageDialog.field_kb) {
              ProgressMessageDialog.field_kb = new int[param0 * 2];
              if (null == MeshDepthBuckets.field_d ||
                !(MeshDepthBuckets.field_d.length >= param0)) {
                MeshDepthBuckets.field_d = new int[2 * param0];
              }
              if (PowerupNames.field_b == null ||
                !(param0 <= PowerupNames.field_b.length)) {
                PowerupNames.field_b = new int[param0 * 2];
              }
              if (null == CutsceneStateHelpers.field_c ||
                !(CutsceneStateHelpers.field_c.length >= param0 + param2)) {
                CutsceneStateHelpers.field_c = new int[(param0 + param2) * 2];
              }
              if (MusicPatchPcmStream.field_q == null ||
                !(param0 <= MusicPatchPcmStream.field_q.length)) {
                MusicPatchPcmStream.field_q = new boolean[2 * param0];
              }
            } else {
              if (param0 > ProgressMessageDialog.field_kb.length) {
                ProgressMessageDialog.field_kb = new int[param0 * 2];
                if (null == MeshDepthBuckets.field_d ||
                  !(MeshDepthBuckets.field_d.length >= param0)) {
                  MeshDepthBuckets.field_d = new int[2 * param0];
                }
                if (PowerupNames.field_b == null ||
                  !(param0 <= PowerupNames.field_b.length)) {
                  PowerupNames.field_b = new int[param0 * 2];
                }
                if (null == CutsceneStateHelpers.field_c ||
                  !(CutsceneStateHelpers.field_c.length >= param0 + param2)) {
                  CutsceneStateHelpers.field_c = new int[(param0 + param2) * 2];
                }
                if (MusicPatchPcmStream.field_q == null ||
                  !(param0 <= MusicPatchPcmStream.field_q.length)) {
                  MusicPatchPcmStream.field_q = new boolean[2 * param0];
                }
              } else {
                if (null == MeshDepthBuckets.field_d) {
                  MeshDepthBuckets.field_d = new int[2 * param0];
                  if (PowerupNames.field_b == null ||
                    !(param0 <= PowerupNames.field_b.length)) {
                    PowerupNames.field_b = new int[param0 * 2];
                  }
                  if (null == CutsceneStateHelpers.field_c ||
                    !(CutsceneStateHelpers.field_c.length >= param0 + param2)) {
                    CutsceneStateHelpers.field_c = new int[(param0 + param2) * 2];
                  }
                  if (MusicPatchPcmStream.field_q == null ||
                    !(param0 <= MusicPatchPcmStream.field_q.length)) {
                    MusicPatchPcmStream.field_q = new boolean[2 * param0];
                  }
                } else {
                  if (MeshDepthBuckets.field_d.length < param0) {
                    MeshDepthBuckets.field_d = new int[2 * param0];
                    if (PowerupNames.field_b == null ||
                      !(param0 <= PowerupNames.field_b.length)) {
                      PowerupNames.field_b = new int[param0 * 2];
                    }
                    if (null == CutsceneStateHelpers.field_c ||
                      !(CutsceneStateHelpers.field_c.length >= param0 + param2)) {
                      CutsceneStateHelpers.field_c = new int[(param0 + param2) * 2];
                    }
                    if (MusicPatchPcmStream.field_q == null ||
                      !(param0 <= MusicPatchPcmStream.field_q.length)) {
                      MusicPatchPcmStream.field_q = new boolean[2 * param0];
                    }
                  } else {
                    if (PowerupNames.field_b == null ||
                      !(param0 <= PowerupNames.field_b.length)) {
                      PowerupNames.field_b = new int[param0 * 2];
                    }
                    if (null == CutsceneStateHelpers.field_c ||
                      !(CutsceneStateHelpers.field_c.length >= param0 + param2)) {
                      CutsceneStateHelpers.field_c = new int[(param0 + param2) * 2];
                    }
                    if (MusicPatchPcmStream.field_q == null) {
                      MusicPatchPcmStream.field_q = new boolean[2 * param0];
                    } else {
                      if (param0 > MusicPatchPcmStream.field_q.length) {
                        MusicPatchPcmStream.field_q = new boolean[2 * param0];
                      }
                    }
                  }
                }
              }
            }
          } else {
            if (StatefulWidgetRenderer.field_r == null ||
              !(StatefulWidgetRenderer.field_r.length >= param0)) {
              StatefulWidgetRenderer.field_r = new int[2 * param0];
            }
            if (null == ProgressMessageDialog.field_kb) {
              ProgressMessageDialog.field_kb = new int[param0 * 2];
              if (null == MeshDepthBuckets.field_d ||
                !(MeshDepthBuckets.field_d.length >= param0)) {
                MeshDepthBuckets.field_d = new int[2 * param0];
              }
              if (PowerupNames.field_b == null ||
                !(param0 <= PowerupNames.field_b.length)) {
                PowerupNames.field_b = new int[param0 * 2];
              }
              if (null == CutsceneStateHelpers.field_c ||
                !(CutsceneStateHelpers.field_c.length >= param0 + param2)) {
                CutsceneStateHelpers.field_c = new int[(param0 + param2) * 2];
              }
              if (MusicPatchPcmStream.field_q == null) {
                MusicPatchPcmStream.field_q = new boolean[2 * param0];
              } else {
                if (param0 > MusicPatchPcmStream.field_q.length) {
                  MusicPatchPcmStream.field_q = new boolean[2 * param0];
                }
              }
            } else {
              if (param0 > ProgressMessageDialog.field_kb.length) {
                ProgressMessageDialog.field_kb = new int[param0 * 2];
                if (null == MeshDepthBuckets.field_d ||
                  !(MeshDepthBuckets.field_d.length >= param0)) {
                  MeshDepthBuckets.field_d = new int[2 * param0];
                }
                if (PowerupNames.field_b == null ||
                  !(param0 <= PowerupNames.field_b.length)) {
                  PowerupNames.field_b = new int[param0 * 2];
                }
                if (null == CutsceneStateHelpers.field_c ||
                  !(CutsceneStateHelpers.field_c.length >= param0 + param2)) {
                  CutsceneStateHelpers.field_c = new int[(param0 + param2) * 2];
                }
                if (MusicPatchPcmStream.field_q == null ||
                  !(param0 <= MusicPatchPcmStream.field_q.length)) {
                  MusicPatchPcmStream.field_q = new boolean[2 * param0];
                }
              } else {
                if (null == MeshDepthBuckets.field_d) {
                  MeshDepthBuckets.field_d = new int[2 * param0];
                  if (PowerupNames.field_b == null ||
                    !(param0 <= PowerupNames.field_b.length)) {
                    PowerupNames.field_b = new int[param0 * 2];
                  }
                  if (null == CutsceneStateHelpers.field_c ||
                    !(CutsceneStateHelpers.field_c.length >= param0 + param2)) {
                    CutsceneStateHelpers.field_c = new int[(param0 + param2) * 2];
                  }
                } else {
                  if (MeshDepthBuckets.field_d.length >= param0) {
                    if (PowerupNames.field_b == null ||
                      !(param0 <= PowerupNames.field_b.length)) {
                      PowerupNames.field_b = new int[param0 * 2];
                    }
                    if (null == CutsceneStateHelpers.field_c ||
                      !(CutsceneStateHelpers.field_c.length >= param0 + param2)) {
                      CutsceneStateHelpers.field_c = new int[(param0 + param2) * 2];
                    }
                  } else {
                    MeshDepthBuckets.field_d = new int[2 * param0];
                    if (PowerupNames.field_b == null ||
                      !(param0 <= PowerupNames.field_b.length)) {
                      PowerupNames.field_b = new int[param0 * 2];
                    }
                    if (null == CutsceneStateHelpers.field_c ||
                      !(CutsceneStateHelpers.field_c.length >= param0 + param2)) {
                      CutsceneStateHelpers.field_c = new int[(param0 + param2) * 2];
                    }
                  }
                }
                if (MusicPatchPcmStream.field_q == null) {
                  MusicPatchPcmStream.field_q = new boolean[2 * param0];
                } else {
                  if (param0 > MusicPatchPcmStream.field_q.length) {
                    MusicPatchPcmStream.field_q = new boolean[2 * param0];
                  }
                }
              }
            }
          }
        }
        LevelHud.field_d = -2147483648;
        if (!param1) {
          field_a = (Sprite[]) null;
        }
        RandomAccessCacheFile.field_e = 0;
        AccountTermsPanel.field_O = 2147483647;
        ProgressMessageDialog.field_pb = 2147483647;
        ArrivingPassenger.field_Db = -2147483648;
    }

    public static void releaseStatics(int param0) {
        int var1 = -81 / ((param0 - 37) / 47);
        field_d = null;
        field_a = null;
        field_b = null;
        field_c = null;
    }

    final static String formatCookieDate(int param0, long param1) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        ReflectionQueueHelpers.field_d.setTime(new Date(param1));
        int var3 = ReflectionQueueHelpers.field_d.get(7);
        int var4 = ReflectionQueueHelpers.field_d.get(5);
        int var5 = ReflectionQueueHelpers.field_d.get(2);
        if (param0 == 2147483647) {
          var6 = ReflectionQueueHelpers.field_d.get(1);
          var7 = ReflectionQueueHelpers.field_d.get(11);
          var8 = ReflectionQueueHelpers.field_d.get(12);
          var9 = ReflectionQueueHelpers.field_d.get(13);
          return DisplayState.field_e[-1 + var3] + ", " + var4 / 10 + var4 % 10 + "-" + TickClock.field_a[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
        }
        return (String) null;
    }

    final static void closeFullscreenFrame(int param0, java.awt.Frame param1, PlatformTaskDispatcher param2) {
        int var3_int = 0;
        AsyncRequest var4 = null;
        int var5 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var5 = ZombieDawn.field_J;
        try {
          var3_int = -100 % ((62 - param0) / 39);
          while (true) {
            var4 = param2.requestFrame(param1, (byte) 52);
            while (var4.status == 0) {
              AlternateLongAndNameCredentials.sleepMillis(10L, (byte) 115);
            }
            if (var4.status != 1) {
              AlternateLongAndNameCredentials.sleepMillis(100L, (byte) 70);
              continue;
            }
            break;
          }
          param1.setVisible(false);
          param1.dispose();
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("jb.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final static String getLoadingStatusText(byte param0) {
        if (2 > AlternateLongAndNameCredentials.field_j) {
          return ContentTransitionDialog.field_V;
        }
        if (GlowAreaSupport.field_i != null) {
          if (!GlowAreaSupport.field_i.isIndexLoaded((byte) 73)) {
            return IntrusiveDequeCursor.field_e;
          }
          return TextAndNameCredentials.field_g;
        }
        if (!IntrusiveDeque.field_d.isIndexLoaded((byte) 73)) {
          return DualLinkNode.field_o;
        }
        if (!IntrusiveDeque.field_d.loadGroupByName(-1, "commonui")) {
          return MarkerSliderPainter.field_m + " - " + IntrusiveDeque.field_d.getGroupProgressByName("commonui", 88) + "%";
        }
        if (param0 >= -49) {
          return (String) null;
        }
        if (!AchievementBanner.field_l.isIndexLoaded((byte) 73)) {
          return PacketRequestHelpers.field_d;
        }
        if (!AchievementBanner.field_l.loadGroupByName(-1, "commonui")) {
          return Bzip2State.field_e + " - " + AchievementBanner.field_l.getGroupProgressByName("commonui", 86) + "%";
        }
        if (!MenuScreen.field_a.isIndexLoaded((byte) 73)) {
          return BitmapTextLayout.field_o;
        }
        if (!MenuScreen.field_a.areAllGroupsLoaded(9001)) {
          return SavedDataRequest.field_p + " - " + MenuScreen.field_a.percentLoaded(-94) + "%";
        }
        return ArchiveIndex.field_l;
    }

    final static boolean isValidNameCharacter(byte param0, char param1) {
        if (param0 == 27) {
          if (Character.isISOControl(param1)) {
            return false;
          }
          if (LoginUiHelpers.isAlphanumeric(param1, 441)) {
            return true;
          }
          if (param1 != 45 &&
            160 != param1 &&
            param1 != 32 &&
            param1 != 95) {
            return false;
          }
          return true;
        }
        SpriteCheckboxPainter.releaseStatics(-97);
        if (Character.isISOControl(param1)) {
          return false;
        }
        if (LoginUiHelpers.isAlphanumeric(param1, 441)) {
          return true;
        }
        if (param1 == 45) {
          return true;
        }
        if (160 == param1) {
          return true;
        }
        if (param1 != 32 &&
          param1 != 95) {
          return false;
        }
        return true;
    }

    static {
        field_d = "By clicking Create, you agree to the <%0><hotspot=0>Terms of Use</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
        field_b = new IntrusiveDeque();
        field_c = "Continue";
    }
}
