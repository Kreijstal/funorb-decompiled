/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MusicPatchEnvelope {
    int field_k;
    static int[] field_f;
    static int field_g;
    int field_c;
    int field_j;
    int field_a;
    int field_b;
    static String field_l;
    byte[] field_d;
    int field_i;
    byte[] field_e;
    int field_h;

    final static void decodeRankingRows(int param0, int param1, byte param2) {
        if (null == GzipDecompressor.field_b ||
          !(GzipDecompressor.field_b.length >= param1)) {
          GzipDecompressor.field_b = new int[2 * param1];
        }
        if (null == DateOfBirthPanel.field_P) {
          DateOfBirthPanel.field_P = new int[param1 * 2];
          if (ScreenSwitchHelpers.field_b == null) {
            ScreenSwitchHelpers.field_b = new int[2 * param1];
            if (ArchiveFactoryHelpers.field_g == null ||
              !(param1 <= ArchiveFactoryHelpers.field_g.length)) {
              ArchiveFactoryHelpers.field_g = new int[param1 * 2];
            }
            if (null == AlternateLongAndTextCredentials.field_n ||
              !(AlternateLongAndTextCredentials.field_n.length >= param1)) {
              AlternateLongAndTextCredentials.field_n = new int[2 * param1];
            }
            if (null == MusicTrackHelpers.field_b ||
              !(param1 <= MusicTrackHelpers.field_b.length)) {
              MusicTrackHelpers.field_b = new int[2 * param1];
            }
            if (DialWidget.field_W == null ||
              !(param0 + param1 <= DialWidget.field_W.length)) {
              DialWidget.field_W = new int[2 * (param0 + param1)];
            }
            if (WidgetNode.field_w == null ||
              !(WidgetNode.field_w.length >= param1)) {
              WidgetNode.field_w = new boolean[2 * param1];
            }
          } else {
            if (param1 <= ScreenSwitchHelpers.field_b.length) {
              if (ArchiveFactoryHelpers.field_g == null ||
                !(param1 <= ArchiveFactoryHelpers.field_g.length)) {
                ArchiveFactoryHelpers.field_g = new int[param1 * 2];
              }
              if (null == AlternateLongAndTextCredentials.field_n ||
                !(AlternateLongAndTextCredentials.field_n.length >= param1)) {
                AlternateLongAndTextCredentials.field_n = new int[2 * param1];
              }
              if (null == MusicTrackHelpers.field_b ||
                !(param1 <= MusicTrackHelpers.field_b.length)) {
                MusicTrackHelpers.field_b = new int[2 * param1];
              }
              if (DialWidget.field_W == null ||
                !(param0 + param1 <= DialWidget.field_W.length)) {
                DialWidget.field_W = new int[2 * (param0 + param1)];
              }
              if (WidgetNode.field_w == null ||
                !(WidgetNode.field_w.length >= param1)) {
                WidgetNode.field_w = new boolean[2 * param1];
              }
            } else {
              ScreenSwitchHelpers.field_b = new int[2 * param1];
              if (ArchiveFactoryHelpers.field_g == null ||
                !(param1 <= ArchiveFactoryHelpers.field_g.length)) {
                ArchiveFactoryHelpers.field_g = new int[param1 * 2];
              }
              if (null == AlternateLongAndTextCredentials.field_n) {
                AlternateLongAndTextCredentials.field_n = new int[2 * param1];
                if (null == MusicTrackHelpers.field_b ||
                  !(param1 <= MusicTrackHelpers.field_b.length)) {
                  MusicTrackHelpers.field_b = new int[2 * param1];
                }
                if (DialWidget.field_W == null ||
                  !(param0 + param1 <= DialWidget.field_W.length)) {
                  DialWidget.field_W = new int[2 * (param0 + param1)];
                }
                if (WidgetNode.field_w == null ||
                  !(WidgetNode.field_w.length >= param1)) {
                  WidgetNode.field_w = new boolean[2 * param1];
                }
              } else {
                if (AlternateLongAndTextCredentials.field_n.length >= param1) {
                  if (null == MusicTrackHelpers.field_b ||
                    !(param1 <= MusicTrackHelpers.field_b.length)) {
                    MusicTrackHelpers.field_b = new int[2 * param1];
                  }
                  if (DialWidget.field_W == null ||
                    !(param0 + param1 <= DialWidget.field_W.length)) {
                    DialWidget.field_W = new int[2 * (param0 + param1)];
                  }
                  if (WidgetNode.field_w == null ||
                    !(WidgetNode.field_w.length >= param1)) {
                    WidgetNode.field_w = new boolean[2 * param1];
                  }
                } else {
                  AlternateLongAndTextCredentials.field_n = new int[2 * param1];
                  if (null == MusicTrackHelpers.field_b ||
                    !(param1 <= MusicTrackHelpers.field_b.length)) {
                    MusicTrackHelpers.field_b = new int[2 * param1];
                  }
                  if (DialWidget.field_W == null ||
                    !(param0 + param1 <= DialWidget.field_W.length)) {
                    DialWidget.field_W = new int[2 * (param0 + param1)];
                  }
                  if (WidgetNode.field_w == null ||
                    !(WidgetNode.field_w.length >= param1)) {
                    WidgetNode.field_w = new boolean[2 * param1];
                  }
                }
              }
            }
          }
        } else {
          if (DateOfBirthPanel.field_P.length < param1) {
            DateOfBirthPanel.field_P = new int[param1 * 2];
            if (ScreenSwitchHelpers.field_b == null ||
              !(param1 <= ScreenSwitchHelpers.field_b.length)) {
              ScreenSwitchHelpers.field_b = new int[2 * param1];
            }
            if (ArchiveFactoryHelpers.field_g == null ||
              !(param1 <= ArchiveFactoryHelpers.field_g.length)) {
              ArchiveFactoryHelpers.field_g = new int[param1 * 2];
            }
            if (null == AlternateLongAndTextCredentials.field_n ||
              !(AlternateLongAndTextCredentials.field_n.length >= param1)) {
              AlternateLongAndTextCredentials.field_n = new int[2 * param1];
            }
            if (null == MusicTrackHelpers.field_b ||
              !(param1 <= MusicTrackHelpers.field_b.length)) {
              MusicTrackHelpers.field_b = new int[2 * param1];
            }
            if (DialWidget.field_W == null ||
              !(param0 + param1 <= DialWidget.field_W.length)) {
              DialWidget.field_W = new int[2 * (param0 + param1)];
            }
            if (WidgetNode.field_w == null ||
              !(WidgetNode.field_w.length >= param1)) {
              WidgetNode.field_w = new boolean[2 * param1];
            }
          } else {
            if (ScreenSwitchHelpers.field_b == null) {
              ScreenSwitchHelpers.field_b = new int[2 * param1];
              if (ArchiveFactoryHelpers.field_g == null ||
                !(param1 <= ArchiveFactoryHelpers.field_g.length)) {
                ArchiveFactoryHelpers.field_g = new int[param1 * 2];
              }
              if (null == AlternateLongAndTextCredentials.field_n) {
                AlternateLongAndTextCredentials.field_n = new int[2 * param1];
                if (null == MusicTrackHelpers.field_b ||
                  !(param1 <= MusicTrackHelpers.field_b.length)) {
                  MusicTrackHelpers.field_b = new int[2 * param1];
                }
                if (DialWidget.field_W == null ||
                  !(param0 + param1 <= DialWidget.field_W.length)) {
                  DialWidget.field_W = new int[2 * (param0 + param1)];
                }
                if (WidgetNode.field_w == null ||
                  !(WidgetNode.field_w.length >= param1)) {
                  WidgetNode.field_w = new boolean[2 * param1];
                }
              } else {
                if (AlternateLongAndTextCredentials.field_n.length >= param1) {
                  if (null == MusicTrackHelpers.field_b ||
                    !(param1 <= MusicTrackHelpers.field_b.length)) {
                    MusicTrackHelpers.field_b = new int[2 * param1];
                  }
                  if (DialWidget.field_W == null ||
                    !(param0 + param1 <= DialWidget.field_W.length)) {
                    DialWidget.field_W = new int[2 * (param0 + param1)];
                  }
                  if (WidgetNode.field_w == null ||
                    !(WidgetNode.field_w.length >= param1)) {
                    WidgetNode.field_w = new boolean[2 * param1];
                  }
                } else {
                  AlternateLongAndTextCredentials.field_n = new int[2 * param1];
                  if (null == MusicTrackHelpers.field_b ||
                    !(param1 <= MusicTrackHelpers.field_b.length)) {
                    MusicTrackHelpers.field_b = new int[2 * param1];
                  }
                  if (DialWidget.field_W == null ||
                    !(param0 + param1 <= DialWidget.field_W.length)) {
                    DialWidget.field_W = new int[2 * (param0 + param1)];
                  }
                  if (WidgetNode.field_w == null ||
                    !(WidgetNode.field_w.length >= param1)) {
                    WidgetNode.field_w = new boolean[2 * param1];
                  }
                }
              }
            } else {
              if (param1 <= ScreenSwitchHelpers.field_b.length) {
                if (ArchiveFactoryHelpers.field_g == null ||
                  !(param1 <= ArchiveFactoryHelpers.field_g.length)) {
                  ArchiveFactoryHelpers.field_g = new int[param1 * 2];
                }
                if (null == AlternateLongAndTextCredentials.field_n) {
                  AlternateLongAndTextCredentials.field_n = new int[2 * param1];
                  if (null == MusicTrackHelpers.field_b ||
                    !(param1 <= MusicTrackHelpers.field_b.length)) {
                    MusicTrackHelpers.field_b = new int[2 * param1];
                  }
                  if (DialWidget.field_W == null ||
                    !(param0 + param1 <= DialWidget.field_W.length)) {
                    DialWidget.field_W = new int[2 * (param0 + param1)];
                  }
                  if (WidgetNode.field_w == null ||
                    !(WidgetNode.field_w.length >= param1)) {
                    WidgetNode.field_w = new boolean[2 * param1];
                  }
                } else {
                  if (AlternateLongAndTextCredentials.field_n.length >= param1) {
                    if (null == MusicTrackHelpers.field_b ||
                      !(param1 <= MusicTrackHelpers.field_b.length)) {
                      MusicTrackHelpers.field_b = new int[2 * param1];
                    }
                    if (DialWidget.field_W == null ||
                      !(param0 + param1 <= DialWidget.field_W.length)) {
                      DialWidget.field_W = new int[2 * (param0 + param1)];
                    }
                    if (WidgetNode.field_w == null ||
                      !(WidgetNode.field_w.length >= param1)) {
                      WidgetNode.field_w = new boolean[2 * param1];
                    }
                  } else {
                    AlternateLongAndTextCredentials.field_n = new int[2 * param1];
                    if (null == MusicTrackHelpers.field_b ||
                      !(param1 <= MusicTrackHelpers.field_b.length)) {
                      MusicTrackHelpers.field_b = new int[2 * param1];
                    }
                    if (DialWidget.field_W == null ||
                      !(param0 + param1 <= DialWidget.field_W.length)) {
                      DialWidget.field_W = new int[2 * (param0 + param1)];
                    }
                    if (WidgetNode.field_w == null ||
                      !(WidgetNode.field_w.length >= param1)) {
                      WidgetNode.field_w = new boolean[2 * param1];
                    }
                  }
                }
              } else {
                ScreenSwitchHelpers.field_b = new int[2 * param1];
                if (ArchiveFactoryHelpers.field_g == null ||
                  !(param1 <= ArchiveFactoryHelpers.field_g.length)) {
                  ArchiveFactoryHelpers.field_g = new int[param1 * 2];
                }
                if (null == AlternateLongAndTextCredentials.field_n) {
                  AlternateLongAndTextCredentials.field_n = new int[2 * param1];
                  if (null == MusicTrackHelpers.field_b ||
                    !(param1 <= MusicTrackHelpers.field_b.length)) {
                    MusicTrackHelpers.field_b = new int[2 * param1];
                  }
                  if (DialWidget.field_W == null ||
                    !(param0 + param1 <= DialWidget.field_W.length)) {
                    DialWidget.field_W = new int[2 * (param0 + param1)];
                  }
                  if (WidgetNode.field_w == null ||
                    !(WidgetNode.field_w.length >= param1)) {
                    WidgetNode.field_w = new boolean[2 * param1];
                  }
                } else {
                  if (AlternateLongAndTextCredentials.field_n.length >= param1) {
                    if (null == MusicTrackHelpers.field_b ||
                      !(param1 <= MusicTrackHelpers.field_b.length)) {
                      MusicTrackHelpers.field_b = new int[2 * param1];
                    }
                    if (DialWidget.field_W == null ||
                      !(param0 + param1 <= DialWidget.field_W.length)) {
                      DialWidget.field_W = new int[2 * (param0 + param1)];
                    }
                    if (WidgetNode.field_w == null ||
                      !(WidgetNode.field_w.length >= param1)) {
                      WidgetNode.field_w = new boolean[2 * param1];
                    }
                  } else {
                    AlternateLongAndTextCredentials.field_n = new int[2 * param1];
                    if (null == MusicTrackHelpers.field_b ||
                      !(param1 <= MusicTrackHelpers.field_b.length)) {
                      MusicTrackHelpers.field_b = new int[2 * param1];
                    }
                    if (DialWidget.field_W == null ||
                      !(param0 + param1 <= DialWidget.field_W.length)) {
                      DialWidget.field_W = new int[2 * (param0 + param1)];
                    }
                    if (WidgetNode.field_w == null ||
                      !(WidgetNode.field_w.length >= param1)) {
                      WidgetNode.field_w = new boolean[2 * param1];
                    }
                  }
                }
              }
            }
          }
        }
        QuickChatHelpDialog.field_Mb = 0;
        ArchiveFactoryHelpers.field_h = 2147483647;
        if (param2 != 71) {
          return;
        }
        GameRoomPanelHelpers.field_d = 2147483647;
        QueuedStatSubmission.field_s = -2147483648;
        TextHighlightSpan.field_z = -2147483648;
    }

    public static void releaseStatics(int param0) {
        if (param0 != 2) {
          field_l = (String) null;
          field_l = null;
          field_f = null;
          return;
        }
        field_l = null;
        field_f = null;
    }

    static {
        field_l = "Return to game";
    }
}
